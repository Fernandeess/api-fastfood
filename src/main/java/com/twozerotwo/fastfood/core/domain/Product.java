package com.twozerotwo.fastfood.core.domain;

import com.twozerotwo.fastfood.core.enums.Category;

import java.math.BigDecimal;

public class Product {
    private Long id;
    private String name;
    private String UrlImage;
    private BigDecimal unitPrice;
    private Category category;

    public Product(Long id, String name, String urlImage, BigDecimal unitPrice, Category category) {
        this.id = id;
        this.name = name;
        UrlImage = urlImage;
        this.unitPrice = unitPrice;
        this.category = category;
    }

    public Product(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        UrlImage = builder.urlImage;
        this.unitPrice = builder.unitPrice;
        this.category = builder.category;
    }

    public static class Builder {
        private Long id;
        private String name;
        private String urlImage;
        private BigDecimal unitPrice;
        private Category category;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder urlImage(String urlImage) {
            this.urlImage = urlImage;
            return this;
        }

        public Builder unitPrice(BigDecimal unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }

        public Builder category(Category category) {
            this.category = category;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
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

    public String getUrlImage() {
        return UrlImage;
    }

    public void setUrlImage(String urlImage) {
        UrlImage = urlImage;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
