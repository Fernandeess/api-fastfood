package com.twozerotwo.fastfood.adapters.driver.controller.dto.request;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;

public record CustomerCpfRequest(
        @CPF
        @NotBlank
        String cpf
) {

}
