package com.dao;

 
	import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.model.User;

	public class UserDAO {
	    private Connection connection;

	    public UserDAO(Connection connection) {
	        this.connection = connection;
	    }

	    public void addUser(User user) throws SQLException {
	        String sql = "INSERT INTO users (username, password, email, full_name, phone_number, role) VALUES (?, ?, ?, ?, ?, ?)";
	        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
	            stmt.setString(1, user.getUsername());
	            stmt.setString(2, user.getPassword());
	            stmt.setString(3, user.getEmail());
	            stmt.setString(4, user.getFullName());
	            stmt.setString(5, user.getPhoneNumber());
	            stmt.setString(6, user.getRole());
	            stmt.executeUpdate();
	        }
	    }

	    public User getUser(int userId) throws SQLException {
	        String sql = "SELECT * FROM users WHERE user_id = ?";
	        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
	            stmt.setInt(1, userId);
	            ResultSet rs = stmt.executeQuery();
	            if (rs.next()) {
	                return mapRowToUser(rs);
	            }
	            return null;
	        }
	    }

	    private User mapRowToUser(ResultSet rs) throws SQLException {
	        User user = new User();
	        user.setUserId(rs.getInt("user_id"));
	        user.setUsername(rs.getString("username"));
	        user.setPassword(rs.getString("password"));
	        user.setEmail(rs.getString("email"));
	        user.setFullName(rs.getString("full_name"));
	        user.setPhoneNumber(rs.getString("phone_number"));
	        user.setRole(rs.getString("role"));
	        user.setCreatedAt(rs.getTimestamp("created_at"));
	        return user;
	    }

	    // Implement updateUser, deleteUser, and other CRUD methods
	}

