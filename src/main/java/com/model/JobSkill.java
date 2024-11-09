package com.model;

public class JobSkill {

	
	    private int jobId;
	    private int skillId;
		/**
		 * 
		 */
		public JobSkill() {
			super();
			// TODO Auto-generated constructor stub
		}
		/**
		 * @param jobId
		 * @param skillId
		 */
		public JobSkill(int jobId, int skillId) {
			super();
			this.jobId = jobId;
			this.skillId = skillId;
		}
		public int getJobId() {
			return jobId;
		}
		public void setJobId(int jobId) {
			this.jobId = jobId;
		}
		public int getSkillId() {
			return skillId;
		}
		public void setSkillId(int skillId) {
			this.skillId = skillId;
		}
		@Override
		public String toString() {
			return "JobSkill [jobId=" + jobId + ", skillId=" + skillId + "]";
		}

	    // Getters and Setters\
	    
	    
	}

