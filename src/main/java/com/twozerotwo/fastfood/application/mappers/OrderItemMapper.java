package com.twozerotwo.fastfood.application.mappers;

import com.twozerotwo.fastfood.adapters.driven.persistence.entity.OrderItemEntity;
import com.twozerotwo.fastfood.core.domain.OrderItem;
import lombok.experimental.UtilityClass;

@UtilityClass
public class OrderItemMapper {
    public static OrderItemEntity toEntity(OrderItem orderItem) {
        return OrderItemEntity
                .builder()
                .id(orderItem.getId())
                .order(OrderMapper.toEntity(orderItem.getOrder()))
                .product(ProductMapper.toEntity(orderItem.getProduct()))
                .quantity(orderItem.getQuantity())
                .priceAtPurchase(orderItem.getPriceAtPurchase())
                .build();
    }

    public static OrderItem toDomain(OrderItemEntity orderItemEntity) {
        return new OrderItem
                .Builder()
                .id(orderItemEntity.getId())
                .order(OrderMapper.toDomain(orderItemEntity.getOrder()))
                .product(ProductMapper.toDomain(orderItemEntity.getProduct()))
                .quantity(orderItemEntity.getQuantity())
                .priceAtPurchase(orderItemEntity.getPriceAtPurchase())
                .build();
    }
}
