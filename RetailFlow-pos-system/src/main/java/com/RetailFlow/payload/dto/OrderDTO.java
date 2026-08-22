package com.RetailFlow.payload.dto;

import com.RetailFlow.domain.PaymentType;
import com.RetailFlow.modal.Branch;
import com.RetailFlow.modal.Customer;
import com.RetailFlow.modal.OrderItem;
import com.RetailFlow.modal.User;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class OrderDTO {

    private Long id;

    private double totalAmount;

    private LocalDateTime createdAt;

    private Long branchId;
    private Long customerId;

    private BranchDTO branch;

    private UserDto cashier;

    private Customer customer;

    private PaymentType paymentType;

    private List<OrderItemDTO> items;

}
