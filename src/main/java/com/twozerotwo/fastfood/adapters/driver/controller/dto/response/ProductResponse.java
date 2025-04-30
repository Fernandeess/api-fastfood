package com.twozerotwo.fastfood.adapters.driver.controller.dto.response;

import com.twozerotwo.fastfood.core.enums.Category;
import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record ProductResponse(
        Long id,
        String name,
        String urlImage,
        BigDecimal unitPrice,
        Category category
) {
}
