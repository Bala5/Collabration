package com.niit.UcBack.DAO;

import java.util.List;

import com.niit.UcBack.Model.Job;

public interface JobDao {

	boolean createJob(Job job);

	

	boolean deleteJob(Job job);

	boolean approveJob(int jobId);

	boolean rejectJob(int jobId);

	List<Job> selectAllJob();

	Job selectJob(int Jobid);
}
