package com.example.scplay.config;

import com.example.scplay.repository.CarRepository;
import com.example.scplay.service.CarService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean("carRepository")
    public CarRepository getCarRepository() {
        return new CarRepository();
    }

    @Bean("carService")
    public CarService getCarService() {
        return new CarService(getCarRepository());
    }
}
