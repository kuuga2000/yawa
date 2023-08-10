package com.example.books;


import com.example.books.controller.HelloWorldController;
import org.springframework.boot.SpringApplication;

public class BookApplication {

	public static void main(String[] args) {
		/*
		ApplicationContext scplayApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		CarService service = scplayApplicationContext.getBean("carService", CarService.class);
		System.out.println(service.list());
		*/

		SpringApplication.run(HelloWorldController.class, args);
	}

}
