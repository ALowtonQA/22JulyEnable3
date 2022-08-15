package com.qa.jdbc;

import com.qa.jdbc.domain.Customer;

public class Runner {

	public static void main(String[] args) {
		TestingJDBC myJDBC = new TestingJDBC("jdbc:mysql://localhost:3306/julyenabledb", "root", "root");
		
//		myJDBC.testConnection();

		Customer anoush = new Customer("Anoush", "Lowton", "alowton@qa.com");
		
		myJDBC.create(anoush);
		
	}
	
}
