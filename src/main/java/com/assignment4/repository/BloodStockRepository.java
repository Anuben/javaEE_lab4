package com.assignment4.repository;

import com.assignment4.model.BloodStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BloodStockRepository extends JpaRepository<BloodStock, Long> {

}
