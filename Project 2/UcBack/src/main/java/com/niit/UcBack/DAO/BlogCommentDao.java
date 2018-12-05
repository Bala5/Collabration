package com.niit.UcBack.DAO;

import java.util.List;

import com.niit.UcBack.Model.BlogComment;

public interface BlogCommentDao 
{
	public boolean addComment(BlogComment comment);
	public boolean deleteComment(BlogComment comment);
	public BlogComment getBlogComment(int blogCommentId);
	public List<BlogComment> listBlogComments(int blogId);
	
}
