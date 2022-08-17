package com.qa.solid.liskov.exercise;

public class Penthouse extends Apartment implements BedroomAddable {
	
	public Penthouse() {
		this.setNumberOfBedrooms(4);
	}

}
