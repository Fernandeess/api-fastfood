package com.twozerotwo.fastfood.application.mappers;

import com.twozerotwo.fastfood.adapters.driven.persistence.entity.ProductEntity;
import com.twozerotwo.fastfood.adapters.driver.controller.dto.request.ProductRequest;
import com.twozerotwo.fastfood.adapters.driver.controller.dto.response.ProductResponse;
import com.twozerotwo.fastfood.core.domain.Product;

public class ProductMapper {
    public static ProductEntity toEntity(Product product) {
        new ProductEntity();
        return ProductEntity
                .builder()
                .id(product.getId())
                .name(product.getName())
                .category(product.getCategory())
                .unitPrice(product.getUnitPrice())
                .UrlImage(product.getUrlImage())
                .build();
    }

    public static Product toDomain(ProductEntity productEntity) {
        return new Product.Builder()
                .id(productEntity.getId())
                .name(productEntity.getName())
                .category(productEntity.getCategory())
                .unitPrice(productEntity.getUnitPrice())
                .urlImage(productEntity.getUrlImage())
                .build();
    }

    public static Product toDomain(ProductRequest productRequest) {
        return new Product.Builder()
                .name(productRequest.name())
                .category(productRequest.category())
                .unitPrice(productRequest.unitPrice())
                .urlImage(productRequest.urlImage())
                .build();
    }

    public static ProductResponse toResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .category(product.getCategory())
                .urlImage(product.getUrlImage())
                .name(product.getName())
                .unitPrice(product.getUnitPrice())
                .build();
    }
}
