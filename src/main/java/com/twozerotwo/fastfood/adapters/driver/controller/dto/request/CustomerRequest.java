package com.twozerotwo.fastfood.adapters.driver.controller.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record CustomerRequest(
        @NotBlank
        String name,
        @Email(message = "deve ser um endereço de e-mail válido")
        String email
) {
}
