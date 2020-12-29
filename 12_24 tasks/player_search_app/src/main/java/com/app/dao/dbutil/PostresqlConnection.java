package com.app.dao.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostresqlConnection {

	private static Connection connection;
	
	private PostresqlConnection() {
		// TODO Auto-generated constructor stub
	}
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("org.postgresql.Driver");
		String url = "jdbc:postgresql://localhost:5432/test2";
		String username = "postgres";
		String password = "arsenalfc97";
		connection = DriverManager.getConnection(url,username,password);
		return connection;
	}
}
