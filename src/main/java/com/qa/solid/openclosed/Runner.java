package com.qa.solid.openclosed;

public class Runner {

	public static void main(String[] args) {
		
		Triangle triangle = new Triangle(5, 15);
		AreaCalculator ac = new AreaCalculator();
		
		System.out.println(ac.calculateArea(triangle));
	}

}
