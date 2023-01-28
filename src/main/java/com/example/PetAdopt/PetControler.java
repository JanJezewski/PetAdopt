package com.example.PetAdopt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


class PetControler {

    private PetService petService;

    @Autowired
    public PetControler(PetService petService) {
        this.petService = petService;
    }

     @PutMapping("/{name}")
        Pet findByName(@PathVariable String name, @Validated(value = Pet.FindByName.class) @RequestBody Pet pet) {
            return (Pet) petService.findByName(name, pet);
        }
}
