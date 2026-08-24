package com.taskflow.backend.car;

import com.taskflow.backend.person.Address;
import com.taskflow.backend.person.AddressRepository;
import com.taskflow.backend.person.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    // 1. Ich brauche ein CarRepository
    public final CarRepository CarRepository;

    /** constructor injection*/
    public CarService(CarRepository carRepository) { // 2. Spring gibt es mir beim Erstellen
        this.CarRepository = carRepository; // 3. Ich speichere es

    }

    public  void createCar() {

        Car car = new Car("Lambo", "Huracain", 10000);
        CarRepository.save(car);

        Car car2= new Car();
        car2.setBrand("Ferrari");
        car2.setModel("Roma Spider");
        car.setPrice(10000);
        car2.setCar(car);
        CarRepository.save(car); // 4. Jetzt kann ich es benutzen

    }

    public CarRepository getCarRepository() {
        return CarRepository;
    }

}
