package com.java.jdbc.preparedstatment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementDeleteDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver"); // loading the driver

			// next establish the connection

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "qwerty");
			PreparedStatement statement = con
					.prepareStatement("delete from customers where first_name=? and customer_id=?");
			statement.setString(1, "shon");
			statement.setInt(2, 8);

			int rowSDeleted = statement.executeUpdate();
			System.out.println("rows deleted so far " + rowSDeleted);
		} catch (SQLException ex) {

		}
	}

}
