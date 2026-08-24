package com.taskflow.backend.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    /** property Inject*/
    @Autowired
    private  AddressRepository addressRepository;

    /** constructor injection*/
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public PersonRepository getPersonRepository() {
        return personRepository;
    }

    public void createPerson() {
        Person person = new Person("David","Lindörfer");
        //person.setFirstName("DAvid");
        //person.setLastName("Lindorfer");
        personRepository.save(person);

        Address address = new Address();
        address.setHouseNumber("46");
        address.setStreet("Strasse1");
        address.setPerson(person);
        addressRepository.save(address);


        Address address2 = new Address();
        address2.setHouseNumber("80a");
        address2.setStreet("Strasse2");
        address2.setPerson(person);
        addressRepository.save(address2);
    }
}
