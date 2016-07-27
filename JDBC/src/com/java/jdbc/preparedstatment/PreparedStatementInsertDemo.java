package com.java.jdbc.preparedstatment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementInsertDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		Connection con = null;
		PreparedStatement statement = null;
		Class.forName("com.mysql.jdbc.Driver");
		// second step establish the connection
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "qwerty");

			String sql = "insert into customers values(?,?,?,?,?,?)";
			statement = con.prepareStatement(sql);
			statement.setInt(1, 9);
			statement.setString(2, "leena");
			statement.setString(3, "anand");
			statement.setString(4, "new york city");
			statement.setString(5, "nyc");
			statement.setInt(6, 87659);
			System.out.println(sql.toString());
			;
			int rowsInserted = statement.executeUpdate();
			System.out.println("rows inserted = " + rowsInserted);

		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {

		}
	}
}