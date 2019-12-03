package com.revature.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.revature.models.Role;

@Transactional
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

	//What dataType is returning, methodName, and inputs
	//returns Role selected by role id
	List<Role> findByRoleid(long roleid);
	//return Role selected by role name
	Role findByRole(String role);
}