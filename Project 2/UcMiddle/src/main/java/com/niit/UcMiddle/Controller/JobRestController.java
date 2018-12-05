package com.niit.UcMiddle.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niit.UcBack.DAO.JobDao;
import com.niit.UcBack.Model.Job;

@RestController
@RequestMapping("/Job")
public class JobRestController 
{
	@Autowired
	JobDao jobDAO;
	
	@GetMapping
	public ResponseEntity<List<Job>> getAllJobs()
	{
	List<Job> jobs = jobDAO.selectAllJob();
	if(jobs.isEmpty())
	{
		return new ResponseEntity<List<Job>>(jobs, HttpStatus.NO_CONTENT);
	}
	else
	{
		return new ResponseEntity<List<Job>>(jobs, HttpStatus.OK);
	}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Job> getOneJob(@PathVariable("id") int id)
	{
	Job job = jobDAO.selectJob(id);
	if(job != null)
	{
		return new ResponseEntity<Job>(job, HttpStatus.OK);
	}
	else
	{
		return new ResponseEntity<Job>(job, HttpStatus.NO_CONTENT);
	}
	}
	@PostMapping
	
	public ResponseEntity<Void> insertOrUpdateJob(@RequestBody Job job)
	{
	if(jobDAO.createJob(job)) {
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	else
	{
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteJob(@PathVariable("id") int id)
	{
	if(jobDAO.deleteJob(jobDAO.selectJob(id))) {
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	else 
	{
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	}
}
