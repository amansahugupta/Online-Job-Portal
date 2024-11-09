package com.dao;

import java.sql.*;

public class JobSkillDAO {
    private Connection connection;

    public JobSkillDAO(Connection connection) {
        this.connection = connection;
    }

    public void addJobSkill(int jobId, int skillId) throws SQLException {
        String sql = "INSERT INTO job_skills (job_id, skill_id) VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, jobId);
            stmt.setInt(2, skillId);
            stmt.executeUpdate();
        }
    }

    // Implement other CRUD methods similarly
}
