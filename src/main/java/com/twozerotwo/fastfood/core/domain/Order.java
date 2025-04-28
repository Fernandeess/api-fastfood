package com.twozerotwo.fastfood.core.domain;

import com.twozerotwo.fastfood.core.enums.PaymentStatus;

import java.math.BigDecimal;
import java.util.List;

public class Order {
    private Long id;
    private String identifier;
//    private List<Product> productList;
    private BigDecimal totalPrice;
    private PaymentStatus paymentStatus;
}
