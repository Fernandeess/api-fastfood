package com.twozerotwo.fastfood.adapters.driven.persistence.entity;

import com.twozerotwo.fastfood.core.enums.Category;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "products")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String UrlImage;
    private BigDecimal unitPrice;
    @Enumerated
    private Category category;
}
