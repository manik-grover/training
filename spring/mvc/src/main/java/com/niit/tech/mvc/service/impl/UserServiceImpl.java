/**
 * 
 */
package com.niit.tech.mvc.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.niit.tech.mvc.dao.UserDao;
import com.niit.tech.mvc.model.User;
import com.niit.tech.mvc.service.UserService;

/**
 * @author msa
 *
 */
@Component
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	public void addUser(User user) {
		 userDao.save(user);	
	}
	
	public List <User> getAllUsers() {
		return userDao.getAllUsers();
	}
	
}
