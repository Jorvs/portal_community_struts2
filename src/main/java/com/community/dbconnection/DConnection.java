package com.community.dbconnection;

// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.SQLException;
import java.sql.*;
public class DConnection {
	
	
	public static Connection getConnectionToMySQL() {
	
	Connection  connection = null;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
//		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Mysql JDBC Driver Registered!");
		
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/community_portal", "root", "");
		
		
	}catch (ClassNotFoundException e) {
		System.out.println("MYSQL JDBC Driver not found !!");
		return null;
	}catch(SQLException e) {
		System.out.println("Connection failed");
		System.out.println(e.getMessage());
	}
	if(connection !=null) {
		System.out.println("connection made");
	}
	return connection;
	
}// end of connection function
	

public static void closeConnection(Connection conn) {
	
	
	try {
		conn.close();
	}catch (SQLException e) {
		e.printStackTrace();
	}
	
}
	
	
	
	

}
