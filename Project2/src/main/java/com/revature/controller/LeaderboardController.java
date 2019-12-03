package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Deck;
import com.revature.models.Leaderboard;
import com.revature.models.Users;
import com.revature.service.DeckServiceImpl;
import com.revature.service.LeaderboardServiceImpl;
import com.revature.service.UsersServiceImpl;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping(value="/ranking", method = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT })
public class LeaderboardController {

	@Autowired
	private DeckServiceImpl deckService;
	
	@Autowired
	private UsersServiceImpl usersService;
	
	@Autowired
	private LeaderboardServiceImpl leaderboardService;
	
	
	//receives a RequestBody with a Users and a Deck
	//then uses them to retrieve a leaderboard 
	@CrossOrigin("http://localhost:4200/") 
	@GetMapping(value = "/leaderboard")
	@PostMapping(value = "/leaderboard")
	@PutMapping(value = "/leaderboard") 
	public void leaderBoard(@RequestBody Users user, @RequestBody Deck deck) {
		Leaderboard leaderBoard = null;
		leaderBoard.setUserid(user);
		leaderBoard.setDeckid(deck);
		leaderboardService.getOne(leaderBoard);
	}
	
	//receives a RequestBody with a leaderboard
	//then uses it to retrieve a Deck
	@CrossOrigin("http://localhost:4200/") 
	@GetMapping(value = "/clickme")
	@PostMapping(value = "/clickme")
	@PutMapping(value = "/clickme") 
	public Deck clickMe(@RequestBody Leaderboard leaderBoard) {
		Deck deck;
		deck = leaderboardService.clickMe(leaderBoard);		
		return deck;
	}
	
	//receives a RequestBody with a leaderboard
	//then uses it to to update Deck point/value 
	//before returning the leaderboard
	@CrossOrigin("http://localhost:4200/") 
	@GetMapping(value = "/updates")
	@PostMapping(value = "/updates")
	@PutMapping(value = "/updates") 
	public Leaderboard updates(@RequestBody Leaderboard leaderBoard) {
		return leaderboardService.updateDeckPoints(leaderBoard);
	}
}
