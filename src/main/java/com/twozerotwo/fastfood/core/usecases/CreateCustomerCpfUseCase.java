package com.twozerotwo.fastfood.core.usecases;

import com.twozerotwo.fastfood.core.domain.Customer;

public interface CreateCustomerCpfUseCase {
     Customer execute(String cpf);
}
