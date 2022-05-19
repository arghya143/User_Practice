package com.arghya.practice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.arghya.practice.model.User;

public interface MyRepo extends JpaRepository<User,Integer>{
	
	@Query("from User where address=?1 order by name")
	public List<User> findByAddress(String address);

}
