package com.niit.tech.mvc.dao;

import java.util.List;

import com.niit.tech.mvc.model.User;

public interface UserDao {
	
    public void save(User user);
 
    public List <User> getAllUsers();

}
