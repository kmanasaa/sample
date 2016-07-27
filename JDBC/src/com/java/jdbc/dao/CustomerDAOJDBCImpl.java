package com.java.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAOJDBCImpl implements CustomerDAO {

	@Override
	public List<Customer> getAllCustomers() throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = null;
		Statement statement = null;
		ResultSet rs = null;
		
		List<Customer> customers=new ArrayList<Customer>();
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "qwerty");
			statement = con.createStatement();
			rs = statement.executeQuery("select * from customers");
			while (rs.next()) {
				int cusId = rs.getInt("customer_id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");

				String city = rs.getString("city");
				String state = rs.getString("state");
				int zip = rs.getInt("zip");
				Customer customer=new Customer(cusId,firstName,lastName,city,state,zip);
				customers.add(customer);

				
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			try {
				rs.close();
				statement.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return customers;
	}



	@Override
	public void createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		
	}

}
