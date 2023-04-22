package com.assignment4.controller;

import com.assignment4.model.BloodBank;
import com.assignment4.service.BloodBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bloodbank")
public class BloodBankController {

    @Autowired
    private BloodBankService bloodBankService;

    @PostMapping()
    public BloodBank register(@RequestBody BloodBank bloodBank){
        bloodBankService.save(bloodBank);
        return bloodBank;
    }

    @GetMapping()
    public List<BloodBank> getAll(){
        return bloodBankService.getAll();
    }

    @GetMapping("/{id}")
    public BloodBank getOne(@PathVariable Long id){
        return bloodBankService.getOne(id);
    }

    @PutMapping()
    public BloodBank update(@RequestBody BloodBank bloodBank){
        return bloodBankService.update(bloodBank);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        bloodBankService.delete(id);
    }

}
