package com.taskflow.backend.person;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "First name must not be blank")
    private String firstName;

    @NotBlank(message = "Last name must not be blank")
    private String lastName;


    // Default Constructor
    public Person() {
    }


    // Constructor
    public Person(String firstName, String lastName) {

        // Alte Variante:
        // this.firstName = firstName;
        // this.lastName = lastName;

        setFirstName(firstName);
        setLastName(lastName);
    }


    // Getter & Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {

        // Alte Variante mit Großbuchstaben:
        // this.firstName = firstName.toUpperCase();

        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
