package com.qa.exceptions.exercise;

public class Maths {

	public void divide(int num1, int num2) throws DivisionException {
		
		if (num2 > num1) {
			throw new DivisionException("Can't divide one number by a larger number");
		}
		
		// cast to double here to get full result. (double)num1/num2
		// no arithmetic exception will be thrown for dividing by zero though, so you'd maybe want to also add your own logic above to throw that.
		System.out.println(num1 + " divided by " + num2 + " = " + num1/num2); 
	}
	
}
