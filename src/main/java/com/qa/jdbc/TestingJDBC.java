package com.qa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestingJDBC {

	// login details
	String jdbcConnectionURL;
	String username;
	String password;
	
	public TestingJDBC(String jdbcConnectionURL, String username, String password) {
		this.jdbcConnectionURL = jdbcConnectionURL;
		this.username = username;
		this.password = password;
	}
	
	public void testConnection() {
		Connection conn = null;
		
		try {
			System.out.println("Trying database connection...");
			conn = DriverManager.getConnection(jdbcConnectionURL, username, password);
			System.out.println("I've connected!");
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}	
}
