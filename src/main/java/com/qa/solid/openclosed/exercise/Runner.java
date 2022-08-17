package com.qa.solid.openclosed.exercise;

public class Runner {

	public static void main(String[] args) {
		
		Greeter greeter = new Greeter();
		
		greeter.setGreetingType("formal");
		
		System.out.println(greeter.greet());
	}
	
}
