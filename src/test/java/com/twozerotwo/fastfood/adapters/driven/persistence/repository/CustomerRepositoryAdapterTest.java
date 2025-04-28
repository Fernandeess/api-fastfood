package com.twozerotwo.fastfood.adapters.driven.persistence.repository;

import com.twozerotwo.fastfood.application.mappers.CustomerMapper;
import com.twozerotwo.fastfood.core.domain.Customer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.twozerotwo.fastfood.common.CustomerConstants.CUSTOMER;
import static com.twozerotwo.fastfood.common.CustomerConstants.CUSTOMER_ENTITY;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CustomerRepositoryAdapterTest {

    @Mock
    CustomerMapper customerMapper;
    @Mock
    CustomerRepository customerRepository;

    @InjectMocks
    CustomerRepositoryAdapter customerRepositoryAdapter;


    @Test
    void save_ShouldSaveCustomerSuccessfully() {
        // Arrange

        when(customerMapper.toEntity(CUSTOMER)).thenReturn(CUSTOMER_ENTITY);
        when(customerRepository.save(CUSTOMER_ENTITY)).thenReturn(CUSTOMER_ENTITY);
        when(customerMapper.toModel(CUSTOMER_ENTITY)).thenReturn(CUSTOMER);

        // Act
        Customer result = customerRepositoryAdapter.save(CUSTOMER);

        // Assert
        assertNotNull(result);
        assertEquals(CUSTOMER, result);

        verify(customerMapper, times(1)).toEntity(CUSTOMER);
        verify(customerRepository, times(1)).save(CUSTOMER_ENTITY);
        verify(customerMapper, times(1)).toModel(CUSTOMER_ENTITY);
    }








  
}