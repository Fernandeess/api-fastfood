package com.twozerotwo.fastfood.core.enums;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Category {
    LANCHES,
    ACOMPANHAMENTOS,
    BEBIDAS,
    SOBREMESAS;

    @JsonCreator
    public static Category fromString(String value) {
        for (Category category : Category.values()) {
            if (category.name().equalsIgnoreCase(value)) {
                return category;
            }
        }
        throw new IllegalArgumentException(" Categoria inválida: " + value);
    }

}
