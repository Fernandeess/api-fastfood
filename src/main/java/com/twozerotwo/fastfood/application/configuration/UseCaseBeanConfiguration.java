package com.twozerotwo.fastfood.application.configuration;

import com.twozerotwo.fastfood.adapters.driven.persistence.repository.CustomerRepositoryAdapter;
import com.twozerotwo.fastfood.core.services.CreateCustomerServiceImpl;
import com.twozerotwo.fastfood.core.usecases.CreateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseBeanConfiguration {

    @Bean
    public CreateCustomerUseCase createCustomerUseCase(CustomerRepositoryAdapter customerRepositoryAdapter){
        return new CreateCustomerServiceImpl(customerRepositoryAdapter);
    }


}
