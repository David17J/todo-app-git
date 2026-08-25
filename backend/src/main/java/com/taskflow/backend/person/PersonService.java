package com.taskflow.backend.person;

import org.springframework.stereotype.Service;

import java.util.List;

// Wird aktuell nicht benötigt:
// import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    // Wird aktuell nicht benötigt:
    // private final AddressRepository addressRepository;

    // Property Injection – aktuell nicht benötigt
    // @Autowired
    // private AddressRepository addressRepository;


    // Constructor Injection
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    // Wird aktuell nicht benötigt:
    // public PersonRepository getPersonRepository() {
    //     return personRepository;
    // }


    // CREATE
    public Person createPerson(Person person) {
       return personRepository.save(person);

        // Alter Lerncode:
        // Person person = new Person("David", "Lindörfer");
        // person.setFirstName("David");
        // person.setLastName("Lindorfer");
        // personRepository.save(person);


        // Address gehört aktuell nicht zu unserem kleinen Person-Scope:

        // Address address = new Address();
        // address.setHouseNumber("46");
        // address.setStreet("Strasse1");
        // address.setPerson(person);
        // addressRepository.save(address);

        // Address address2 = new Address();
        // address2.setHouseNumber("80a");
        // address2.setStreet("Strasse2");
        // address2.setPerson(person);
        // addressRepository.save(address2);
    }


    // READ ALL
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }
}