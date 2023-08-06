package com.example.scplay;


import com.example.scplay.config.AppConfig;
import com.example.scplay.service.CarService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScplayApplication {

	public static void main(String[] args) {
		ApplicationContext scplayApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		CarService service = scplayApplicationContext.getBean("carService", CarService.class);
		System.out.println(service.list());
	}

}
