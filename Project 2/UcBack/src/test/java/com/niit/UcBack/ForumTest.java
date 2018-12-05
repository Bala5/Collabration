/*package com.niit.UcBack;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.niit.UcBack.DAO.ForumDao;
import com.niit.UcBack.Model.Forum;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitConfig(DBConfig.class)
public class ForumTest 
{
	@Autowired
	ForumDao forumdao;
	Forum f=new Forum();
	
	@Before
	public void setUp() throws Exception
	{
		f.setForumContent("Hello forum");
		f.setForumName("fisrt");
		f.setStatus("Yes");
	}
	@Test
	public void test() 
	{
		assertEquals("ok", true, forumdao.createForum(f));
	}

}
*/