package com.niit.tech.mvc.service;

import java.util.List;

import com.niit.tech.mvc.model.User;

public interface UserService {
	public void addUser (User user);
	public List<User> getAllUsers();
}
