package com.qa.solid.dependencyinversion;

public class WeatherTracker {

	private String conditions;

	// Dependencies
	Phone phone;
	Email email;

	// Constructor
	public WeatherTracker() {
		this.phone = new Phone();
		this.email = new Email();
	}

	public void setConditions(String weather) {
		this.conditions = weather;
		
		if (weather.equals("rainy")) {
			String alert = phone.generateWeatherAlert(weather);
			System.out.println(alert);
		}
		
		if (weather.equals("sunny")) {
			String alert = email.generateWeatherAlert(weather);
			System.out.println(alert);
		}
		
	}

	public String getConditions() {
		return conditions;
	}
}
