package com.taskflow.backend.car;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Brand must not be blank")
    private String brand;

    @NotBlank(message = "Model must not be blank")
    private String model;

    @Positive(message = "Price must be greater than 0")
    private long price;


    // Leerer Konstruktor
    public Car() {

    }


    // Konstruktor mit Werten
    public Car(String brand, String model, long price) {

        setBrand(brand);

        // Alte Variante:
        // this.model = model;
        // this.price = price;

        // Neue Variante über Setter:
        setModel(model);
        setPrice(price);
    }


    // Getter & Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }


    // Alte Methode - wird aktuell nicht benötigt
    // public void setCar(Car car) {
    // }
}