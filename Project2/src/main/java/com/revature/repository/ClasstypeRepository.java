package com.revature.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.revature.models.Classtype;

@Transactional
@Repository
public interface ClasstypeRepository extends JpaRepository<Classtype, Long> {

	//What dataType is returning, methodName, and inputs
	//methodName tells both JpaRepository and other developers
	//what will be queried
	
	//returns the classtype by selecting by class id
	List<Classtype> findByClassid(long classid);
	
	//returns the classtype by selecting by classtype
	List<Classtype> findByClasstype(String classtype);
}