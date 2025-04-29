package com.twozerotwo.fastfood.adapters.driver.controller;

import com.twozerotwo.fastfood.adapters.driver.controller.dto.request.CustomerCpfRequest;
import com.twozerotwo.fastfood.adapters.driver.controller.dto.request.CustomerRequest;
import com.twozerotwo.fastfood.adapters.driver.controller.dto.response.CustomerResponse;
import com.twozerotwo.fastfood.adapters.driver.controller.dto.response.CustomerResponseCpf;
import com.twozerotwo.fastfood.application.mappers.CustomerMapper;
import com.twozerotwo.fastfood.core.domain.Customer;
import com.twozerotwo.fastfood.core.exceptions.EmailAlreadyExistsException;
import com.twozerotwo.fastfood.core.usecases.CreateCustomerCpfUseCase;
import com.twozerotwo.fastfood.core.usecases.CreateCustomerUseCase;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    private final CreateCustomerUseCase createCustomerUseCase;
    private final CreateCustomerCpfUseCase createCustomerCpfUseCase;
    private final CustomerMapper customerMapper;

    public CustomerController(CreateCustomerUseCase createCustomerUseCase, CreateCustomerCpfUseCase createCustomerCpfUseCase, CustomerMapper customerMapper) {
        this.createCustomerUseCase = createCustomerUseCase;
        this.createCustomerCpfUseCase = createCustomerCpfUseCase;
        this.customerMapper = customerMapper;
    }

    @PostMapping
    public ResponseEntity<CustomerResponse> createCustomer(@RequestBody @Validated CustomerRequest customerRequest) {
        try {
            Customer customerResponse = createCustomerUseCase.execute(customerMapper.toModel(customerRequest));
            return ResponseEntity.status(201).body(customerMapper.toResponse(customerResponse));
        } catch (DataIntegrityViolationException dataIntegrityViolationException) {
            throw new EmailAlreadyExistsException("Não foi possível concluir o cadastro. Verifique os dados informados.");
        }
    }

    @PostMapping("cpf") ResponseEntity<CustomerResponseCpf> createCustomer(@RequestBody @Validated CustomerCpfRequest customerCpfRequest){
        Customer cosutumerCreated = createCustomerCpfUseCase.execute(customerCpfRequest.cpf());
        return ResponseEntity.status(201).body(customerMapper.toResponseCpf(cosutumerCreated));
    }

}
