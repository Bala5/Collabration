/*package com.niit.UcBack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.niit.UcBack.DAO.BlogCommentDao;
import com.niit.UcBack.Model.BlogComment;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitConfig(DBConfig.class)
public class BlogCommentTest 


{
@Autowired
 BlogCommentDao blogcommentdao;
 BlogComment b=new BlogComment();
 

	@Before
	public void setUp() throws Exception
	{
		b.setCommentText("helolo");
		
	}
 
	@Test
	public void test() 
	{
		assertEquals("ok", true, blogcommentdao.addComment(b));
	}

}
*/