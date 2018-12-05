package com.niit.UcBack.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


@Entity
@SequenceGenerator(name="blogidseq",sequenceName="myblogseqs")
public class Blog 

{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int blogId;
	
	@Column(unique=true,nullable=false)
	private String blogName;
	
	@Column(unique=true,nullable=false)
	private String blogDescription;
	private String createDate;
	private String loginName;
	private String status;
	private int likes;
	private int disLikes;
	
	
	
	public int getBlogId() {
		return blogId;
	}
	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}
	public String getBlogName() {
		return blogName;
	}
	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}
	public String getBlogDescription() {
		return blogDescription;
	}
	public void setBlogDescription(String blogDescription) {
		this.blogDescription = blogDescription;
	}
	
	
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String string) {
		this.createDate = string;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public int getDisLikes() {
		return disLikes;
	}
	public void setDisLikes(int disLikes) {
		this.disLikes = disLikes;
	}
	
	
	
	
	
}
