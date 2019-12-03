package com.revature.repository;

//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

import com.revature.models.Cards;
import com.revature.models.Deck;
import com.revature.models.Users;

@Transactional
@Repository
public interface DeckRepository extends JpaRepository<Deck, Long> {

	//What dataType is returning, methodName, and inputs
	
	//returns Deck selected by deck id
	List<Deck> findByDeckid(long deckid);
	//returns Deck selected by deck value
	List<Deck> findByDeckvalue(String deckvalue);
	
	//returns a list of deck selected by user id
	//and orders the list by deck id
//	List<Deck> findAllByUseridOrderByDeckid(Users userid);  || never used
	
	//returns a list of decks selected by user id
	List<Deck> findAllByUserid(Users userid);
}