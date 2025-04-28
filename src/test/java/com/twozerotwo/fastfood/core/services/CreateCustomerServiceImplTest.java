 package com.twozerotwo.fastfood.core.services;

import static com.twozerotwo.fastfood.common.CustomerConstants.CUSTOMER;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import com.twozerotwo.fastfood.adapters.driven.persistence.repository.CustomerRepositoryAdapter;
import com.twozerotwo.fastfood.core.domain.Customer;
import org.junit.jupiter.api.Test;
 import org.junit.jupiter.api.extension.ExtendWith;
 import org.mockito.InjectMocks;
 import org.mockito.Mock;
 import org.mockito.junit.jupiter.MockitoExtension;

 @ExtendWith(MockitoExtension.class)
class CreateCustomerServiceImplTest {

    @InjectMocks
    private CreateCustomerServiceImpl createCustomerUseCase;

    @Mock
    private CustomerRepositoryAdapter customerRepositoryPort;

    @Test
    void createCustomer_WithValidData_ReturnsCustomer() {
        // Arrange
        when(customerRepositoryPort.save(CUSTOMER)).thenReturn(CUSTOMER);
        Customer result = createCustomerUseCase.execute(CUSTOMER);
        // Assert
        verify(customerRepositoryPort,atLeast(1)).save(CUSTOMER);
        assertEquals(CUSTOMER, result);
    }
}

