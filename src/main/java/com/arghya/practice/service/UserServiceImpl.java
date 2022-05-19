package com.arghya.practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arghya.practice.dao.MyRepo;
import com.arghya.practice.model.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	MyRepo repo;
	
	@Override
	public List<User> getUsers()
	{
		List<User> users=repo.findAll();
		System.out.println("Getting Data from DB:"+users);
		return users;
		
	}
	
	@Override
	public User addUser(User user)
	{
		return repo.save(user);
		
	}

	@Override
	public List<User> getUsersByAddress(String address)
	{
		return  repo.findByAddress(address);
	}
	
	@Override
	public void deleteUser(User user)
	{
		//User user=repo.findById(userId).orElse(null);
		repo.delete(user);
		
	}

}
