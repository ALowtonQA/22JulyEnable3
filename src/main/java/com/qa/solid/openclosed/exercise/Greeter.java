package com.qa.solid.openclosed.exercise;

public class Greeter {

	private String greetingType;

	public void setGreetingType(String greetingType) {
		this.greetingType = greetingType;
	}

	public String greet() {
		if (greetingType.equals("formal")) {
			return "Good evening, Sir.";
		} else if (greetingType.equals("casual")) {
			return "Sup m8?";
		} else if (greetingType.equals("friendly")) {
			return "Hi, hope you're well";
		} else {
			return "Hello";
		}
	}
}
