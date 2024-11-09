package com.dao;

import java.sql.*;

import com.model.Job;

public class JobDAO {

	
	    private Connection connection;

	    public JobDAO(Connection connection) {
	        this.connection = connection;
	    }

	    public void addJob(Job job) throws SQLException {
	        String sql = "INSERT INTO jobs (title, description, location, requirements, salary_range, posted_by, company_id) VALUES (?, ?, ?, ?, ?, ?, ?)";
	        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
	            stmt.setString(1, job.getTitle());
	            stmt.setString(2, job.getDescription());
	            stmt.setString(3, job.getLocation());
	            stmt.setString(4, job.getRequirements());
	            stmt.setString(5, job.getSalaryRange());
	            stmt.setInt(6, job.getPostedBy());
	            stmt.setInt(7, job.getCompanyId());
	            stmt.executeUpdate();
	        }
	    }

	    // Implement other CRUD methods similarly
	}

