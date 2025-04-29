package com.twozerotwo.fastfood.core.services;

import com.twozerotwo.fastfood.core.domain.Customer;
import com.twozerotwo.fastfood.core.ports.CustomerRepositoryPort;
import com.twozerotwo.fastfood.core.usecases.CreateCustomerCpfUseCase;

public class CreateCustomerCpfServiceImpl implements CreateCustomerCpfUseCase {

    private final CustomerRepositoryPort customerRepository ;

    public CreateCustomerCpfServiceImpl(CustomerRepositoryPort customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer execute(String cpf) {
        String cpfFormatted = cpf.replaceAll("[^\\d]", "");
        return customerRepository.save(new Customer.Builder().cpf(cpfFormatted).build());
    }
}
