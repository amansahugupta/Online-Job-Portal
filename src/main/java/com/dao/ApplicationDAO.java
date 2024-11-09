package com.dao;

import java.sql.*;

import com.model.Application;

public class ApplicationDAO {

	
	    private Connection connection;

	    public ApplicationDAO(Connection connection) {
	        this.connection = connection;
	    }

	    public void addApplication(Application application) throws SQLException {
	        String sql = "INSERT INTO applications (job_id, applicant_id, cover_letter, resume, status) VALUES (?, ?, ?, ?, ?)";
	        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
	            stmt.setInt(1, application.getJobId());
	            stmt.setInt(2, application.getApplicantId());
	            stmt.setString(3, application.getCoverLetter());
	            stmt.setString(4, application.getResume());
	            stmt.setString(5, application.getStatus());
	            stmt.executeUpdate();
	        }
	    }

	    // Implement other CRUD methods similarly
	}

