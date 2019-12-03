package com.revature.service;


import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.revature.models.Role;
import com.revature.models.Users;
import com.revature.service.UsersServiceImpl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

	@Autowired
	private UsersServiceImpl userServ;
	
	//Passed
	//Users insert(Users user)
	@Test
	public void testInsert() {
		Role roleid = new Role(1L, "User");
		Users user = new Users(0, "Bob", "bob456");
		Users testUser = userServ.insert(user);
		assertEquals("Bob", testUser.getUsername());
	}
	
	//Passed
	//Users findByPassword(String password)
	@Test
	public void testFindByPassword() {
		String password = "defr1234";
		Users user = userServ.findByPassword(password);
		assertEquals("Dan", user.getUsername());
	}
}
