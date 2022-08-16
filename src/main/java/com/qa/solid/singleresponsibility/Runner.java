package com.qa.solid.singleresponsibility;

public class Runner {

	public static void main(String[] args) {
		
		Car bmw = new Car("black", "BMW", 5000, 250);
		Driver anoush = new Driver();

		System.out.println("Current Mileage = " + bmw.getMileage());
		
		anoush.drive(bmw, 500);
		
		System.out.println("New Mileage = " + bmw.getMileage());
	}
}
