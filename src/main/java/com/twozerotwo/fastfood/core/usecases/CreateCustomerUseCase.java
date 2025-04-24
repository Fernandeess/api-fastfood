package com.twozerotwo.fastfood.core.usecases;

import com.twozerotwo.fastfood.core.domain.Customer;

public interface CreateCustomerUseCase {
    Customer execute(Customer customer);
}
