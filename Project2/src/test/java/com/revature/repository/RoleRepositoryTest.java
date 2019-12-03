package com.revature.repository;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.revature.models.Role;
import com.revature.repository.RoleRepository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleRepositoryTest {

	@Autowired
	private RoleRepository roleRepo;
	
	
//		List<Role> findByRoleid(long roleid);
//		Role findByRole(String role);

	@Test
	public void testFindByRoleid() {
		long roleid = 3L;
		List <Role> roles = roleRepo.findByRoleid(roleid);
		assertEquals("Admin", roles.get(0).getRole());
	}
	
	@Test
	public void testFindByRole() {
		String role = "Admin";
		Role rl = roleRepo.findByRole(role);
		assertEquals(3L, rl.getRoleid());
	}
}
