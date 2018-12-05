package com.niit.UcBack.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
@Entity
public class Job 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int jobId;
	
	@Column(nullable=false)
	@NotEmpty(message = "BlogName cannot be blank")
	private String jobName;
	
	@Column(nullable=false)
	@NotEmpty(message = "BlogDescription cannot be blank")
	private String jobDescription;
	
	private Date jobPostedDate;
	private Date jobLastDate;
	private String salary;
	private String status;
	private String companyName;
	private String designation;
	
	
	
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public Date getJobPostedDate() {
		return jobPostedDate;
	}
	public void setJobPostedDate(Date jobPostedDate) {
		this.jobPostedDate = jobPostedDate;
	}
	public Date getJobLastDate() {
		return jobLastDate;
	}
	public void setJobLastDate(Date jobLastDate) {
		this.jobLastDate = jobLastDate;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	
	
	

}
