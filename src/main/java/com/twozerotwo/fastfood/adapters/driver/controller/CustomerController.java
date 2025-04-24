package com.twozerotwo.fastfood.adapters.driver.controller;

import com.twozerotwo.fastfood.adapters.driver.controller.dto.request.CustomerRequest;
import com.twozerotwo.fastfood.adapters.driver.controller.dto.response.CustomerResponse;
import com.twozerotwo.fastfood.application.mappers.CustomerMapper;
import com.twozerotwo.fastfood.core.domain.Customer;
import com.twozerotwo.fastfood.core.usecases.CreateCustomerUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    private final CreateCustomerUseCase createCustomerUseCase;
    private final CustomerMapper customerMapper;

    public CustomerController(CreateCustomerUseCase createCustomerUseCase, CustomerMapper customerMapper) {
        this.createCustomerUseCase = createCustomerUseCase;
        this.customerMapper = customerMapper;
    }

    @PostMapping
    public ResponseEntity<CustomerResponse> createCustomer(@RequestBody CustomerRequest customerRequest){
        Customer model = customerMapper.toModel(customerRequest);
        Customer execute = createCustomerUseCase.execute(model);
        return ResponseEntity.status(201).body(customerMapper.toResponse(execute));
    }

}
