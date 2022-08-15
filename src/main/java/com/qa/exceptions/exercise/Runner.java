package com.qa.exceptions.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Maths maths = new Maths();
		
		while(true) {
			try {
				System.out.println("Please enter two integers");
				int num1 = scanner.nextInt();
				int num2 = scanner.nextInt();
				maths.divide(num1, num2);
				break;
			} catch(InputMismatchException ime) {
				System.out.println("Both numbers must be ints. Try Again...");
				scanner.nextLine();
				continue;
			} catch(ArithmeticException ime) {
				System.out.println("You can't divide by zero. Try Again...");
				scanner.nextLine();
				continue;
			} catch(DivisionException de) {
				System.out.println(de.getMessage());
				scanner.nextLine();
				continue;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
