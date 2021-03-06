package com.niit.UcMiddle.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niit.UcBack.DAO.ForumCommentDao;
import com.niit.UcBack.Model.ForumComment;

@RestController
@RequestMapping(value="ForumComment")
public class ForumCommentRestController 
{
	@Autowired
	ForumCommentDao forumcommentDAO;
	@GetMapping("/{forumid}")
	public ResponseEntity<List<ForumComment>> getAllForumComments(@PathVariable("forumid") int id)
	{
		System.out.println("hi");
		List<ForumComment> blog=forumcommentDAO.listForumComments(id);
		if(blog.isEmpty())
		{
			return new ResponseEntity<List<ForumComment>>(HttpStatus.NO_CONTENT);
		}
		else
		{
			return new ResponseEntity<List<ForumComment>>(blog,HttpStatus.OK);
		}		
	}
		
	@PostMapping
	
	public ResponseEntity<Void> InsertOrUpdateBlog(@RequestBody ForumComment comment)
	{
		comment.setForumCommentDate((new Date()).toString());
	
		if(forumcommentDAO.addComment(comment))
		{
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> DeleteBlog(@PathVariable("id") int id)
	{
		if(forumcommentDAO.deleteComment(forumcommentDAO.getForumComment(id)))
		{
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
	}
}
