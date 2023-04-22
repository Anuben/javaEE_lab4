package com.assignment4.controller;

import com.assignment4.model.Seeker;
import com.assignment4.service.SeekerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seeker")
public class SeekerController {

    @Autowired
    private SeekerService seekerService;

    @PostMapping()
    public Seeker register(@RequestBody Seeker seeker){
        seekerService.save(seeker);
        return seeker;
    }

    @GetMapping()
    public List<Seeker> getAll(){
        List<Seeker> seekers = seekerService.getAll();
        return seekers;
    }

    @GetMapping("/{id}")
    public Seeker getOne(@PathVariable Long id){
        Seeker seeker = seekerService.getOne(id);
        return seeker;
    }

    @PutMapping()
    public Seeker update(@RequestBody Seeker seeker){
        Seeker seeker1 = seekerService.update(seeker);
        return seeker1;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        seekerService.delete(id);
    }
}
