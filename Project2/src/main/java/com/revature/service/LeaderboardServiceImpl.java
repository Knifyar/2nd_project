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
import org.springframework.web.bind.annotation.RequestBody;

import com.revature.models.Deck;
import com.revature.models.Leaderboard;
import com.revature.models.Users;
import com.revature.repository.DeckRepository;
import com.revature.repository.LeaderboardRepository;

@Primary
@Service
public class LeaderboardServiceImpl{

	@Autowired
	private LeaderboardRepository leaderRepository;
	
	@Autowired
	private DeckRepository deckRepository;
	
	//returns a leaderboard selected by Users id  
	public Leaderboard getOne(Leaderboard leaderBoard) {
		leaderBoard = leaderRepository.findByUserid(leaderBoard.getUserid());
		return leaderBoard;
	}
	
	//returns a Deck selected by the deck id of a leaderboard
	public Deck clickMe(Leaderboard leaderBoard) {
		Deck deck;
		deck = leaderRepository.getOne(leaderBoard.getLeaderid()).getDeckid();		
		return deck;
	}
	
	//returns a leaderboard after calling the DAO 
	//to save the leaderboard to the DB
	public Leaderboard updateDeckPoints(Leaderboard leaderBoard) {
		//need to know if points column is going to be in leaderboard or deck.
		return leaderRepository.save(leaderBoard);
	}
}
