package com.example.PetAdopt;

import java.util.Optional;

public interface PetRepository {



    Optional<Object> findByName(String name);
}
