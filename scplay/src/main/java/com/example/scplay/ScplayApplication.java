package com.example.scplay;


import com.example.scplay.service.CarService;

public class ScplayApplication {

	public static void main(String[] args) {
		CarService service = new CarService();
		System.out.println(service.list());
	}

}
