package com.niit.UcBack.DAO;

import java.util.List;

import com.niit.UcBack.Model.Blog;

public interface BlogDao 

{
	boolean createBlog(Blog blog);
	
	boolean deleteBlog(Blog blog);
	boolean approveBlog(String emailId);
	boolean rejectBlog(String emailId);
	List<Blog> selectAllBlog();
	List<Blog> selectUserBlog(String emailId);
	Blog selectBlog(int blogId);
	
}
