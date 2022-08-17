package com.qa.solid.dependencyinversion.solution;

public class Email implements Notifier {
	
	public void generateWeatherAlert(String conditions) {
		if (conditions.equals("sunny")) {
            System.out.println("It is sunny");
        }
	}	
}
