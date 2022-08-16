package com.qa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
		} catch (SQLException e) {
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

		try (Connection conn = DriverManager.getConnection(jdbcConnectionURL, username, password);
				Statement statement = conn.createStatement();) {

			statement.executeUpdate("INSERT INTO customer(first_name, last_name, email) VALUES ('"
					+ customer.getFirstName() + "','" + customer.getLastName() + "','" + customer.getEmail() + "')");

			System.out.println("Customer created.");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public Customer createPrepared(Customer customer) {

		try (Connection conn = DriverManager.getConnection(jdbcConnectionURL, username, password);
				PreparedStatement statement = conn
						.prepareStatement("INSERT INTO customer (first_name, last_name, email) VALUES (?,?,?)")) {

			statement.setString(1, customer.getFirstName());
			statement.setString(2, customer.getLastName());
			statement.setString(3, customer.getEmail());
			statement.executeUpdate();
			System.out.println("Customer created:");
			
			return readLatest();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	// MODEL FROM RESULTSET METHOD
	public Customer customerFromResultSet(ResultSet resultSet) throws SQLException {
		int id = resultSet.getInt("id");
		String firstName = resultSet.getString("first_name");
		String lastName = resultSet.getString("last_name");
		String email = resultSet.getString("email");

		return new Customer(id, firstName, lastName, email);
	}

	// READ
	public List<Customer> readAll() {

		try (Connection conn = DriverManager.getConnection(jdbcConnectionURL, username, password);
				Statement statement = conn.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * from customer")) {

			List<Customer> customers = new ArrayList<>();

			while (resultSet.next()) {
				customers.add(customerFromResultSet(resultSet));
			}

			return customers;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	public Customer readById(int id) {

		try (Connection conn = DriverManager.getConnection(jdbcConnectionURL, username, password);
				PreparedStatement statement = conn.prepareStatement("SELECT * FROM customer WHERE id = ?")) {

			statement.setInt(1, id);
			ResultSet resultSet = statement.executeQuery();
			resultSet.next();
			return customerFromResultSet(resultSet);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	public Customer readLatest() {
		try (Connection conn = DriverManager.getConnection(jdbcConnectionURL, username, password);
				Statement statement = conn.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM customer ORDER BY id DESC LIMIT 1");) {
			resultSet.next();
			return customerFromResultSet(resultSet);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	// UPDATE
	public Customer update(Customer customer) {

		try (Connection conn = DriverManager.getConnection(jdbcConnectionURL, username, password);
				PreparedStatement statement = conn.prepareStatement(
						"UPDATE customer SET first_name = ?, last_name = ?, email = ? WHERE id = ?")) {

			statement.setString(1, customer.getFirstName());
			statement.setString(2, customer.getLastName());
			statement.setString(3, customer.getEmail());
			statement.setInt(4, customer.getId());
			statement.executeUpdate();
			System.out.println("Customer updated:");
			
			return readById(customer.getId());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	// DELETE
	// DELETE STATEMENT
	public void delete(int id) {
		try (Connection conn = DriverManager.getConnection(jdbcConnectionURL, username, password);
				PreparedStatement statement = conn.prepareStatement("DELETE FROM customer WHERE id = ?")) {

			statement.setInt(1, id);
			statement.executeUpdate();
			System.out.println("delete successful");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
