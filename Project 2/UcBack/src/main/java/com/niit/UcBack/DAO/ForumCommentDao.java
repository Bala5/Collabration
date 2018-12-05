package com.niit.UcBack.DAO;

import java.util.List;

import com.niit.UcBack.Model.ForumComment;

public interface ForumCommentDao 
{
	public boolean addComment(ForumComment comment);
	public boolean deleteComment(ForumComment comment);
	public ForumComment getForumComment(int forumCommentId);
	public List<ForumComment> listForumComments(int forumId);
}
