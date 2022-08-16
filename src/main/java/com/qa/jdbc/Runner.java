package com.qa.jdbc;

import java.util.List;

import com.qa.jdbc.domain.Customer;

public class Runner {

	public static void main(String[] args) {
		TestingJDBC myJDBC = new TestingJDBC("jdbc:mysql://localhost:3306/julyenabledb", "root", "root");
		
//		myJDBC.testConnection();

		Customer anoush = new Customer("Anoush", "Lowton", "alowton2@qa.com");
		
//		myJDBC.create(anoush);
//		myJDBC.createPrepared(anoush);
		
		System.out.println(myJDBC.readById(1));
		
		for (Customer customer : myJDBC.readAll())  {
			System.out.println(customer);
		}
		
	}	
}
