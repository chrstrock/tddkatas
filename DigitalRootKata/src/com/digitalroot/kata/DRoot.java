package com.digitalroot.kata;

public class DRoot {

	public static Integer digital_root(int testInt) {
		int digitalRoot = testInt;
		
		while(digitalRoot > 9)
		{
			int remainder = digitalRoot % 10;
			digitalRoot = digitalRoot / 10 + remainder;
		}
		return digitalRoot;
	}

}
