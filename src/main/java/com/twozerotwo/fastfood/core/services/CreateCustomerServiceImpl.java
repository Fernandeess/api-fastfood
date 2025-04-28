package com.twozerotwo.fastfood.core.services;

import com.twozerotwo.fastfood.core.domain.Customer;
import com.twozerotwo.fastfood.core.ports.CustomerRepositoryPort;
import com.twozerotwo.fastfood.core.usecases.CreateCustomerUseCase;

public class CreateCustomerServiceImpl implements CreateCustomerUseCase {

    private final CustomerRepositoryPort customerRepository ;

    public CreateCustomerServiceImpl(CustomerRepositoryPort customerRepository){
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer execute(Customer customer) {
        return customerRepository.save(customer);
    }
}
