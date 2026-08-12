package com.RetailFlow.payload.dto;

import com.RetailFlow.domain.StoreStatus;
import com.RetailFlow.modal.StoreContact;
import com.RetailFlow.modal.User;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class StoreDTO {

    private Long id;

    private String brand;

    private UserDto storeAdmin;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private String description;

    private String storeType;

    private StoreStatus status;

    private StoreContact contact;


}
