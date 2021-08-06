package domain;

public class Vehicle {

	

private String carName;
private String modelName;
private double bhpOutput;
private double engineSize;
private boolean gotBoost;
private double overallRating;

public Vehicle() {}

public Vehicle(String carName, String modelName, double bhpOutput, double engineSize,
		boolean gotBoost, double overallRating) {
	super();
	
	this.carName = carName;
	this.modelName = modelName;
	this.bhpOutput = bhpOutput;
	this.engineSize = engineSize;
	this.gotBoost = gotBoost;
	this.overallRating = overallRating;
}


public String getCarName() {
	return carName;
}

public void setCarName(String carName) {
	this.carName = carName;
}

public String getModelName() {
	return modelName;
}

public void setModelName(String modelName) {
	this.modelName = modelName;
}

public double getBhpOutput() {
	return bhpOutput;
}

public void setBhpOutput(double bhpOutput) {
	this.bhpOutput = bhpOutput;
}

public double getEngineSize() {
	return engineSize;
}

public void setEngineSize(double engineSize) {
	this.engineSize = engineSize;
}

public boolean isGotBoost() {
	return gotBoost;
}

public void setGotBoost(boolean gotBoost) {
	this.gotBoost = gotBoost;
}

public double getOverallRating() {
	return overallRating;
}

public void setOverallRating(double overallRating) {
	this.overallRating = overallRating;
}



}
