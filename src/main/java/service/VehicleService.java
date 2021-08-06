package service;

import domain.Vehicle;

public class VehicleService {
	
	public static Vehicle createVehicle(String carName, String modelName, double bhpOutput, double engineSize, boolean gotBoost, double overallRating  ) {
		
		Vehicle newVehicle = new Vehicle(carName, modelName, bhpOutput, engineSize, gotBoost, overallRating);
		System.out.println(newVehicle);
		System.out.println("Vehicle name: " + newVehicle.getCarName());
		return newVehicle;
	}
		
}
