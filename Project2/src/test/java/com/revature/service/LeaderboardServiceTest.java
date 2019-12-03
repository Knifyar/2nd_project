package com.revature.service;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.revature.models.Deck;
import com.revature.models.Leaderboard;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LeaderboardServiceTest {

	@Autowired
	private LeaderboardServiceImpl leadServl;
		
	//nothing in Leaderboard Table can't test
	
	
	//Leaderboard getOne(Leaderboard leaderBoard)
//	@Test
//	public void testGetOne() {
//		Leaderboard leaderBoard = new 
//	}
	
	
	//Deck clickMe(Leaderboard leaderBoard)
	
	
	
	//Leaderboard updateDeckPoints(Leaderboard leaderBoard)
	
}
