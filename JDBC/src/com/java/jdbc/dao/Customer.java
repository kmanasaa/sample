package com.java.jdbc.dao;

public class Customer {

	private int id;
	private String first_name;
	private String last_name;
	private String city;
	private String state;
	private int zipcode;

	public Customer(int id, String first_name, String last_name, String city, String state, int zipcode) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	public int getId() {
		return id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public int getZipcode() {
		return zipcode;
	}

}
