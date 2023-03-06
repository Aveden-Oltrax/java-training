/**
 * 
 */
package com.example.demomvc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author 158417
 *
 */
public class Database {
	
	private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/spring";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "root";

	private Database() {}

	public static Connection getDBConnection() throws SQLException {
		Connection connection = null;

		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException exception) {
			System.out.println(exception);
		}

		try {
			connection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
			return connection;
		} catch (SQLException exception) {
			System.out.println(exception);
		}

		return connection;
	}

}
