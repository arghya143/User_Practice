package com.arghya.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.arghya.practice.model.User;
import com.arghya.practice.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/users")
	public List<User> findUsers()
	{
		return userService.getUsers();
	}
	
	@PostMapping("/user")
	public User saveUser(@RequestBody User user)
	{
		return userService.addUser(user);
	}
	
	@GetMapping("/user/{address}")
	public List<User> findUserByAddress(@PathVariable("address") String address)
	{
		return userService.getUsersByAddress(address);
	}
	
	@DeleteMapping("/remove")
	public User removeUser(@RequestBody User user)
	{
		userService.deleteUser(user);
		return user;
	}

}
