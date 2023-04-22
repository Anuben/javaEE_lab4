package com.assignment4.service;

import com.assignment4.model.BloodBank;
import com.assignment4.model.BloodStock;
import com.assignment4.repository.BloodBankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BloodBankService {

    @Autowired
    private BloodBankRepository bloodBankRepository;
    public void save(BloodBank bloodBank) {
        bloodBankRepository.save(bloodBank);
    }

    public BloodBank findByBloodBankName(String bloodBankName) {
        return bloodBankRepository.findByBloodBankName(bloodBankName);
    }

    public List<BloodBank> getAll() {
        return bloodBankRepository.findAll();
    }

    public BloodBank getOne(Long id) {
        return bloodBankRepository.findById(id).get();
    }

    public BloodBank update(BloodBank bloodBank) {
        BloodBank bloodBank1 = bloodBankRepository.findById(bloodBank.getId()).get();
        bloodBank1.setBloodBankName(bloodBank.getBloodBankName());
        bloodBank1.setAddress(bloodBank.getAddress());
        bloodBank1.setWebsite(bloodBank.getWebsite());
        bloodBank1.setPhone(bloodBank.getPhone());
        bloodBank1.setEmail(bloodBank.getEmail());
        bloodBank1.setCity(bloodBank.getCity());
        System.out.println(bloodBank1);
        return bloodBankRepository.save(bloodBank1);
    }

    public void delete(Long id) {
        BloodBank bloodBank = getOne(id);
        bloodBankRepository.delete(bloodBank);
    }
}
