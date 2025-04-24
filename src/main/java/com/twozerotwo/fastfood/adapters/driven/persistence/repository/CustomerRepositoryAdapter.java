package com.twozerotwo.fastfood.adapters.driven.persistence.repository;

import com.twozerotwo.fastfood.adapters.driven.persistence.entity.CustomerEntity;
import com.twozerotwo.fastfood.application.mappers.CustomerMapper;
import com.twozerotwo.fastfood.core.domain.Customer;
import com.twozerotwo.fastfood.core.exceptions.EmailAlreadyExistsException;
import com.twozerotwo.fastfood.core.ports.CustomerRepositoryPort;
import org.springframework.stereotype.Component;

@Component
public class CustomerRepositoryAdapter implements CustomerRepositoryPort {

    private final CustomerMapper customerMapper;
    private final CustomerRepository customerRepository;

    public CustomerRepositoryAdapter(CustomerMapper customerMapper, CustomerRepository customerRepository) {
        this.customerMapper = customerMapper;
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        CustomerEntity customerEntity = customerMapper.toEntity(customer);

        customerRepository.findByEmail(customer.getEmail()).ifPresent(
                existing -> {
                    throw new EmailAlreadyExistsException("This email address is already in use.");
                }
        );

        CustomerEntity savedCustomer = customerRepository.save(customerEntity);
        return customerMapper.toModel(savedCustomer);
    }
}
