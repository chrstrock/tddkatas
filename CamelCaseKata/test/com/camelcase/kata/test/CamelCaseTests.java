package com.camelcase.kata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.camelcase.kata.CamelCase;

class CamelCaseTests {

	private String camelCase;
	@BeforeEach
	void setUp() throws Exception {
		camelCase = "";
	}

	@Test
	void testEmptyString() {
		
		assertEquals("",CamelCase.camelCase(camelCase));
	}
	
	@Test
	void testOneWord() throws Exception {
		camelCase = "hello";
		assertEquals("Hello",CamelCase.camelCase(camelCase));
	}
	
	@Test 
	void testTwoWords()
	{
		camelCase = "hello world";
		assertEquals("HelloWorld", CamelCase.camelCase(camelCase));
	}
	

}

