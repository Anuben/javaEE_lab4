package com.assignment4.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BloodStockDTO {

    private Long id;

    @NotNull(message = "Blood Group is required")
    private String bloodGroup;

    private int quantity;

    @NotNull(message = "Best Before Date is required for blood stock")
    private LocalDate bestBefore;

    private String status;

    @NotNull(message = "Blood Bank name is required")
    private String bloodBankName;
    
}
