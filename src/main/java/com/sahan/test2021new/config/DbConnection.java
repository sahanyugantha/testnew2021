package com.sahan.test2021new.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
	private static final String DB_URL = "jdbc:mysql://localhost:3306/cardb";
	private static final String DB_USER = "root";
	private static final String DB_PASS = "root";
	
	public static Connection getConnection() {
		
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
			
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}

}

