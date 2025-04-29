package com.twozerotwo.fastfood.adapters.driver.controller.dto.response;

import lombok.Builder;

import java.util.UUID;

@Builder
public record CustomerResponse(
        UUID id,
        String name,
        String email
) {
}
