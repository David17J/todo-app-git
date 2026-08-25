package com.taskflow.backend.car;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Wird nicht mehr benötigt, weil getCarById jetzt Car zurückgibt.
// import java.util.Optional;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/cars")
public class CarController {

    private final CarService carService;

    // Constructor Injection
    public CarController(CarService carService) {
        this.carService = carService;
    }


    // CREATE
    // Wenn ein POST-Request an /api/cars kommt,
    // führe diese Methode aus.
    @PostMapping
    public void createCar(@Valid @RequestBody Car car) {
        carService.createCar(car);
    }


    // READ ALL
    @GetMapping
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }


    // READ BY ID

    // Alte Variante:
    // public Optional<Car> getCarById(@PathVariable Long id) {
    //     return carService.getCarById(id);
    // }

    // Neue Variante:
    // Der Service gibt entweder ein Car zurück
    // oder wirft CarNotFoundException -> 404 Not Found.
    @GetMapping("/{id}")
    public Car getCarById(@PathVariable Long id) {
        return carService.getCarById(id);
    }


    // UPDATE
    @PutMapping("/{id}")
    public Car updateCar(
            @PathVariable Long id,
            @Valid @RequestBody Car car) {

        return carService.updateCar(id, car);
    }


    // DELETE
    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable Long id) {
        carService.deleteCar(id);
    }
}





