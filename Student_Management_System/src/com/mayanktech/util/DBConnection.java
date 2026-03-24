package com.mayanktech.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	private static final  String URL="jdbc:mysql://localhost:3306/studentdbrecord";
	private static final String USERNAME="root";
	private static final String PASSWORD="root";
	public DBConnection() {
		// TODO Auto-generated constructor stub
	}
	
	public static Connection getConnection() {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
			
			System.out.println("Connection Successful");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
	

}
