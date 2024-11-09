package com.dao;

import java.sql.*;

import com.model.Skill;

public class SkillDAO {

	
	    private Connection connection;

	    public SkillDAO(Connection connection) {
	        this.connection = connection;
	    }

	    public void addSkill(Skill skill) throws SQLException {
	        String sql = "INSERT INTO skills (skill_name) VALUES (?)";
	        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
	            stmt.setString(1, skill.getSkillName());
	            stmt.executeUpdate();
	        }
	    }

	    // Implement other CRUD methods similarly
	}

