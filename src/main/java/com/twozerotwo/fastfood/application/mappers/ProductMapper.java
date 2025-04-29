package com.twozerotwo.fastfood.application.mappers;

import com.twozerotwo.fastfood.adapters.driven.persistence.entity.ProductEntity;
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


}
