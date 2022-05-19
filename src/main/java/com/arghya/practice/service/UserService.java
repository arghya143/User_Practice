package com.arghya.practice.service;

import java.util.List;
import com.arghya.practice.model.User;

public interface UserService {
	
	public List<User> getUsers();
	
	public User addUser(User user);
	
	public List<User> getUsersByAddress(String address);
	
	public void deleteUser(User user);

}
