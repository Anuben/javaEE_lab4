package com.assignment4.service;

import com.assignment4.model.Seeker;
import com.assignment4.repository.SeekerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeekerService {

    @Autowired
    private SeekerRepository seekerRepository;

    public void save(Seeker seeker) {
        seekerRepository.save(seeker);
    }

    public List<Seeker> getAll() {
        return seekerRepository.findAll();
    }

    public Seeker getOne(Long id) {
        return seekerRepository.findById(id).get();
    }

    public Seeker update(Seeker seeker) {
        return seekerRepository.save(seeker);
    }

    public void delete(Long id) {
        Seeker seeker = getOne(id);
        seekerRepository.delete(seeker);
    }
}
