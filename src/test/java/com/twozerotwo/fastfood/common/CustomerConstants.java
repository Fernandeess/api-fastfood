package com.twozerotwo.fastfood.common;

import com.twozerotwo.fastfood.adapters.driven.persistence.entity.CustomerEntity;
import com.twozerotwo.fastfood.core.domain.Customer;

import java.util.ArrayList;

public class CustomerConstants {

    public static final Customer CUSTOMER = new Customer(1L,"Matheus","rodrigTeste@gmail.com",new ArrayList<>());
    public static final Customer INVALID_CUSTOMER = new Customer(null,"","",new ArrayList<>());
    public static final CustomerEntity CUSTOMER_ENTITY = new CustomerEntity(1L,"Matheus","rodrigTeste@gmail.com","" );
}
