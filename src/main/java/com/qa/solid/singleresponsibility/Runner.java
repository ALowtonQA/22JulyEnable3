package com.qa.solid.singleresponsibility;

public class Runner {

	public static void main(String[] args) {
		
		Car bmw = new Car("black", "BMW", 5000, 250);
		Driver anoush = new Driver();
		Mechanic tom = new Mechanic();
		
		System.out.println("Current Mileage = " + bmw.getMileage());
		
		anoush.drive(bmw, 500);
		
		System.out.println("New Mileage = " + bmw.getMileage());
		
		tom.setCar(bmw);
		tom.paintCar("Red");
		tom.upgradeEngine(300);
		
		System.out.println(bmw.getColour());
		System.out.println(bmw.getBhp());
		
	}
}
