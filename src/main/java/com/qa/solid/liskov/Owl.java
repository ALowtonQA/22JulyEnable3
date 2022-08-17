package com.qa.solid.liskov;

// Child class
public class Owl extends Bird {

	@Override
	public void fly() throws Exception {
		System.out.println("I'm flying!");
	}

}
