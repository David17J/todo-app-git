package com.taskflow.backend.car;

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
    public CarService(CarRepository carRepository) { // 2. Spring gibt es mir beim Erstellen
        this.carRepository = carRepository; // 3. Ich speichere es
    }

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public void createCar(Car car) {
        carRepository.save(car);

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

    public Car getCarById(Long id) {
        return carRepository.findById(id)
                .orElseThrow(() -> new CarNotFoundException(id));
    }

    public Car updateCar (Long id, Car updatedCar) {
    Car existingCar = carRepository.findById(id)
        .orElseThrow(() -> new CarNotFoundException(id));

        existingCar.setBrand(updatedCar.getBrand());
        existingCar.setModel(updatedCar.getModel());
        existingCar.setPrice(updatedCar.getPrice());

        return carRepository.save(existingCar);
    }

    public void deleteCar (Long id) {
        Car car = carRepository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException(id));;

        carRepository.deleteById(id);
    }
}
