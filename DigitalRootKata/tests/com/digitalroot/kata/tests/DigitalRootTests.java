package com.digitalroot.kata.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.digitalroot.kata.DRoot;

class DigitalRootTests {

	private int testInt;
	@BeforeEach
	void setUp() throws Exception {
		testInt = 0;
	}

	@Test
	void ZeroTest() {
		assertEquals(0,DRoot.digital_root(testInt));
	}
	
	@Test
	void singleDigitTest() {
		assertEquals(5, DRoot.digital_root(5));
	}
	
	@Test
	void FifteenEqualsSixTest()
	{
		assertEquals(6,DRoot.digital_root(15));
	}
	
	@Test
	void OneNineEqualsOne()
	{
		assertEquals(1,DRoot.digital_root(19));
	}
	
	@Test
	void NineHundredFortyTwoEqualsSixTest()
	{
		assertEquals(6,DRoot.digital_root(942));
	}
	@Test
	void Test3() throws Exception {
		assertEquals(6,DRoot.digital_root(132189));
	}
	
	@Test
	void Test4() throws Exception {
		assertEquals(2,DRoot.digital_root(493193));
	}

}
