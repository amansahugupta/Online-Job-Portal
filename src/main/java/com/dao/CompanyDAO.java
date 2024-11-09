package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Company;

public class CompanyDAO {
	    private Connection connection;

	    public CompanyDAO(Connection connection) {
	        this.connection = connection;
	    }

	    public void addCompany(Company company) throws SQLException {
	        String sql = "INSERT INTO companies (company_name, location, website, description) VALUES (?, ?, ?, ?)";
	        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
	            stmt.setString(1, company.getCompanyName());
	            stmt.setString(2, company.getLocation());
	            stmt.setString(3, company.getWebsite());
	            stmt.setString(4, company.getDescription());
	            stmt.executeUpdate();
	        }
	    }

	    // Implement other CRUD methods similarly
	}

	
	
	
	
	

