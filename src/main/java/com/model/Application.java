package com.model;

import java.sql.Timestamp;

public class Application {

	private int applicationId;
	private int jobId;
	private int applicantId;
	private String coverLetter;
	private String resume;
	private String status;
	private Timestamp appliedAt;

	public Application() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Application(int applicationId, int jobId, int applicantId, String coverLetter, String resume, String status,
			Timestamp appliedAt) {
		super();
		this.applicationId = applicationId;
		this.jobId = jobId;
		this.applicantId = applicantId;
		this.coverLetter = coverLetter;
		this.resume = resume;
		this.status = status;
		this.appliedAt = appliedAt;
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public int getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}

	public String getCoverLetter() {
		return coverLetter;
	}

	public void setCoverLetter(String coverLetter) {
		this.coverLetter = coverLetter;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getAppliedAt() {
		return appliedAt;
	}

	public void setAppliedAt(Timestamp appliedAt) {
		this.appliedAt = appliedAt;
	}

	@Override
	public String toString() {
		return "Application [applicationId=" + applicationId + ", jobId=" + jobId + ", applicantId=" + applicantId
				+ ", coverLetter=" + coverLetter + ", resume=" + resume + ", status=" + status + ", appliedAt="
				+ appliedAt + "]";
	}

	// Getters and Setters

}
