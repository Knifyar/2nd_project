package com.revature.repository;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.revature.models.Role;
import com.revature.models.Users;
import com.revature.repository.UsersRepository;
import com.revature.service.UsersServiceImpl;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

	
    @Autowired
    private UsersRepository repository;


    @Test
    public void testFindAllByRoleid() {
    	Role roleId = new Role(1L, "User");
    	List<Users> users = repository.findAllByRoleid(roleId);
    	assertEquals(1L, users.get(0).getRoleid().getRoleid());
    }
    
    @Test
    public void testFindByUserid() {
    	//test
    	long userid = 3L;
    	Users user = repository.findByUserid(userid);
    	assertEquals("Fabrice", user.getUsername());
    }
    
    @Test
    public void testFindByUsername() {
    	//test
    	String username = "Fabrice";
    	Users user = repository.findByUsername(username);
    	assertEquals(3L, user.getUserid());
    }
    
    @Test
    public void testFindByPassword() {
    	//test
    	String password = "fab231";
    	String hashedPassword = DigestUtils.sha256Hex(password);
    	Users user = repository.findByPassword(hashedPassword);
    	assertEquals(3L, user.getUserid());
    }

}
