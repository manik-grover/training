package com.niit.tech.mvc.dao;

import org.springframework.data.repository.CrudRepository;

import com.niit.tech.mvc.model.User;

public interface UserRepository extends CrudRepository <User, Short>{
	

}
