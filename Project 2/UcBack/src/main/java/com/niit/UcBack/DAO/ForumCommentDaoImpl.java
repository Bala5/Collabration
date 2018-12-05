package com.niit.UcBack.DAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.UcBack.Model.ForumComment;
@Repository("forumCommentDao")
@Transactional
public class ForumCommentDaoImpl implements ForumCommentDao
{
	@Autowired
	SessionFactory sf;
	
	public boolean addComment(ForumComment comment)
	{
		try
		{
			sf.getCurrentSession().saveOrUpdate(comment);
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}

	}

	public boolean deleteComment(ForumComment comment) 
	{
		try
		{
			sf.getCurrentSession().delete(comment);
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}
	}

	public ForumComment getForumComment(int forumCommentId) 
	{
	try
	{
		ForumComment commentForum=(ForumComment)sf.getCurrentSession().createQuery("from ForumComment where forumCommentId="+forumCommentId).uniqueResult();
		 return commentForum;
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
		return null;
	}
	}	

	public List<ForumComment> listForumComments(int forumId) 
	{
		try
		{
			 @SuppressWarnings("unchecked")
			List<ForumComment> forumComments=(List<ForumComment>)sf.getCurrentSession().createQuery("from ForumComment where forumId ="+forumId).list();
			 return forumComments;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}
		
	}
	
}
