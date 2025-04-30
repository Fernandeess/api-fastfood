package com.twozerotwo.fastfood.adapters.driver.controller;

import com.twozerotwo.fastfood.adapters.driver.controller.dto.request.ProductRequest;
import com.twozerotwo.fastfood.adapters.driver.controller.dto.response.ProductResponse;
import com.twozerotwo.fastfood.application.mappers.ProductMapper;
import com.twozerotwo.fastfood.core.domain.Product;
import com.twozerotwo.fastfood.core.usecases.CreateProductUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/product")
public class ProductController {

    private final CreateProductUseCase createProductUseCase;

    public ProductController(CreateProductUseCase createProductUseCase) {
        this.createProductUseCase = createProductUseCase;
    }

    @PostMapping
    public ResponseEntity<ProductResponse> createProduct(@RequestBody @Validated ProductRequest productRequest) {
        Product productCreated = createProductUseCase.execute(ProductMapper.toDomain(productRequest));
        return ResponseEntity.status(201).body(ProductMapper.toResponse(productCreated));
    }

}
