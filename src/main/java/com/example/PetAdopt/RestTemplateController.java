package com.example.PetAdopt;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pet")
public class RestTemplateController {
//    @GetMapping("/{id}")
//    public Pet getPeople(@PathVariable String id) {
//        RestTemplate restTemplate = new RestTemplate();
//        Pet pet = restTemplate.getForObject(
//                String.format("https://swapi.dev/api/people/%s?format=json", id),
//                Pet.class);
//        return pet;
//    }
}
