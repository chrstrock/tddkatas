package com.katas.fizzbuzz;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.katas.fizzbuzz.src.FizzBuzzGame;

class FizzBuzzTests {

	private FizzBuzzGame game;
	@BeforeEach
	void setUp() throws Exception {
		game = new FizzBuzzGame();
	}

	@Test
	void zeroShouldbeZero()
	{
		assertEquals("0", game.FizzBuzz(0));
	}
	
	@Test
	void oneTurnsOne()
	{
		assertEquals("1", game.FizzBuzz(1));
	}
	
	@Test
	void ThreeReturnsFizz()
	{
		assertEquals("Fizz", game.FizzBuzz(3));
	}
	
	@Test
	void FiveReturnsBuzz()
	{
		assertEquals("Buzz", game.FizzBuzz(5));
	}
	
	@Test
	void SixReturnsFizz()
	{
		assertEquals("Fizz", game.FizzBuzz(6));
	}
	
	@Test
	void TenReturnsBuzz()
	{
		assertEquals("Buzz", game.FizzBuzz(10));
	}
	
	@Test
	void FifteenReturnsFizzBuzz()
	{
		assertEquals("FizzBuzz", game.FizzBuzz(15));
	}

}
