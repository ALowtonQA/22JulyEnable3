package com.qa.solid.liskov.exercise;

public class BedroomAdder {
	
	public void increaseSqft(Apartment apartment, int sqft) {
		apartment.setSquareFootage(apartment.getSquareFootage() + sqft);
	}
	
    public void addBedroom(BedroomAddable apartment) {
    	apartment.setNumberOfBedrooms(apartment.getNumberOfBedrooms() + 1);
    }

}