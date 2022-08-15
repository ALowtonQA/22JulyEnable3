package com.qa.exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Please enter two numbers");
//		int numberOne = scanner.nextInt();
//		int numberTwo = scanner.nextInt();
//		
//		System.out.println("result = " + (numberOne + numberTwo));
	
//		try {
//			System.out.println(10/0);
//		} catch(ArithmeticException ae) {
//			 
//			System.out.println("Please don't divide by zero");
////			e.printStackTrace();
//			
//		} catch(Exception e) {
//
//			System.out.println("some other exception was thrown here");
//			
//		} finally {
//			System.out.println("Hello");
//		}
		
		Maths maths = new Maths();
		
		try {
			maths.multiply(8, 5);
		} catch (MultiplyByFiveException mbfe) {
			System.out.println(mbfe.getMessage());
		} catch (Exception e) {
			System.out.println("Something else went wrong - investigate.");
		}
	}
}
