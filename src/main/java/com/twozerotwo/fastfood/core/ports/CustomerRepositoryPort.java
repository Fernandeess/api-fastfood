package com.twozerotwo.fastfood.core.ports;

import com.twozerotwo.fastfood.core.domain.Customer;

public interface CustomerRepositoryPort {

    Customer createCustomer(Customer customer);

}
