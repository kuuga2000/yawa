package com.example.scplay.repository;

import com.example.scplay.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepository implements CrudRepository<Car>{
    @Override
    public List<Car> findAll() {
        List<Car> car= new ArrayList<>();
        Car toyota = new Car(
                1,
                "Toyota Harrier",
                "Toyota",
                "Black"
        );
        car.add(toyota);
        return car;
    }
}
