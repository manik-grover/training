package com.niit.tech.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.niit.tech.mvc.model.User;
import com.niit.tech.mvc.service.UserService;

@Controller
@RequestMapping(path="/mvc")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping(path="/add") 
	public @ResponseBody String addUser (@RequestParam String name) {

		User user = new  User();
		user.setName(name);
		userService.addUser(user);
		return "Added new user : "+user.getName();
	}


	@GetMapping(path="/all")
	@ResponseBody
	public  List<User> getAllUsers() {
		return userService.getAllUsers(); 
	}

}
