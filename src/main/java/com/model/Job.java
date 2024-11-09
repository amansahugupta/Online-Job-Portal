package com.model;

import java.sql.Timestamp;

public class Job {

	private int jobId;
	private String title;
	private String description;
	private String location;
	private String requirements;
	private String salaryRange;
	private int postedBy;
	private int companyId;
	private Timestamp createdAt;

	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Job(int jobId, String title, String description, String location, String requirements, String salaryRange,
			int postedBy, int companyId, Timestamp createdAt) {
		super();
		this.jobId = jobId;
		this.title = title;
		this.description = description;
		this.location = location;
		this.requirements = requirements;
		this.salaryRange = salaryRange;
		this.postedBy = postedBy;
		this.companyId = companyId;
		this.createdAt = createdAt;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getRequirements() {
		return requirements;
	}

	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}

	public String getSalaryRange() {
		return salaryRange;
	}

	public void setSalaryRange(String salaryRange) {
		this.salaryRange = salaryRange;
	}

	public int getPostedBy() {
		return postedBy;
	}

	public void setPostedBy(int postedBy) {
		this.postedBy = postedBy;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Job [jobId=" + jobId + ", title=" + title + ", description=" + description + ", location=" + location
				+ ", requirements=" + requirements + ", salaryRange=" + salaryRange + ", postedBy=" + postedBy
				+ ", companyId=" + companyId + ", createdAt=" + createdAt + "]";
	}

	// Getters and Setters
}
