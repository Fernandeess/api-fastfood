package com.twozerotwo.fastfood.application.mappers;

import com.twozerotwo.fastfood.adapters.driven.persistence.entity.OrderEntity;
import com.twozerotwo.fastfood.core.domain.Order;
import lombok.experimental.UtilityClass;

@UtilityClass
public class OrderMapper {
    public static OrderEntity toEntity(Order order) {
        return OrderEntity.builder()
                .id(order.getId())
                .identifier(order.getIdentifier())
                .orderItem(
                        order.getitems().stream().map(OrderItemMapper::toEntity).toList()
                )
                .totalPrice(order.getTotalPrice())
                .paymentStatus(order.getPaymentStatus())
                .orderStatus(order.getOrderStatus())
                .build();
    }


    public static Order toDomain(OrderEntity orderEntity) {
        return new Order
                .Builder()
                .id(orderEntity.getId())
                .identifier(orderEntity.getIdentifier())
                .items(orderEntity.getOrderItem()
                        .stream()
                        .map(OrderItemMapper::toDomain)
                        .toList())
                .totalPrice(orderEntity.getTotalPrice())
                .paymentStatus(orderEntity.getPaymentStatus())
                .orderStatus(orderEntity.getOrderStatus())
                .build();
    }
}
