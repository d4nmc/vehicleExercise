package com.natwest.springprojectgarage;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

import domain.Vehicle;
import service.VehicleService;

public class VehicleServiceTest {

@Test
	public void createVehicleTest() {

// Arrange
		Vehicle testVehicle = new Vehicle();

// Creating variables to pass into the method
		String carName = "test_name";
		String modelName = "test_model";
		double bhpOutput = 360;
		double engineSize = 2.5;
		boolean gotBoost = true;
		double overallRating = 7.0;

		// Variable for the method to be equal to
		Vehicle resultVehicle;

		// Act - Do the method we're testing, save it as a variable
	
		resultVehicle = VehicleService.createVehicle(carName, modelName, bhpOutput, engineSize, gotBoost,
				overallRating);

		// Assert
		System.out.println("=========================");
		System.out.println(testVehicle);
		System.out.println(resultVehicle);
		System.out.println("=========================");
		assertEquals(carName, resultVehicle.getCarName());
//			assertEquals(testVehicle.getColour(), resultVehicle.getColour());

	}

}
