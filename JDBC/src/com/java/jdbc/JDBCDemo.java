package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// load the JDBC Driver
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = null;
		Statement statement = null;
		ResultSet rs = null;
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

				System.out.println("Firstname " + firstName);
				System.out.println("lastname " + lastName);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			rs.close();
			statement.close();
			con.close();
		}
		// establish the connection
		// get handled to statement
		// execute the SQL statement/query

	}

}
