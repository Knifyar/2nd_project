package com.revature.controller;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.revature.models.Deck;
import com.revature.models.Role;
import com.revature.models.Users;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LeaderboardControllerTest {

}
