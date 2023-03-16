package com.example.PetAdopt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class PetControler {

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
