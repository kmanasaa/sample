package com.java.jdbc.dao;

import java.util.List;

public class CustomerDAOJDBCImplDemo {

	public static void main(String[] args) throws ClassNotFoundException {

		CustomerDAO dao=new CustomerDAOJDBCImpl();
		List<Customer> customers =dao.getAllCustomers();
		for(Customer c:customers)
		{
			System.out.println("firstname " +c.getFirst_name());
		}
		
	}

}
