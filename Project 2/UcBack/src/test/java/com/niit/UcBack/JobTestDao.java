package com.niit.UcBack;

import static org.junit.Assert.assertEquals;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.niit.UcBack.DAO.JobDao;
import com.niit.UcBack.Model.Job;

@SpringJUnitConfig(DBConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class JobTestDao 
{
	@Autowired
	JobDao jobdao;
	Job job=new Job();
	
	@Before
	public void setUp() throws Exception
	{
		job.setCompanyName("CTS");
		job.setDesignation("support eng");
		job.setJobDescription("have a");
		job.setJobName("IT");
		job.setSalary("50000");
		job.setStatus("Active");
	}
	@Test
	public void test() 
	{
		try {
			assertEquals("inserted", true, jobdao.createJob(job));
			}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@After
	public void tearDown()
	{
		//jobdao.deleteJob(job);
	}
}
