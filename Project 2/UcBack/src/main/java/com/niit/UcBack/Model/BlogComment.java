package com.niit.UcBack.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class BlogComment
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int commentId;
	int blogId;
	private String commentText;
	private String loginName;
	private String commentDate;
	
	
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public int getBlogId() {
		return blogId;
	}
	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}
	public String getCommentText() {
		return commentText;
	}
	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(String string) {
		this.commentDate = string;
	
		
	}
	


}
