package com.model;

import java.sql.Timestamp;

public class Company {
	
	
	    private int companyId;
	    private String companyName;
	    private String location;
	    private String website;
	    private String description;
	    private Timestamp createdAt;
		public Company() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
		
		
		public Company(int companyId, String companyName, String location, String website, String description,
				Timestamp createdAt) {
			super();
			this.companyId = companyId;
			this.companyName = companyName;
			this.location = location;
			this.website = website;
			this.description = description;
			this.createdAt = createdAt;
		}





		public int getCompanyId() {
			return companyId;
		}
		public void setCompanyId(int companyId) {
			this.companyId = companyId;
		}
		public String getCompanyName() {
			return companyName;
		}
		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getWebsite() {
			return website;
		}
		public void setWebsite(String website) {
			this.website = website;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Timestamp getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(Timestamp createdAt) {
			this.createdAt = createdAt;
		}





		@Override
		public String toString() {
			return "Company [companyId=" + companyId + ", companyName=" + companyName + ", location=" + location
					+ ", website=" + website + ", description=" + description + ", createdAt=" + createdAt + "]";
		}

	    
	    
	    // Getters and Setters
	    
	    
	}


	
	
