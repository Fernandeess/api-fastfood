package com.twozerotwo.fastfood.application.mappers;

import com.twozerotwo.fastfood.adapters.driven.persistence.entity.CustomerEntity;
import com.twozerotwo.fastfood.adapters.driver.controller.dto.request.CustomerRequest;
import com.twozerotwo.fastfood.adapters.driver.controller.dto.response.CustomerResponse;
import com.twozerotwo.fastfood.core.domain.Customer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class CustomerMapper {

    public CustomerEntity toEntity(Customer customer) {
        if (customer == null) {
            return null;
        }

        return new CustomerEntity(
                customer.getId(),
                customer.getName(),
                customer.getEmail()
        );
    }

    public Customer toModel(CustomerEntity entity) {
        if (entity == null) {
            return null;
        }

        return new Customer(
                entity.getId(),
                entity.getName(),
                entity.getEmail(),
                new ArrayList<>()
        );
    }

    public Customer toModel(CustomerRequest customerRequest) {
        return new Customer(null,customerRequest.name(), customerRequest.email(), new ArrayList<>());
    }

    public CustomerResponse toResponse(Customer customer) {
        if (customer == null) {
            return null;
        }
        return new CustomerResponse(customer.getId(), customer.getName(), customer.getEmail());
    }
}

