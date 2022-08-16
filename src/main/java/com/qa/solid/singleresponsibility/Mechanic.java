package com.qa.solid.singleresponsibility;

public class Mechanic {

	private Car car;

	public void paintCar(String newColour) {
		car.setColour(newColour);
	}
	
	public void upgradeEngine(int newBHP) {
		car.setBhp(newBHP);
	}
	
	public void setCar(Car car) {
		this.car = car;
	}

}
