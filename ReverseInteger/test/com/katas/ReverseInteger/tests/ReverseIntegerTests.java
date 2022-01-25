package com.katas.ReverseInteger.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.katas.ReverseInteger.ReverseInteger;

class ReverseIntegerTests {

	private ReverseInteger reverse;
	private int testInt;
	@BeforeEach
	void setUp() throws Exception {
		reverse = new ReverseInteger();
		
	}

	@Test
	void ZeroReturnsZero() {
		assertEquals(0, reverse.reverseInt(testInt));
	}
	
	@Test
	void OneReturnsOne()
	{
		testInt = 1;
		assertEquals(1, reverse.reverseInt(testInt));
	}
	
	@Test
	void OneTwoReturnsTwoOne() throws Exception {
		testInt = 12;
		assertEquals(21, reverse.reverseInt(testInt));
	}
	
	@Test
	void TwentyOneReturnsTwelve()
	{
		testInt = 21;
		assertEquals(12, reverse.reverseInt(testInt));
	}
	
	@Test
	void OneHundredTwentyThreeReturnsThreeHundredTwentyOne()
	{
		testInt = 123;
		assertEquals(321, reverse.reverseInt(testInt));
	}
	
	@Test
	void NegativeTest()
	{
		testInt = -123;
		assertEquals(-321, reverse.reverseInt(testInt));
	}
	
	@Test
	void BiggerThanInt32Test()
	{
		testInt = 1534236469;
		assertEquals(0,reverse.reverseInt(testInt));
	}
	
	@Test
	void negativeBigIntegerTest()
	{
		testInt = -2147483648;
		assertEquals(0,reverse.reverseInt(testInt));
	}
	
	@Test
	void negativeTest2()
	{
		testInt = -1563847412;
		assertEquals(0,reverse.reverseInt(testInt));
	}

}
