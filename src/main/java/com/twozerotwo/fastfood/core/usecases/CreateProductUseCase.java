package com.twozerotwo.fastfood.core.usecases;

import com.twozerotwo.fastfood.core.domain.Product;

public interface CreateProductUseCase {
    Product execute(Product product);
}
