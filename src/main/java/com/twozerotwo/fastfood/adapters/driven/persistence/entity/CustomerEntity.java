package com.twozerotwo.fastfood.adapters.driven.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Table(name = "customers")
@Entity
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String cpf;
//    @OneToMany
//    private List<OrderEntity> orderList;

    public CustomerEntity() {
    }

    public CustomerEntity(Long id, String name, String email,String cpf) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cpf = cpf;
//        this.orderList = orderList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
