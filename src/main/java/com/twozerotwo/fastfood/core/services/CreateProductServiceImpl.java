package com.twozerotwo.fastfood.core.services;

import com.twozerotwo.fastfood.core.domain.Product;
import com.twozerotwo.fastfood.core.ports.ProductRepositoryPort;
import com.twozerotwo.fastfood.core.usecases.CreateProductUseCase;

public class CreateProductServiceImpl implements CreateProductUseCase {

    private final ProductRepositoryPort productRepositoryPort;

    public CreateProductServiceImpl(ProductRepositoryPort productRepositoryPort) {
        this.productRepositoryPort = productRepositoryPort;
    }

    @Override
    public Product execute(Product product) {
        return productRepositoryPort.save(product);
    }
}
