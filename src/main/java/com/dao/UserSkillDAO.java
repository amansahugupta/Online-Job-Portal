package com.dao;

import java.sql.*;

public class UserSkillDAO {
    private Connection connection;

    public UserSkillDAO(Connection connection) {
        this.connection = connection;
    }

    public void addUserSkill(int userId, int skillId) throws SQLException {
        String sql = "INSERT INTO user_skills (user_id, skill_id) VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, userId);
            stmt.setInt(2, skillId);
            stmt.executeUpdate();
        }
    }

    // Implement other CRUD methods similarly
}


