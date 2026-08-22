package com.RetailFlow.payload.dto;

import com.RetailFlow.domain.PaymentType;
import com.RetailFlow.modal.Branch;
import com.RetailFlow.modal.Order;
import com.RetailFlow.modal.ShiftReport;
import com.RetailFlow.modal.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class RefundDTO {

    private Long id;

    private OrderDTO order;
    private Long orderId;

    private String reason;

    private Double amount;

    //private ShiftReport shiftReport;
    private Long shiftReportId;

    private UserDto cashier;

    private String cashierName;

    private BranchDTO branch;
    private Long branchId;

    private PaymentType paymentType;

    private LocalDateTime createdAt;
}
