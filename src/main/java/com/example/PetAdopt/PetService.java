package com.example.PetAdopt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service

public class PetService {

    private final PetRepository petRepository;

    @Autowired
    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    Pet findByName(String name, Pet pet) {
        return (Pet) petRepository.findByName(name).orElseThrow(() -> {
            return new NoSuchElementException("No pet found ");
        });
    }


}
