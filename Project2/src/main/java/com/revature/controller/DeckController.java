package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import com.revature.models.Cards;
import com.revature.models.Deck;
import com.revature.models.Users;
import com.revature.service.DeckServiceImpl;
import com.revature.service.UsersServiceImpl;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping(value="/deck", method = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT })
public class DeckController {

	@Autowired
	private DeckServiceImpl deckService;

	
	//receives a RequestBody with a Users and 
	//and finds a collection of Deck before returning a list of Deck
	@CrossOrigin("http://localhost:4200/") 
	@GetMapping(value = "/viewdeck")
	@PostMapping(value = "/viewdeck")
	@PutMapping(value = "/viewdeck")
	public List<Deck> viewDeck(@RequestBody Users user) {
		List<Deck> decks = null;
		decks = deckService.getDecks(user);
		return decks;
	}
	
	//receives a RequestBody with a Deck and Users to save the 
	//Deck before returning a Deck
	@CrossOrigin("http://localhost:4200/") 
	@GetMapping(value = "/savedeck")
	@PostMapping(value = "/savedeck")
	@PutMapping(value = "/savedeck") 
	//public Deck saveDeck(@RequestBody String submitdeck, @RequestBody String username) {
	public Deck saveDeck(@RequestBody Deck deck, @RequestBody Users users) {
		deck = deckService.saveDeck(deck, users);
		return deck;
	}
	
	//receives a RequestBody with a Deck and saves
	//the Deck before returning it from the DB
	@CrossOrigin("http://localhost:4200/") 
	@GetMapping(value = "/savedeckByDeck")
	@PostMapping(value = "/savedeckByDeck")
	@PutMapping(value = "/savedeckByDeck") 
	public Deck save(@RequestBody Deck deck) {
		deck = deckService.save(deck);
		return deck;
	}
}
