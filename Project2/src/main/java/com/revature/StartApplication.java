package com.revature;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.apache.commons.codec.digest.DigestUtils;

import com.revature.models.Classtype;
import com.revature.models.Deck;
import com.revature.models.Leaderboard;
import com.revature.models.Role;
import com.revature.models.Users;
import com.revature.repository.ClasstypeRepository;
import com.revature.repository.DeckRepository;
import com.revature.repository.LeaderboardRepository;
import com.revature.repository.RoleRepository;
import com.revature.repository.UsersRepository;

@SpringBootApplication() 
public class StartApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(StartApplication.class);

	@Autowired
	private ClasstypeRepository classtyperepository;
	@Autowired
	private DeckRepository deckrepository;
	@Autowired
	private LeaderboardRepository leaderboardrepository;
	@Autowired
	private RoleRepository rolerepository;
	@Autowired
	private UsersRepository usersrepository;

	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}

	@Override
	public void run(String... args) {

		//Role Entity Test
		log.info("StartApplication...");

		rolerepository.save(new Role(1, "User"));
		rolerepository.save(new Role(2, "GameMaster"));
		rolerepository.save(new Role(3, "Admin"));

		System.out.println("\nfindAll()");
		rolerepository.findAll().forEach(x -> System.out.println(x));

		System.out.println("\nfindById(1L)"); // this looks for a role by the id=1, l is for long
		rolerepository.findById(1l).ifPresent(x -> System.out.println(x));

//		System.out.println("\nfindByRole('Node')");
//		rolerepository.findByRole("Node").forEach(x -> System.out.println(x));

//		// Users Entity Test
		usersrepository.save(new Users(1, "Administrator", DigestUtils.sha256Hex("admin"), new Role(3, "Admin"), null));
		usersrepository.save(new Users(2, "Dan", DigestUtils.sha256Hex("dan"),new Role(2, "GameMaster"), null));
		usersrepository.save(new Users(3, "Fabrice", DigestUtils.sha256Hex("fab231")));
		usersrepository.save(new Users(4, "David", DigestUtils.sha256Hex("fink6225")));

		System.out.println("\nfindAllUsers()");
		usersrepository.findAll().forEach(x -> System.out.println(x));
		System.out.println("\nfindById(1L)"); // this looks for a users by the id=1
		usersrepository.findById(1l).ifPresent(x -> System.out.println(x));

		
		// Classtype Entity Test
		classtyperepository.save(new Classtype(1, "Druid"));
		classtyperepository.save(new Classtype(2, "Hunter"));
		classtyperepository.save(new Classtype(3, "Mage"));
		classtyperepository.save(new Classtype(4, "Paladin"));
		classtyperepository.save(new Classtype(5, "Priest"));
		classtyperepository.save(new Classtype(6, "Rogue"));
		classtyperepository.save(new Classtype(7, "Shaman"));		
		classtyperepository.save(new Classtype(8, "Warlock"));
		classtyperepository.save(new Classtype(9, "Warrior"));
		classtyperepository.save(new Classtype(10, "DeathKnight"));
		
		System.out.println("\nfindAllClasstypes()");
		classtyperepository.findAll().forEach(x -> System.out.println(x));
		
		
		// LeaderBoards Entity Test
//		leaderboardrepository.save(new Leaderboard(1));
//		leaderboardrepository.save(new Leaderboard(2));
//		leaderboardrepository.save(new Leaderboard(3));
//		
//		System.out.println("\nfindAllLeaderboardSubmissions()");
//		leaderboardrepository.findAll().forEach(x -> System.out.println(x));
		
		
		// Deck Entity Test
		String png = "https://d15f34w2p8l1cc.cloudfront.net/hearthstone/cda66a1c1d91f15ef0444bcd7ccc378876f2d2dd3a7bfc946a8e2f7e6a14b039.png";
		String imgArr[] = {png, png, png, png, png};
		
		deckrepository.save(new Deck(1, "45", imgArr, new Users(1, "Administrator", "pass1234")));
		deckrepository.save(new Deck(2, "45", imgArr, new Users(2, "Dan", "dan")));
		deckrepository.save(new Deck(3, "45", imgArr, new Users(3, "Fabrice", "fab231")));
		
		System.out.println("\nfindAllDecks()");
		deckrepository.findAll().forEach(x -> System.out.println(x));
	}

}