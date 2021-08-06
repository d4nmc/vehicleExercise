package domain;

public class Vehicle {

	
private Long id;
private String carName;
private String modelName;
private String yearReleased;
private double bhpOutput;
private double engineSize;
private boolean gotBoost;
private double overallRating;

public Vehicle() {}

public Vehicle(Long id, String carName, String modelName, String yearReleased, double bhpOutput, double engineSize,
		boolean gotBoost, double overallRating) {
	super();
	this.id = id;
	this.carName = carName;
	this.modelName = modelName;
	this.yearReleased = yearReleased;
	this.bhpOutput = bhpOutput;
	this.engineSize = engineSize;
	this.gotBoost = gotBoost;
	this.overallRating = overallRating;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
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

public String getYearReleased() {
	return yearReleased;
}

public void setYearReleased(String yearReleased) {
	this.yearReleased = yearReleased;
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
