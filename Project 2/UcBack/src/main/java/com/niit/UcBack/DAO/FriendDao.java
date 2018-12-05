package com.niit.UcBack.DAO;

import java.util.List;

import com.niit.UcBack.Model.Friend;

public interface FriendDao 
{
	boolean addFriend(Friend friend);
	boolean deleteFriend(Friend friend);
	public Friend showFriend(String emailid);
	public List<Friend> showAllFriend();
}
