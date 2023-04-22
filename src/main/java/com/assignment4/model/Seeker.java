package com.assignment4.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity(name = "seeker")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Seeker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "First Name is required")
    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "age")
    private int age;

    @Column(name = "gender")
    private String gender;

    @NotNull(message = "Blood Group is required")
    @Column(name = "bloodGroup")
    private String bloodGroup;

    @Column(name = "city")
    private String city;

    @Column(name = "phone")
    private String phone;
}
