package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUpdateDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// load the driver
		// establish the connection
Class.forName("com.mysql.jdbc.Driver");
//second step establish the connection
try
{
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "qwerty");
	Statement statement=con.createStatement();
int rowsUpdated=statement.executeUpdate("update customers set first_name='shiva' where customer_id=4");
System.out.println("rows updated  " + rowsUpdated);
	
	}catch(SQLException ex)
{
		ex.printStackTrace();
}
finally
{
	
}
	}

}
