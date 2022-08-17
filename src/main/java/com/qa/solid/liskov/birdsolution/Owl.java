package com.qa.solid.liskov.birdsolution;

// Child class
public class Owl extends Bird implements Flying {

	@Override
	public void fly() {
		System.out.println("I'm flying!");
	}
	
}
