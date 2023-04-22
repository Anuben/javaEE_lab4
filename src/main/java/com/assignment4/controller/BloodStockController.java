package com.assignment4.controller;

import com.assignment4.dto.BloodStockDTO;
import com.assignment4.model.BloodStock;
import com.assignment4.service.BloodStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bloodstock")
public class BloodStockController {

    @Autowired
    private BloodStockService bloodStockService;

    @PostMapping()
    public BloodStock register(@RequestBody BloodStockDTO bloodStockDTO){
        return bloodStockService.save(bloodStockDTO);
    }

    @GetMapping()
    public List<BloodStock> getAll(){
        return bloodStockService.getAll();
    }

    @GetMapping("/{id}")
    public BloodStock getOne(@PathVariable Long id){
        return bloodStockService.getOne(id);
    }

    @PutMapping()
    public BloodStock update(@RequestBody BloodStockDTO bloodStockDTO){
        return bloodStockService.update(bloodStockDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        bloodStockService.delete(id);
    }
}
