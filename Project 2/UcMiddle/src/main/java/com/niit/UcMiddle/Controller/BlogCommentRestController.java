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
import com.niit.UcBack.DAO.BlogCommentDao;
import com.niit.UcBack.Model.BlogComment;

@RestController
@RequestMapping("/BlogComment")
public class BlogCommentRestController 
{
	@Autowired
	BlogCommentDao blogcommentdao;
	 
	@GetMapping("/{blogcommentid}")
	 public ResponseEntity<BlogComment> selectblogcomment(@PathVariable("blogcommentid") int id)
	 {
		BlogComment b=blogcommentdao.getBlogComment(id);
		if(b!=null)
		{
			return new ResponseEntity<BlogComment>(b,HttpStatus.FOUND);
		}
		else
		{
			return new ResponseEntity<BlogComment>(HttpStatus.NO_CONTENT);
		}
		
	 }

	@GetMapping("/{blogid}")
	 public ResponseEntity<List<BlogComment>> selectallblogcomments(@PathVariable("blogid") int id)
	 {
		System.out.println("co");
		List<BlogComment> b=blogcommentdao.listBlogComments(id);
		if(b!=null)
		{
			return new ResponseEntity<List<BlogComment>>(b,HttpStatus.FOUND);
		}
		else
		{
			return new ResponseEntity<List<BlogComment>>(HttpStatus.NO_CONTENT);
		}
		
	 }
	@PostMapping
	public ResponseEntity<Void> InsertOrUpdateBlog(@RequestBody BlogComment blogcomment)
	{
		blogcomment.setCommentDate((new Date()).toString());
		if(blogcommentdao.addComment(blogcomment))
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
		if(blogcommentdao.deleteComment(blogcommentdao.getBlogComment(id)))
		{
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
	}


}
