package com.twozerotwo.fastfood.core.domain;

import com.twozerotwo.fastfood.core.enums.OrderStatus;
import com.twozerotwo.fastfood.core.enums.PaymentStatus;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public class Order {
    private UUID id;
    private String identifier;
    private List<OrderItem> items;
    private BigDecimal totalPrice;
    private PaymentStatus paymentStatus;
    private OrderStatus orderStatus;

    public Order(UUID id, String identifier, List<OrderItem> items, BigDecimal totalPrice, PaymentStatus paymentStatus, OrderStatus orderStatus) {
        this.id = id;
        this.identifier = identifier;
        this.items = items;
        this.totalPrice = totalPrice;
        this.paymentStatus = paymentStatus;
        this.orderStatus = orderStatus;
    }

    public Order(Builder builder) {
        this.id = builder.id;
        this.identifier = builder.identifier;
        this.items = builder.items;
        this.totalPrice = builder.totalPrice;
        this.paymentStatus = builder.paymentStatus;
        this.orderStatus = builder.orderStatus;
    }

    public static class Builder {
        private UUID id;
        private String identifier;
        private List<OrderItem> items;
        private BigDecimal totalPrice;
        private PaymentStatus paymentStatus;
        private OrderStatus orderStatus;

        public Builder id(UUID id) {
            this.id = id;
            return this;
        }

        public Builder identifier(String identifier) {
            this.identifier = identifier;
            return this;
        }

        public Builder items(List<OrderItem> items) {
            this.items = items;
            return this;
        }

        public Builder totalPrice(BigDecimal totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }

        public Builder paymentStatus(PaymentStatus paymentStatus) {
            this.paymentStatus = paymentStatus;
            return this;
        }

        public Builder orderStatus(OrderStatus orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public List<OrderItem> getitems() {
        return items;
    }

    public void setitems(List<OrderItem> items) {
        this.items = items;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

}
