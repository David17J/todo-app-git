package com.taskflow.backend.task;

import com.taskflow.backend.person.Person;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Task {

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Title must not be blank")
    private String title;

    private boolean completed;

    public Task() {
    }

    public Task(Long id, String title, boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    // Getter Setter Person
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

}