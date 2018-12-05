package com.niit.UcBack;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.niit.UcBack.DAO.BlogDao;
import com.niit.UcBack.Model.Blog;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitConfig(DBConfig.class)
public class BlogTestDao 
{
	@Autowired
	BlogDao blogdao;
	Blog b=new Blog();

	@Before
	public void setUp() throws Exception
	{
		b.setBlogName("Bala");
		b.setBlogDescription("yiouyu");
		b.setDisLikes(0);
		b.setLikes(0);
		b.setLoginName("BALA5");
		b.setStatus("a");
	}
	@Test
	public void test() {
		assertEquals("deleted", true,blogdao.createBlog(b));
	}

}
