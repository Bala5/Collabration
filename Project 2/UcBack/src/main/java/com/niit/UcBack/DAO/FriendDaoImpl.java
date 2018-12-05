package com.niit.UcBack.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.UcBack.Model.Friend;

@Repository("frienddao")
@Transactional
public class FriendDaoImpl implements FriendDao 
{

	@Autowired
	SessionFactory sf;
	public boolean addFriend(Friend friend) {
		
		try 
		{
			sf.getCurrentSession().saveOrUpdate(friend);
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}
	}

	public boolean deleteFriend(Friend friend) {
		try 
		{
			sf.getCurrentSession().delete(friend);
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}
	}

	public Friend showFriend(String emailid) {

		try {
		Friend friend = (Friend) sf.getCurrentSession()
					.createQuery("from Friend where EmailId= '" + emailid + "'").uniqueResult();
			return friend;
		} catch (Exception e) {
			Friend friend = null;
			System.out.println(e.getMessage());
			return friend;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Friend> showAllFriend() {
		try
		{
			
			ArrayList<Friend> friend=(ArrayList<Friend>)sf.getCurrentSession().createQuery("from Friend").list();
			return friend;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}
	}
	
}
