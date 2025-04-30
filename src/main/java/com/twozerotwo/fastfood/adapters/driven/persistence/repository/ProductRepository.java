package com.twozerotwo.fastfood.adapters.driven.persistence.repository;

import com.twozerotwo.fastfood.adapters.driven.persistence.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
