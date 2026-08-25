package com.taskflow.backend.car;

// import com.taskflow.backend.task.TaskNotFoundException;
import com.taskflow.backend.task.TaskNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    // 1. Ich brauche ein CarRepository
    private final CarRepository carRepository;

    /**
     * constructor injection
     */
    public CarService(CarRepository carRepository) {
        // this.CarRepository = carRepository;
        this.carRepository = carRepository;
  

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public void createCar(Car car) {
        carRepository.save(car);

        // Übungscode - momentan nicht für createCar benötigt

//        Car car2 = null;
//        Optional<Car> car3 = Optional.ofNullable(car2);
//
//        car3.ifPresent(c -> {
//            car2.setBrand("Ferrari");
//        });
//
//        if (car2 != null) {
//            car2.setBrand("Ferrari");
//        }
//
//        Car car2= new Car();
//        car2.setBrand("Ferrari");
//        car2.setModel("Roma Spider");
//        car.setPrice(10000);
//        car2.setCar(car);
//        carRepository.save(car);
    }

    public Car getCarById(Long id) {
        return carRepository.findById(id)
                .orElseThrow(() -> new CarNotFoundException(id));
    }

    public Car updateCar(Long id, Car updatedCar) {

        // Alte Variante auskommentiert:
//        Optional<Car> byId = carRepository.findById(id);
//
//        if (!byId.isPresent()) {
//            throw new TaskNotFoundException(id);
//        }

        Car existingCar = carRepository.findById(id)
                .orElseThrow(() -> new CarNotFoundException(id));

        existingCar.setBrand(updatedCar.getBrand());
        existingCar.setModel(updatedCar.getModel());
        existingCar.setPrice(updatedCar.getPrice());

        return carRepository.save(existingCar);
    }

    public void deleteCar(Long id) {

        Car car = carRepository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException(id));;

        carRepository.deleteById(id);
    }
}