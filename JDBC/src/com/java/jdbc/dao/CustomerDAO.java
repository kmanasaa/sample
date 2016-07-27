package com.java.jdbc.dao;

import java.util.List;

public interface CustomerDAO {
	List<Customer> getAllCustomers() throws ClassNotFoundException;
	void createCustomer(Customer customer);
	void updateCustomer(Customer customer);
	void deleteCustomer(int customerId);

}
