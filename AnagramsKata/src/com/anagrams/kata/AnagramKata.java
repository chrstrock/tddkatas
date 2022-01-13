package com.anagrams.kata;

import java.util.Arrays;
import java.util.function.BooleanSupplier;

public class AnagramKata {

	public static boolean isAnagram(String test, String original) {
		// TODO Auto-generated method stub
		boolean returnValue = false;
		char[] testLowerArray = test.toLowerCase().toCharArray();
		char[] originalLowerArray = original.toLowerCase().toCharArray();
		
		Arrays.sort(testLowerArray);
		Arrays.sort(originalLowerArray);
		if(test.equals(original))
		{
			returnValue = true;
		}
		
		else if(Arrays.equals(testLowerArray, originalLowerArray))
		{
			returnValue = true;
		}
		return returnValue;
		
	}

}
