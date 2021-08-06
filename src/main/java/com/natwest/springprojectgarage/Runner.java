package com.natwest.springprojectgarage;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import service.VehicleService;

@SpringBootApplication
public class Runner {

	public static void main(String[] args) {
		VehicleService.createVehicle("Honda", "Civic", 205, 2.0, false, 6.5);
	}

}