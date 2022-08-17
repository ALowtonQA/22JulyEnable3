package com.qa.solid.dependencyinversion.solution;

public class Runner {

	public static void main(String[] args) {
		
		WeatherTracker weatherTracker = new WeatherTracker();
		weatherTracker.setConditions("sunny");
		
		Phone phone = new Phone();
		Email email = new Email();
		
		weatherTracker.notify(phone);
		weatherTracker.notify(email);
		
	}
	
}
