package com.twozerotwo.fastfood.application.mappers;

import com.twozerotwo.fastfood.adapters.driven.persistence.entity.CustomerEntity;
import com.twozerotwo.fastfood.adapters.driver.controller.dto.request.CustomerRequest;
import com.twozerotwo.fastfood.adapters.driver.controller.dto.response.CustomerResponse;
import com.twozerotwo.fastfood.adapters.driver.controller.dto.response.CustomerResponseCpf;
import com.twozerotwo.fastfood.core.domain.Customer;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CustomerMapper {

    public static CustomerEntity toEntity(Customer customer) {
        return CustomerEntity
                .builder()
                .id(customer.getId())
                .cpf(customer.getCpf())
                .orderList(
                        customer
                                .getOrderList()
                                .stream()
                                .map(OrderMapper::toEntity)
                                .toList()
                )
                .build();
    }

    public static Customer toDomain(CustomerEntity entity) {
        return new Customer.Builder()
                .id(entity.getId())
                .cpf(entity.getCpf())
                .name(entity.getName())
                .email(entity.getEmail())
                .orderList(entity.getOrderList().stream().map(OrderMapper::toDomain).toList())
                .build();
    }

    public static Customer toDomain(CustomerRequest customerRequest) {
        return new Customer.Builder()
                .name(customerRequest.name())
                .email(customerRequest.email())
                .build();
    }

    public static CustomerResponse toResponse(Customer customer) {
        return CustomerResponse.builder()
                .id(customer.getId())
                .email(customer.getEmail())
                .name(customer.getName())
                .build();
    }

    public static CustomerResponseCpf toResponseCpf(Customer customer) {
        return CustomerResponseCpf.builder()
                .cpf(customer.getCpf())
                .build();
    }

}

