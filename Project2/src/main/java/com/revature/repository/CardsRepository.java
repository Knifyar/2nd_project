package com.revature.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Cards;

@Transactional
@Repository
public interface CardsRepository extends JpaRepository<Cards, Integer> {

}