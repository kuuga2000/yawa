package com.example.scplay.service;

import com.example.scplay.model.Car;
import com.example.scplay.repository.CarRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CarService implements CrudService<Car> {

    private CarRepository repository;

    /*public CarService(List<Car> car) {
        this.car = car;
    }*/
    public CarService(CarRepository carRepository) {
        this.repository = carRepository;
    }

    @Override
    public List<Car> list() {
        return repository.findAll();
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
