package com.model;

import java.sql.Timestamp;

public class User {

	
	
	    private int userId;
	    private String username;
	    private String password;
	    private String email;
	    private String fullName;
	    private String phoneNumber;
	    private String role;
	    private Timestamp createdAt;
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		public User(int userId, String username, String password, String email, String fullName, String phoneNumber,
				String role, Timestamp createdAt) {
			super();
			this.userId = userId;
			this.username = username;
			this.password = password;
			this.email = email;
			this.fullName = fullName;
			this.phoneNumber = phoneNumber;
			this.role = role;
			this.createdAt = createdAt;
		}

		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getFullName() {
			return fullName;
		}
		public void setFullName(String fullName) {
			this.fullName = fullName;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public Timestamp getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(Timestamp createdAt) {
			this.createdAt = createdAt;
		}


		@Override
		public String toString() {
			return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", email=" + email
					+ ", fullName=" + fullName + ", phoneNumber=" + phoneNumber + ", role=" + role + ", createdAt="
					+ createdAt + "]";
		}
		
	    
		
	    
	    
	}

	
	

