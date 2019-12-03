package com.revature.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.revature.models.Cards;
import com.revature.models.Deck;
import com.revature.models.Users;
import com.revature.repository.DeckRepository;
import com.revature.repository.UsersRepository;

@Primary
@Service
public class DeckServiceImpl{
	
	@Autowired
	private DeckRepository deckRepository;
	@Autowired
	private UsersRepository usersRepository;

	//goal was to retrieve and sort a list of Deck for an
	//individual Users/Player
//	public List<Deck> findLastDeck(Users user) {
//		TreeSet <Deck> decks = null;
//		List <Deck> ds = null;
//		Deck deck = null;
//		List<Long> cheats = null;
//		cheats.add(user.getUserid());
//		decks = (TreeSet <Deck>) deckRepository.findAllById(cheats);
//		
//		ds = (List <Deck>) decks;
////		deck = ds.get(ds.lastIndexOf(deck));
//		return ds;
//	}

	//calls the DAO layer to get a list of Deck
	//for an individual Users/Player
	public List<Deck> getDecks(Users user){
		List<Deck> decks =  deckRepository.findAllByUserid(user);
		return decks;
	}
	
	//sets a Deck to Users and call the DAO layer to save
	//the Deck to the DB
	public Deck saveDeck(Deck deck,Users user) {
		deck.setDeckvalue(deck.getDeckvalue());
		deck.setUserid(user);
		deck = deckRepository.save(deck);
//		deck = deckRepository.getOne(deck.getDeckid());  // Causes a "org.hibernate.LazyInitializationException"
		return deck;
	}
	
	//calls to the DAO layer to save a Deck to the DB
	public Deck save(Deck deck) {
		deck = deckRepository.save(deck);
//		deck = deckRepository.getOne(deck.getDeckid()); // Causes a "org.hibernate.LazyInitializationException"
		return deck;
	}
}
