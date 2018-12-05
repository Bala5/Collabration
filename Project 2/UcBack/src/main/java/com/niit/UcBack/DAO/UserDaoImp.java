package com.niit.UcBack.DAO;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.niit.UcBack.Model.NewMyUser;

@Repository("userDao")
@Transactional
public class UserDaoImp implements UserDao 
{
	@Autowired
	SessionFactory sf;
	public boolean addUser(NewMyUser user) 
	{
		try 
		{
			sf.getCurrentSession().saveOrUpdate(user);
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}
		
	}

	public boolean deleteUser(String emailId) 
	{
		try 
		{
			sf.getCurrentSession().delete(showUser(emailId));
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}
		

	}

	public NewMyUser showUser(String emailId) 
	{
		try {
			NewMyUser user = (NewMyUser) sf.getCurrentSession()
					.createQuery("from NewMyUser where EmailId= '" + emailId + "'").uniqueResult();
			return user;
		} catch (Exception e) {
			NewMyUser user = null;
			System.out.println(e.getMessage());
			return user;
		}
	}

	@SuppressWarnings("unchecked")
	public List<NewMyUser> showAllUser() 
	{
		try
		{
			
			ArrayList<NewMyUser> user=(ArrayList<NewMyUser>)sf.getCurrentSession().createQuery("from NewMyUser").list();
			return user;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}
	}

}
