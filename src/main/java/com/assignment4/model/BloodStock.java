package com.assignment4.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity(name = "bloodStock")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class BloodStock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Blood Group is required")
    @Column(name = "bloodGroup")
    private String bloodGroup;

    @Column(name = "quantity")
    private int quantity;

    @NotNull(message = "Best Before Date is required for blood stock")
    @Column(name = "bestBefore")
    private LocalDate bestBefore;

    @Column(name = "status")
    private String status;

    @ManyToOne(targetEntity = BloodBank.class, fetch = FetchType.EAGER)
    private BloodBank bloodBank;
}
