package com.example.PetAdopt;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "animals")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "animalid", nullable = false)
    private Long animalid;

    @Column(name = "name")
    private String name;

    public Animal() {
    }

    public Animal(Long animalid) {
        this.animalid = animalid;
    }

    public Animal(Long animalid, String name) {
        this.animalid = animalid;
        this.name = name;
    }


}

