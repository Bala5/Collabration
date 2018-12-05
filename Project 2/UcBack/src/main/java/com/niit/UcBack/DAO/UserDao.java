package com.niit.UcBack.DAO;

import java.util.List;

import com.niit.UcBack.Model.NewMyUser;

public interface UserDao 
{
	boolean addUser(NewMyUser user);
	boolean deleteUser(String emailId);
	public NewMyUser showUser(String emailId);
	public List<NewMyUser> showAllUser();

}
