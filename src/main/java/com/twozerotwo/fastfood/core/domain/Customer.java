package com.twozerotwo.fastfood.core.domain;

import java.util.List;
import java.util.UUID;

public class Customer {
    private UUID id;
    private String name;
    private String email;
    private String cpf;
    private List<Order> orderList;

    public Customer(UUID id, String name, String email, String cpf, List<Order> orderList) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.orderList = orderList;
    }

    public Customer(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
        this.cpf = builder.cpf;
        this.orderList = builder.orderList;
    }

    public static class Builder {
        private UUID id;
        private String name;
        private String email;
        private String cpf;
        private List<Order> orderList;

        public Builder id(UUID id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder cpf(String cpf) {
            this.cpf = cpf;
            return this;
        }

        public Builder orderList(List<Order> orderList) {
            this.orderList = orderList;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", orderList=" + orderList +
                '}';
    }

}
