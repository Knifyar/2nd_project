package com.revature.service;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.revature.models.Deck;
import com.revature.models.Role;
import com.revature.models.Users;
import com.revature.service.DeckServiceImpl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeckServiceTest {

	@Autowired
	private DeckServiceImpl deckServ;
	
	//Passed
	//List<Deck> getDecks(Users user)
	@Test
	public void testGetDecks() {
		Users user = new Users(2, "Dan", DigestUtils.sha256Hex("defr1234"));
		List<Deck> decks = deckServ.getDecks(user);
		assertEquals(2L, decks.get(0).getDeckid());
	}
		
	//Passed after fixing method in DeckServiceImpl
	//Deck saveDeck(Deck deck,Users user)
	@Test
	public void testSaveDeck() {
		// Deck Entity Test
		String png = "https://d15f34w2p8l1cc.cloudfront.net/hearthstone/cda66a1c1d91f15ef0444bcd7ccc378876f2d2dd3a7bfc946a8e2f7e6a14b039.png";
		String imgArr[] = {png, png, png, png, png};
		Deck deck = new Deck(0, "35", imgArr, new Users(3, "Fabrice", "fab231"));
		Users user = new Users(3, "Fabrice", "fab231");
		Deck testDeck = deckServ.saveDeck(deck, user);
		assertEquals(3L, testDeck.getUserid().getUserid());
	}
	
	//Passed after fixing method in DeckServiceImpl
	//Deck save(Deck deck)
	@Test
	public void testSave() {
		// Deck Entity Test
		String png = "https://d15f34w2p8l1cc.cloudfront.net/hearthstone/cda66a1c1d91f15ef0444bcd7ccc378876f2d2dd3a7bfc946a8e2f7e6a14b039.png";
		String imgArr[] = {png, png, png, png, png};
		Deck deck = new Deck(0, "35", imgArr, new Users(3, "Fabrice", "fab231"));
		Deck testDeck = deckServ.save(deck);
		assertEquals(3L,testDeck.getUserid().getUserid());
	}
}
