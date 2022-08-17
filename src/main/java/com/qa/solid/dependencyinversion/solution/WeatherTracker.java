package com.qa.solid.dependencyinversion.solution;

public class WeatherTracker {

	private String conditions;

	public void setConditions(String weather) {
		this.conditions = weather;
	}

	public String getConditions() {
		return conditions;
	}
	
	public void notify(Notifier notifier) {
		notifier.generateWeatherAlert(conditions);
	}
}
