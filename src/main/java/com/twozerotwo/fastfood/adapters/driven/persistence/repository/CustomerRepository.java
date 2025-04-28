package com.twozerotwo.fastfood.adapters.driven.persistence.repository;

import com.twozerotwo.fastfood.adapters.driven.persistence.entity.CustomerEntity;
import com.twozerotwo.fastfood.core.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity,Long> {
    Optional<CustomerEntity> findByEmail(String email);
}
