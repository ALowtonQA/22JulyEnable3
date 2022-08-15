package com.qa.exceptions;

public class Maths {

	public void multiply(int a, int b) throws MultiplyByFiveException {
		
		if (a == 5 || b == 5) {
			throw new MultiplyByFiveException();
		}
		
		int result = a * b;
		
		System.out.println(result);
		
	}
	
}
