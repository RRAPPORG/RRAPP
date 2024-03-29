package com.user;

import java.util.List;

import org.json.JSONObject;

public interface UserDAO {
	
	public void save(User user);
	
	public void save(String nickName, String firstName, String lastName, String middleName);
	
	public List<User> list();
	
	public void update(User user);
	
	public void remove(User user);
	
	public JSONObject getUserJson (User user);
	
}