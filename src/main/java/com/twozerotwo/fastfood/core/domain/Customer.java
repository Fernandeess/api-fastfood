package com.twozerotwo.fastfood.core.domain;
import java.util.List;

public class Customer {
    private Long id;
    private String name;
    private String email;
    private String cpf;
    private List<Order> orderList;

    public Customer(Long id, String name, String email,String cpf, List<Order> orderList) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.orderList = orderList;
    }

    public Customer(Long id, String name, String email,List<Order> orderList) {
        this.id = id;
        this.name = name;
        this.email = email;

        this.orderList = orderList;
    }

    public Customer(String cpf) {
        this.cpf = cpf;
    }

    public Customer(String name, String email, List<Order> orderList){
        this.name = name;
        this.email = email;
        this.orderList = orderList;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
