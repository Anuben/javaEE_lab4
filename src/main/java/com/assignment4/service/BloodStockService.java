package com.assignment4.service;

import com.assignment4.dto.BloodStockDTO;
import com.assignment4.model.BloodBank;
import com.assignment4.model.BloodStock;
import com.assignment4.repository.BloodBankRepository;
import com.assignment4.repository.BloodStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BloodStockService {

    @Autowired
    private BloodStockRepository bloodStockRepository;
    @Autowired
    private BloodBankRepository bloodBankRepository;

    public BloodStock save(BloodStockDTO bloodStockDTO) {
        BloodBank bloodBank = bloodBankRepository.findByBloodBankName(bloodStockDTO.getBloodBankName());
        BloodStock bloodStock = BloodStock.builder()
                .id(bloodStockDTO.getId())
                .bloodGroup(bloodStockDTO.getBloodGroup())
                .quantity(bloodStockDTO.getQuantity())
                .status(bloodStockDTO.getStatus())
                .bestBefore(bloodStockDTO.getBestBefore())
                .bloodBank(bloodBank)
                .build();
        return bloodStockRepository.save(bloodStock);
    }

    public List<BloodStock> getAll() {
        return bloodStockRepository.findAll();
    }

    public BloodStock getOne(Long id) {
        return bloodStockRepository.findById(id).get();
    }

    public BloodStock update(BloodStockDTO bloodStockDTO) {
        BloodBank bloodBank = bloodBankRepository.findByBloodBankName(bloodStockDTO.getBloodBankName());
        BloodStock bloodStock = BloodStock.builder()
                .id(bloodStockDTO.getId())
                .bloodGroup(bloodStockDTO.getBloodGroup())
                .quantity(bloodStockDTO.getQuantity())
                .status(bloodStockDTO.getStatus())
                .bestBefore(bloodStockDTO.getBestBefore())
                .bloodBank(bloodBank)
                .build();
        return bloodStockRepository.save(bloodStock);
    }

    public void delete(Long id) {
        BloodStock bloodStock1 = getOne(id);
        bloodStock1.setBloodBank(null);
        bloodStockRepository.delete(bloodStock1);
    }
}
