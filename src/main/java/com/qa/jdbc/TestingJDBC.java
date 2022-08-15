package com.qa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.qa.jdbc.domain.Customer;

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
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}
	}
	
	// CREATE
	public void create(Customer customer) {
		
		try(Connection conn = DriverManager.getConnection(jdbcConnectionURL, username, password);
				Statement statement = conn.createStatement();) {
			
			statement.executeUpdate("INSERT INTO customer(first_name, last_name, email) VALUES ('" + customer.getFirstName() + "','"
					+ customer.getLastName() +"','" + customer.getEmail() + "')");
			
			System.out.println("Customer created.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	// READ
	
	// UPDATE
	
	// DELETE
}
