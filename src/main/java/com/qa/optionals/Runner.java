package com.qa.optionals;

import java.util.Optional;

public class Runner {

	public static void main(String[] args) {
		
		String item;
		
		if(Math.random() >= 0.5) {
			item = "Hello";
		} else {
			item = null;
		}
		
		Optional<String> myStrOptional = Optional.ofNullable(item);
		
		System.out.println(myStrOptional.get());
	}
}
