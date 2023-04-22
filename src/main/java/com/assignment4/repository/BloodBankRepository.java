package com.assignment4.repository;

import com.assignment4.model.BloodBank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BloodBankRepository extends JpaRepository<BloodBank, Long> {

    BloodBank findByBloodBankName(String bloodBankName);
}
