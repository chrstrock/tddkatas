package com.katas.BowlingGame.Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.katas.BowlingGame.code.BowlingGame;



class BowlingGameTests {

	private BowlingGame game;
	@BeforeEach
	void setUp(){
		game = new BowlingGame();
	}

	@Test
	void canMakeGameTest() {
		
		assertEquals(game.getClass(), BowlingGame.class);
		
	}
	
	@Test
	void canRoll()
	{
		game.roll(0);
		assertEquals(game.getScore(), 0);
	}
	
	@Test
	void gutterGame()
	{
		
		rollGame(20, 0);
		assertEquals(0, game.getScore());
	}

	private void rollGame(int times, int pinsdown) {
		for (int i = 0; i < times; i++) {
			game.roll(pinsdown);
		}
	}
	
	@Test
	void allOnes()
	{
		rollGame(20,1);
		assertEquals(20, game.getScore());
	}
	
	@Test
	void oneSpareScore()
	{
		rollSpare();
		game.roll(3);
		rollGame(17,0);
		assertEquals(16,game.getScore());
	}
	
	@Test 
	void oneStrikeScore()
	{
		rollStrike();
		game.roll(3);
		game.roll(4);
		rollGame(16,0);
		assertEquals(24, game.getScore());
		
	}
	
	@Test
	void testPerfectGame()
	{
		rollGame(12,10);
		assertEquals(300,game.getScore());
	}

	private void rollStrike() {
		game.roll(10);
	}

	private void rollSpare() {
		game.roll(5);
		game.roll(5);
	}
	

}
