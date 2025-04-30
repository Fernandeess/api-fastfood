package com.twozerotwo.fastfood.adapters.driver.controller.dto.request;

import com.twozerotwo.fastfood.core.enums.Category;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;

public record ProductRequest(
        @NotBlank
        String name,
        @NotBlank
        String urlImage,
        @PositiveOrZero
        BigDecimal unitPrice,
        @Enumerated @NotNull
        Category category
) {
}
