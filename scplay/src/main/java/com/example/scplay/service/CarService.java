package com.example.scplay.service;

import com.example.scplay.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CarService implements CrudService<Car> {

    private List<Car> car;

    /*public CarService(List<Car> car) {
        this.car = car;
    }*/
    public CarService() {
        car = new ArrayList<>();
        Car toyota = new Car(
                1,
                "Toyota Harrier",
                "Toyota",
                "Black"
        );
        car.add(toyota);
    }

    @Override
    public List<Car> list() {
        return car;
    }

    @Override
    public Car create(Car car) {
        return null;
    }

    @Override
    public Optional<Car> get(int id) {
        return Optional.empty();
    }

    @Override
    public void update(Car car, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
