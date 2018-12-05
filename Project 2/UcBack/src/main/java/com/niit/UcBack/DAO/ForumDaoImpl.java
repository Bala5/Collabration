package com.niit.UcBack.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.UcBack.Model.Forum;

@Repository("forumdao")
@Transactional
public class ForumDaoImpl implements ForumDao
{
	@Autowired
	SessionFactory sf;
	public boolean createForum(Forum forum) 
	{
		try
		{
			sf.getCurrentSession().saveOrUpdate(forum);
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}
	}

	
	public boolean deleteForum(Forum forum) 
	{
		try
		{
			sf.getCurrentSession().update(forum);
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}
	}

	public boolean approveForum(int forumId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean rejectForum(int forumId) {
		// TODO Auto-generated method stub
		return false;
	}

	@SuppressWarnings("unchecked")
	public List<Forum> selectAllForum()
	{
		try
		{
			
			ArrayList<Forum> forum=(ArrayList<Forum>)sf.getCurrentSession().createQuery("from Forum").list();
			return forum;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}
		

	}

	@SuppressWarnings("unchecked")
	public List<Forum> selectUserForum(String emailId)
	{
		try
		{
			
			ArrayList<Forum> forum=(ArrayList<Forum>)sf.getCurrentSession().createQuery("from Forum where EmailId ='"+emailId+"'").list();
			return forum;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}
	}

	public Forum selectForum(int forumId) 
	{
		try {
			Forum Forum = (Forum) sf.getCurrentSession()
					.createQuery("from Forum where ForumId='" +forumId+"'").uniqueResult();
			return Forum;
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			return null;
		}
	}

}
