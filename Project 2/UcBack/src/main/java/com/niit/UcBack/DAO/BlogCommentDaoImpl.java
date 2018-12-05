package com.niit.UcBack.DAO;


import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.niit.UcBack.Model.BlogComment;

@Transactional
@Repository("blogCommentDao")
public class BlogCommentDaoImpl implements BlogCommentDao 
{
	@Autowired
	SessionFactory sf;
	public boolean addComment(BlogComment comment)
	{
		try
		{
			sf.getCurrentSession().save(comment);
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}

	}

	public boolean deleteComment(BlogComment comment) 
	{
		try
		{
			sf.getCurrentSession().save(comment);
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}
	}

	public BlogComment getBlogComment(int blogCommentId) 
	{
	try
	{
		BlogComment commentblog=(BlogComment)sf.getCurrentSession().createQuery("from BlogComment where commentId="+blogCommentId).uniqueResult();
		 return commentblog;
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
		return null;
	}
	}	

	public List<BlogComment> listBlogComments(int blogId) 
	{
		try
		{
			 @SuppressWarnings("unchecked")
			List<BlogComment> blogComments=(List<BlogComment>)sf.getCurrentSession().createQuery("from BlogComment where blogId="+blogId).list();
			 return blogComments;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}
		
	}
	
}
