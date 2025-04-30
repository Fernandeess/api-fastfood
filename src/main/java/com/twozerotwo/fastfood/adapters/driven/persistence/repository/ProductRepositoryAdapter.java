package com.twozerotwo.fastfood.adapters.driven.persistence.repository;

import com.twozerotwo.fastfood.adapters.driven.persistence.entity.ProductEntity;
import com.twozerotwo.fastfood.application.mappers.ProductMapper;
import com.twozerotwo.fastfood.core.domain.Product;
import com.twozerotwo.fastfood.core.ports.ProductRepositoryPort;
import org.springframework.stereotype.Component;

@Component
public class ProductRepositoryAdapter implements ProductRepositoryPort {
    private final ProductRepository productRepository;

    public ProductRepositoryAdapter(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product save(Product product) {
        ProductEntity productEntity = ProductMapper.toEntity(product);
        ProductEntity save = productRepository.save(productEntity);
        return ProductMapper.toDomain(save);
    }
}
