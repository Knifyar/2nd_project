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

import com.revature.models.Role;
import com.revature.repository.RoleRepository;

@Primary
@Service
public class RoleServiceImpl{
	
	@Autowired
	private RoleRepository roleRepository;



}
