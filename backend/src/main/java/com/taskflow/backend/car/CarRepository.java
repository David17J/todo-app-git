package com.taskflow.backend.car;

import com.taskflow.backend.person.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface CarRepository extends JpaRepository<Car, Long> {

}


