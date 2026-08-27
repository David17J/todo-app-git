package com.taskflow.backend.person;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/person")
public class PersonController {

    private final PersonService personService;

    // Constructor Inejction
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    // CREATE
    @PostMapping
    public Person createPerson(@Valid @RequestBody Person person) {
        return personService.createPerson(person);
    }

    // READ ALL
    @GetMapping
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }
}
