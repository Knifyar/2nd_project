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

import com.revature.models.Classtype;
import com.revature.repository.ClasstypeRepository;

@Primary
@Service
public class ClassTypeServiceImpl{
	
	@Autowired
	private ClasstypeRepository classTypeRepository;



}
