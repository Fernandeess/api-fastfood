package com.twozerotwo.fastfood.core.ports;

import com.twozerotwo.fastfood.core.domain.Product;

public interface ProductRepositoryPort {
    public Product save(Product product);
}
