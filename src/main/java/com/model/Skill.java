package com.model;

public class Skill {

	
	
	    private int skillId;
	    private String skillName;
		public Skill() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Skill(int skillId, String skillName) {
			super();
			this.skillId = skillId;
			this.skillName = skillName;
		}
		public int getSkillId() {
			return skillId;
		}
		public void setSkillId(int skillId) {
			this.skillId = skillId;
		}
		public String getSkillName() {
			return skillName;
		}
		public void setSkillName(String skillName) {
			this.skillName = skillName;
		}
		@Override
		public String toString() {
			return "Skill [skillId=" + skillId + ", skillName=" + skillName + "]";
		}

	    // Getters and Setters
	
}
