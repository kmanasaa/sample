package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsertDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = null;
		Statement statement = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "qwerty");
			statement = con.createStatement();
			StringBuilder sql=new StringBuilder();
			sql.append("insert into customers values(");
			sql.append("8,");
			sql.append("'shon',");
			sql.append("'sl',");
			sql.append("'miami',");
			sql.append("'ny',");
			sql.append("07592)");
			System.out.println(sql.toString());
		int rowsInserted=statement.executeUpdate(sql.toString());
		System.out.println("rowsInserted = "+rowsInserted );
		
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			try
			{
			
			statement.close();
			con.close();
			}
			catch(SQLException ex)
			{
			}
		}
		// establish the connection
		// get handled to statement
		// execute the SQL statement/query

	}
	

}
