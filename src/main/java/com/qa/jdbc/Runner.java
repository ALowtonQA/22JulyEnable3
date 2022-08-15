package com.qa.jdbc;

public class Runner {

	public static void main(String[] args) {
		TestingJDBC myJDBC = new TestingJDBC("jdbc:mysql://localhost:3306/julyenabledb", "root", "root");
		
		myJDBC.testConnection();
	}
	
}
