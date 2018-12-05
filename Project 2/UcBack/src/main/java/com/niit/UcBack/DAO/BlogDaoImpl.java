package com.niit.UcBack.DAO;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.niit.UcBack.Model.Blog;

@Repository("blogdao")
@Transactional
public class BlogDaoImpl implements BlogDao 
{
	@Autowired
	SessionFactory sf;
	public boolean createBlog(Blog blog) 
	{
		try
		{
			sf.getCurrentSession().saveOrUpdate(blog);
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}
	}

	

	public boolean deleteBlog(Blog blog) 
	{
		try
		{
			sf.getCurrentSession().delete(blog);
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}
	}

	public boolean approveBlog(String emailId) 
	{
		// TODO Auto-generated method stub
		return false;
	}

	public boolean rejectBlog(String emailid) 
	{
		// TODO Auto-generated method stub
		return false;
	}

	@SuppressWarnings("unchecked")
	public List<Blog> selectAllBlog()
	{
		try
		{
			
			ArrayList<Blog> blog=(ArrayList<Blog>)sf.getCurrentSession().createQuery("from Blog").list();
			return blog;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}
		

	}

	@SuppressWarnings("unchecked")
	public List<Blog> selectUserBlog(String emailId)
	{
		try
		{
			
			ArrayList<Blog> blog=(ArrayList<Blog>)sf.getCurrentSession().createQuery("from Blog where EmailId='"+emailId+"'").list();
			return blog;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}
	}

	public Blog selectBlog(int blogId) 
	{
		try {
			Blog blog = (Blog) sf.getCurrentSession()
					.createQuery("from Blog where blogId="+blogId).uniqueResult();
			return blog;
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			return null;
		}
	}

}
