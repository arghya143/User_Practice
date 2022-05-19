package com.arghya.practice;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.arghya.practice.dao.MyRepo;
import com.arghya.practice.model.User;
import com.arghya.practice.service.UserService;

//@RunWith(SpringRunner.class)
@SpringBootTest
class UserPracticeApplicationTests {

	public static Logger logger=LoggerFactory.getLogger(UserPracticeApplicationTests.class);
	
	@Test
	void contextLoads() {
		//logger.info("Test case Executing....");
		//assertEquals(true,true);
	}
	
	/*@Autowired
	private UserService userService;
	
	@MockBean
	private MyRepo repository;
	
	@Test
	public void getUsersTest()
	{
		when(repository.findAll()).thenReturn(Stream.of(new User(200,"Asit","Ekterpur"),new User(201,"Amita","Kamarhati")).collect(Collectors.toList()));
		assertEquals(2,userService.getUsers().size());
	}
	
	@Test
	public void getUsersByAddressTest()
	{
		String address="Kamarhati";
		when(repository.findByAddress(address)).thenReturn(Stream.of(new User(201,"Amita","Kamarhati")).collect(Collectors.toList()));
		assertEquals(1,userService.getUsersByAddress(address).size());
	}
	
	@Test
	public void saveUserTest()
	{
		User user= new User(105,"Asima","Kamarhati");
		when(repository.save(user)).thenReturn(user);
		assertEquals(user,userService.addUser(user));
	}

	@Test
	public void deleteUserTest()
	{
		User user= new User(105,"Asima","Kamarhati");
		userService.deleteUser(user);
		verify(repository,times(1)).delete(user);
		
	}*/
}
