package com.model;

public class UserSkill {

	
	    private int userId;
	    private int skillId;
		public UserSkill() {
			super();
			// TODO Auto-generated constructor stub
		}
		public UserSkill(int userId, int skillId) {
			super();
			this.userId = userId;
			this.skillId = skillId;
		}
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public int getSkillId() {
			return skillId;
		}
		public void setSkillId(int skillId) {
			this.skillId = skillId;
		}
		@Override
		public String toString() {
			return "UserSkill [userId=" + userId + ", skillId=" + skillId + "]";
		}

	    // Getters and Setters
	    
	    
	}

