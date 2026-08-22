package com.RetailFlow.mapper;

import com.RetailFlow.modal.OrderItem;
import com.RetailFlow.payload.dto.OrderItemDTO;

public class OrderItemMapper {

    public static OrderItemDTO toDTO(OrderItem item) {
        if (item == null) return null;
        return OrderItemDTO.builder()
                .id(item.getId())
                .productId(item.getProduct().getId())
                .quantity(item.getQuantity())
                .price(item.getPrice())
                .product(ProductMapper.toDTO(item.getProduct()))
                .build();
    }
}
