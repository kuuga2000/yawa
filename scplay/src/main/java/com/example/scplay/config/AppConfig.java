package com.example.scplay.config;

import com.example.scplay.service.CarService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean("carService")
    public CarService getCarService() {
        return new CarService();
    }
}
