package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import org.apache.commons.codec.digest.DigestUtils;

import com.revature.models.Role;
import com.revature.models.Users;
import com.revature.repository.RoleRepository;
import com.revature.repository.UsersRepository;

@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping(value = "/users", method = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT })
public class UsersController {

	@Autowired
	private UsersRepository usersRepository;
	@Autowired
	private RoleRepository roleRepository;

	//calls for all of the Users
	//then returns a List of Users
	@CrossOrigin("http://localhost:4200/")
	@PostMapping(value = "/all")
	@GetMapping(value = "/all")
	@PutMapping(value = "/all")
	public List<Users> getAll() {
		return usersRepository.findAll();
	}

	//register by string input
	//receives a RequestParam with a String of username
	//and a String of password before
	//using them to bypass the Service Layer to save a new Users 
	@CrossOrigin("http://localhost:4200/") // allow a cross origin request from localhost:4200
	@GetMapping(value = "/register2")
	@PostMapping(value = "/register2")
	@PutMapping(value = "/register2")
	public Users Register2(@RequestParam(value = "username") String username,
			@RequestParam(value = "password") String password) {

		Users user = new Users();
		user.setUsername(username);
		user.setPassword(DigestUtils.sha256Hex(password)); // hash password
		Role role = roleRepository.findByRole("User"); // get user role
		user.setRoleid(role); // assign default role as user
		return usersRepository.save(user); // persist the change to the DB
//		user =  usersRepository.save(user); // persist the change to the DB
//		user.setPassword("********");  //Conceal the password
//		System.out.println("I sent this to Angular: ");
//		return user;
	}

	//register by object input
	//receives a RequestBody with an Users before
	//using it to bypass the Service Layer to save a new Users 
	@CrossOrigin("http://localhost:4200/") // allow a cross origin request from localhost:4200
	@GetMapping(value = "/register")
	@PostMapping(value = "/register")
	@PutMapping(value = "/register")
	public Users Register(@RequestBody Users user) {

		String password = user.getPassword();
		user.setPassword(DigestUtils.sha256Hex(password)); // hash password
		Role role = roleRepository.findByRole("User"); // get user role
		user.setRoleid(role); // assign default role as user
		return usersRepository.save(user); // persist the change to the DB
	}

	//login by string input
	//receives a RequestParam with a String of username
	//and a String of password before using them to bypass 
	//the Service Layer to retrieve an Users 
	@CrossOrigin("http://localhost:4200/")
	@GetMapping(value = "/login2")
	@PostMapping(value = "/login2")
	@PutMapping(value = "/login2")
	public Users Login2(@RequestParam(value = "username") String username,
			@RequestParam(value = "password") String password) {

		Users user = usersRepository.findByUsername(username);

		if (user.getPassword().equalsIgnoreCase(DigestUtils.sha256Hex(password))) {
			return user;
		}
		return null;
	}

	//login by Users input
	//receives a RequestParam with an User 
	//before using it to bypass 
	//the Service Layer to retrieve an Users 
	@CrossOrigin("http://localhost:4200/")
	@GetMapping(value = "/login")
	@PostMapping(value = "/login")
	@PutMapping(value = "/login")
	public Users Login(@RequestBody Users user) {

		String password = user.getPassword();
		user = usersRepository.findByUsername(user.getUsername());
System.out.println(usersRepository.findByUsername(user.getUsername()));
System.out.println(DigestUtils.sha256Hex(password));
		if (user.getPassword().equalsIgnoreCase(DigestUtils.sha256Hex(password))) {
			return user;
		}
		return null;
	}
}