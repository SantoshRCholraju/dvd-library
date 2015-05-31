package com.src.apps;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

//References: http://www.mkyong.com/jdbc/how-do-connect-to-postgresql-with-jdbc-driver-java/
public class TestDBConnection {
	
	static final String DB_USER = "postgres";
	static final String DB_PASSWD = "Password1";
 
	public static void main(String[] argv) {
 
		System.out.println("-------- PostgreSQL JDBC Connection Testing ------------");
 
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) { 
			System.out.println("Where is your PostgreSQL JDBC Driver? "+ "Include in your library path!");
			e.printStackTrace();
			return;
		}
 
		System.out.println("PostgreSQL JDBC Driver Registered!"); 
		Connection connection = null;
 
		try { 
			connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/testdb", DB_USER, DB_PASSWD);
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
		}
 
		if (connection != null) {
			System.out.println("**********PostgreSQL DB Connection SUCCESSFUL!***********");
		} else {
			System.out.println("**********PostgreSQL DB Connection FAILED!***********");
		}
	}
 
}