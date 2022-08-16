package com.qa.jdbc;

import java.util.List;

import com.qa.jdbc.domain.Customer;

public class Runner {

	public static void main(String[] args) {
		TestingJDBC myJDBC = new TestingJDBC("jdbc:mysql://localhost:3306/julyenabledb", "root", "root");
		
//		myJDBC.testConnection();

//		Customer entry = new Customer("Tom", "Smith", "randomEmail@qa.com");
		
//		myJDBC.create(entry);
		
//		System.out.println(myJDBC.createPrepared(entry));
//		
//		System.out.println(myJDBC.readById(1));
//		
//		for (Customer customer : myJDBC.readAll())  {
//			System.out.println(customer);
//		}
//		
		Customer update = new Customer(1, "Anoush", "Lowton", "AnotherEmail@email.com");
	
		System.out.println(myJDBC.update(update));
//		
//		myJDBC.delete(3);
	}	
}
