package com.taskflow.backend.car;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    // 1. Ich brauche ein CarRepository
    public final CarRepository CarRepository;
    private final CarRepository carRepository;

    /**
     * constructor injection
     */
    public CarService(CarRepository CarRepository, CarRepository carRepository) { // 2. Spring gibt es mir beim Erstellen
        this.CarRepository = carRepository; // 3. Ich speichere es
        this.carRepository = carRepository;
    }

    public List<Car> getAllCars() {
        return CarRepository.findAll();
    }

    public void createCar(Car car) {
        CarRepository.save(car);

//        Car car2= new Car();
//        car2.setBrand("Ferrari");
//        car2.setModel("Roma Spider");
//        car.setPrice(10000);
//        car2.setCar(car);
//        CarRepository.save(car); // 4. Jetzt kann ich es benutzen


        //    public CarRepository getCarRepository() {
//        return CarRepository;
//    }
    }

    public Optional<Car> getCarById(Long id) {
        return CarRepository.findById(id);
    }

    public Car updateCar (Long id, Car updatedCar) {
    Car existingCar = carRepository.findById(id)
        .orElseThrow();

        existingCar.setBrand(updatedCar.getBrand());
        existingCar.setModel(updatedCar.getModel());
        existingCar.setPrice(updatedCar.getPrice());

        return CarRepository.save(existingCar);
    }

    public void deleteCar (Long id) {
        Car car = carRepository.findById(id)
                .orElseThrow();

        CarRepository.deleteById(id);
    }
}
