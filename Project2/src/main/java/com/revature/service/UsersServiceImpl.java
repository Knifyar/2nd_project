package com.revature.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.revature.models.Deck;
import com.revature.models.Role;
import com.revature.models.Users;
import com.revature.repository.UsersRepository;
import org.apache.commons.codec.digest.DigestUtils;

@Primary
@Service
public class UsersServiceImpl{

	@Autowired
	private UsersRepository usersRepository;

	//hashes the Users password before calling the DAO layer
	//to save the Users to the DB
	public Users insert(Users user) {
		String hashedPassword = DigestUtils.sha256Hex(user.getPassword());
		user.setPassword(hashedPassword);

		if (usersRepository.findByUsername(user.getUsername()) != null) {
			return null;
		} else {
			return usersRepository.save(user);
		}
	}
	
	//hashes password before calling the DAO layer 
	//to select a Users by password before returning the Users
	public Users findByPassword(String password) {
		String hashedPassword = DigestUtils.sha256Hex(password);
		return usersRepository.findByPassword(hashedPassword);
	}
	

}
