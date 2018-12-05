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

import com.niit.UcBack.DAO.BlogDao;
import com.niit.UcBack.Model.Blog;

@RestController
@RequestMapping("/Blog")
public class BlogRestController 
{
	@Autowired
	BlogDao blogdao;
	
	@GetMapping
	 public ResponseEntity<List<Blog>> selectallblog()
	 {
		List<Blog> b=blogdao.selectAllBlog();
		if(b!=null)
		{
			return new ResponseEntity<List<Blog>>(b,HttpStatus.FOUND);
		}
		else
		{
			return new ResponseEntity<List<Blog>>(HttpStatus.NO_CONTENT);
		}
		
	 }
	
	@GetMapping("/{blogid}")
	 public ResponseEntity<Blog> selectoneblog(@PathVariable("blogid") int blogid)
	 {
		System.out.println(blogid);
		Blog b=blogdao.selectBlog(blogid);
		if(b!=null)
		{
			return new ResponseEntity<Blog>(b,HttpStatus.FOUND);
		}
		else
		{
			return new ResponseEntity<Blog>(HttpStatus.NO_CONTENT);
		}
		
	 }
	
	@PostMapping
	public ResponseEntity<Void> InsertOrUpdateBlog(@RequestBody Blog blog)
	{
		System.out.println("df");
		blog.setCreateDate((new Date()).toString());
		if(blogdao.createBlog(blog))
		{
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
	}
	@DeleteMapping("/{blogid}")
	public ResponseEntity<Void> DeleteBlog(@PathVariable("id") int id)
	{
		if(blogdao.deleteBlog(blogdao.selectBlog(id)))
		{
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
	}
}
