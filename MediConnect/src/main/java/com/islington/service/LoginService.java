package com.islington.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.islington.config.Dbconfig;
import com.islington.model.UserModel;

public class LoginService {
	
	private Connection DbConnection;
	
	public LoginService() {
		try {
			DbConnection = Dbconfig.getDbConnection();
		}catch(SQLException | ClassNotFoundException ex) {
			System.out.println("Error");
			ex.printStackTrace();
		}
	}
	
	public Boolean loginUser(UserModel userModel){
		
		if(DbConnection == null) {
			System.out.println("Database not connected!");
			return null;
		}
		
			String fetchStmt = "SELECT user_username, user_password FROM users WHERE user_username = ?";
			
			try {
				PreparedStatement stmt = DbConnection.prepareStatement(fetchStmt);
				stmt.setString(1, userModel.getUser_username());
				
				ResultSet result = stmt.executeQuery();

				if (result.next()) {
					return validatePassword(result, userModel);
				}
				
			}catch(SQLException e) {
				e.printStackTrace();
				return null;
			}
		
		return false;
		}
	
	public Boolean validatePassword(ResultSet result, UserModel userModel) throws SQLException{
		String dbUsername = result.getString("user_username");
		String dbPassword = result.getString("user_password");
		
		return dbUsername.equals(userModel.getUser_username()) && dbPassword.equals(userModel.getUser_password());
	}
	
}