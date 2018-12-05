package com.niit.UcBack.DAO;

import java.util.List;
import com.niit.UcBack.Model.Forum;

public interface ForumDao 
{
	boolean createForum(Forum Forum);
	boolean deleteForum(Forum Forum);
	boolean approveForum(int forumId);
	boolean rejectForum(int forumId);
	List<Forum> selectAllForum();
	List<Forum> selectUserForum(String emailId);
	Forum selectForum(int forumId);
}
