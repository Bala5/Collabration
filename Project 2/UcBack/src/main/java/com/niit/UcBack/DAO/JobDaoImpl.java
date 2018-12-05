package com.niit.UcBack.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.niit.UcBack.Model.Job;

@Repository("jobdao")
@Transactional
public class JobDaoImpl implements JobDao 
{

	@Autowired
	SessionFactory sf;

	public boolean createJob(Job job) 
	{
		try {
			sf.getCurrentSession().saveOrUpdate(job);
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}

	}

	

	public boolean deleteJob(Job job) 
	{
		try {
			sf.getCurrentSession().update(job);
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	public boolean approveJob(int jobId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean rejectJob(int jobId) {
		// TODO Auto-generated method stub
		return false;
	}

	@SuppressWarnings("unchecked")
	public List<Job> selectAllJob() 
	{
		try {

			ArrayList<Job> job = (ArrayList<Job>) sf.getCurrentSession().createQuery("from Job").list();
			return job;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	public Job selectJob(int Jobid) 
	{
		try {
			Job job = (Job) sf.getCurrentSession().createQuery("from Job where jobId="+Jobid).uniqueResult();
			return job;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}
