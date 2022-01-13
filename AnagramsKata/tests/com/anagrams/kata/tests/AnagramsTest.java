package com.anagrams.kata.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.anagrams.kata.AnagramKata;

class AnagramsTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void singleCharacterReturnsTrue() {
		assertTrue(AnagramKata.isAnagram("a","a"));
	}

	@Test
	void toffeeAnagramTest() {
		assertTrue(AnagramKata.isAnagram("foefet", "toffee"));
	}
	
	@Test
	void bucketHeadTest()
	{
		assertTrue(AnagramKata.isAnagram("Buckethead", "DeathCubeK"));
	}
	
	@Test
	void TwooWootTest()
	{
		assertTrue(AnagramKata.isAnagram("Twoo", "Woot"));
	}
	
	@Test
	void applePaleFalseTest()
	{
		assertFalse(AnagramKata.isAnagram("apple", "pale"));
	}
}
