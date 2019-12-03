package com.revature.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.revature.models.Classtype;
import com.revature.models.Deck;
import com.revature.models.Role;
import com.revature.models.Users;

@Transactional
@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

	//What dataType is returning, methodName, and inputs
	//returns Users selected by user id
	Users findByUserid(long userid);
	//returns Users selected by username
	Users findByUsername(String username);
	//returns Users selected by password
	Users findByPassword(String password);
	//returns a list of Users selected by role id
	List<Users> findAllByRoleid(Role roleid);
}