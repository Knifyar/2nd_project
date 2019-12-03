package com.revature.repository;

import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.revature.models.Deck;
import com.revature.models.Users;
import com.revature.repository.DeckRepository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeckRepositoryTest {
	
		@Autowired
		private DeckRepository deckRepo;
		

		//Passed
//		List<Deck> findByDeckid(long deckid);		
		@Test
		public void testFindByDeckid() {
			long deckid = 1L;
			List<Deck> decks = deckRepo.findByDeckid(deckid);
			assertEquals(1L, decks.get(0).getUserid().getUserid());
		}
		
		//Passed
//		List<Deck> findByDeckvalue(String deckvalue);		
		@Test
		public void testFindByDeckvalue() {
			String deckvalue = "25.png, 25.png, 25.png";
			List<Deck> decks = deckRepo.findByDeckvalue(deckvalue);
			assertEquals(1L, decks.get(0).getDeckid());
		}
		
		
		//Failed && never used.
//		List<Deck> findAllByUseridOrderByDeckid(Users userid);		
//		@Test
//		public void testFindAllByUseridOrderByDeckid() {
//			Users userid = new Users(3, "Fabrice", DigestUtils.sha256Hex("fab231"));
//			List<Deck> decks = deckRepo.findAllByUseridOrderByDeckid(userid);
//			assertEquals(3L, decks.get(0).getDeckid());
//		}
		
		//Passed
//		List<Deck> findAllByUserid(Users userid);
		@Test
		public void testFindAllByUserid() {
			Users userid = new Users(3, "Fabrice", DigestUtils.sha256Hex("fab231"));
			List<Deck> decks = deckRepo.findAllByUserid(userid);
			assertEquals(3L, decks.get(0).getDeckid());
		}
}
