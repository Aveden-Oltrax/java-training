/**
 * 
 */
package com.example.demomvc.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.example.demomvc.model.User;

/**
 * @author 158417
 *
 */
public class UserDAO {
	private static final String INSERT = "INSERT INTO user(name, password) VALUES(?, ?)";
	
	public void save(User user) {		
		try (Connection connection = Database.getDBConnection();
			PreparedStatement statement = connection.prepareStatement(INSERT);) {	
			int counter = 1;
			statement.setString(counter++, user.getName());
			statement.setString(counter++, user.getPassword());
			statement.executeUpdate();
		} catch (SQLException sqlException) {
			System.out.println(sqlException);
		}
	}


}
