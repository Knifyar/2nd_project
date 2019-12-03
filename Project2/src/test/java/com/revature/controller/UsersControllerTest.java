package com.revature.controller;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.when;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestBody;

import com.revature.models.Deck;
import com.revature.models.Role;
import com.revature.models.Users;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsersControllerTest {

	@Mock
	HttpServletRequest request;

	@Mock
	HttpServletResponse response;
	
	@Autowired
	private UsersController userContr;
	
	
	//Failed due to can't send http request from src/test/java
	//Users Register(@RequestBody Users user)
	@Test
	public void testRegister() {
		Users user = new Users(0, "Fabrice", "fab231");
//		when(request.)
		Users testuser = userContr.Register(user);
		assertEquals(3L, testuser.getUserid());
	}
	
}
