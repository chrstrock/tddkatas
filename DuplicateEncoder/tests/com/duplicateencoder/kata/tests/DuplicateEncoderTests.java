package com.duplicateencoder.kata.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.duplicateencoder.kata.DuplicateEncoder;

class DuplicateEncoderTests {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void nullStringTest() {
		assertEquals("",DuplicateEncoder.encode(null));
	}
	
	@Test
	void dinTest()
	{
		assertEquals("(((", DuplicateEncoder.encode("din"));
	}

	@Test
	void recedeTest() throws Exception {
		assertEquals("()()()", DuplicateEncoder.encode("recede"));
	}
}
