package com.qa.solid.dependencyinversion.solution;

public class Phone implements Notifier {
	
	public void generateWeatherAlert(String conditions) {
		if(conditions.equals("rainy")) {
            System.out.println("It is rainy");
        }
	}	
}