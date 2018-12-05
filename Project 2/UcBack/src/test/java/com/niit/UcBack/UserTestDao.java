package com.niit.UcBack;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.niit.UcBack.DAO.UserDao;
import com.niit.UcBack.Model.NewMyUser;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitConfig(DBConfig.class)

public class UserTestDao {
	@Autowired
	UserDao userdao;
	NewMyUser user=new NewMyUser();
	
	@Before
	public void setUp() throws Exception
	{
		user.setEmailId("onlyforlights@gmail.com");
		user.setLogInName("Bala");
		user.setOnlineStatus(true);
		user.setPassword("12sdFrfSd");
		user.setPhoneNo("9632587410");
		user.setRole("student25");
	}
	


	@Test
	public void test() 
	{		
		assertEquals("deleted", true, userdao.addUser(user));
	}
	@After
	public void tearDown()
	{
       //userdao.deleteUser("onlyforlights@gmail.com");
	}

	

}
