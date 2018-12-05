package com.niit.UcBack.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ForumComment 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int forumCommentId;
	int forumId;
	private String forumCommentText;
	private String loginName;
	private String forumCommentDate;
	
	
	
	public int getForumCommentId() {
		return forumCommentId;
	}
	public void setForumCommentId(int forumCommentId) {
		this.forumCommentId = forumCommentId;
	}
	public int getForumId() {
		return forumId;
	}
	public void setForumId(int forumId) {
		this.forumId = forumId;
	}
	public String getForumCommentText() {
		return forumCommentText;
	}
	public void setForumCommentText(String forumCommentText) {
		this.forumCommentText = forumCommentText;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getForumCommentDate() {
		return forumCommentDate;
	}
	public void setForumCommentDate(String forumCommentDate) {
		this.forumCommentDate = forumCommentDate;
	}
	
	
}
