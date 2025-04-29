package com.twozerotwo.fastfood.adapters.driven.persistence.entity;

import com.twozerotwo.fastfood.core.enums.OrderStatus;
import com.twozerotwo.fastfood.core.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "orders")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String identifier;
    private List<ProductEntity> productList;
    private BigDecimal totalPrice;
    private PaymentStatus paymentStatus;
    private OrderStatus orderStatus;
}
