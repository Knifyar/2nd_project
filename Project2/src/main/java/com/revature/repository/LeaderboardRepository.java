package com.revature.repository;

//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.revature.models.Deck;
import com.revature.models.Leaderboard;
import com.revature.models.Users;

@Transactional
@Repository
public interface LeaderboardRepository extends JpaRepository<Leaderboard, Long> {

	//What dataType is returning, methodName, and inputs
	
	//returns a leaderboard selected by leader id
	Leaderboard findByLeaderid(long leaderid);
	//returns a leaderboard selected by deck id
	Leaderboard findByDeckid(Deck deckid);
	//returns a leaderboard selected by user id
	Leaderboard findByUserid(Users userid);

}