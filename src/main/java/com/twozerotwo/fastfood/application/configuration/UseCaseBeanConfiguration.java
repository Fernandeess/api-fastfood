package com.twozerotwo.fastfood.application.configuration;

import com.twozerotwo.fastfood.core.ports.CustomerRepositoryPort;
import com.twozerotwo.fastfood.core.ports.ProductRepositoryPort;
import com.twozerotwo.fastfood.core.services.CreateCustomerCpfServiceImpl;
import com.twozerotwo.fastfood.core.services.CreateCustomerServiceImpl;
import com.twozerotwo.fastfood.core.services.CreateProductServiceImpl;
import com.twozerotwo.fastfood.core.usecases.CreateCustomerCpfUseCase;
import com.twozerotwo.fastfood.core.usecases.CreateCustomerUseCase;
import com.twozerotwo.fastfood.core.usecases.CreateProductUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseBeanConfiguration {

    @Bean
    public CreateCustomerUseCase createCustomerUseCase(CustomerRepositoryPort customerRepositoryAdapter){
        return new CreateCustomerServiceImpl(customerRepositoryAdapter);
    }

    @Bean
    public CreateCustomerCpfUseCase createCustomerCpfUseCase(CustomerRepositoryPort customerRepositoryAdapter){
        return new CreateCustomerCpfServiceImpl(customerRepositoryAdapter);
    }

    @Bean
    public CreateProductUseCase createProductUseCase(ProductRepositoryPort productRepositoryPort) {
        return new CreateProductServiceImpl(productRepositoryPort);
    }

}
