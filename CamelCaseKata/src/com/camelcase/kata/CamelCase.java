package com.camelcase.kata;


public class CamelCase {

	public static String camelCase(String str) {
		String result = "";
		
		//Capitalize each word
		String[] wordArray = str.split("\\w");
		//remove whitespace
		for(String word : wordArray)
		{
			word = word.substring(0,1).toUpperCase() + str.substring(1);
		}
		result = wordArray.toString();
		result = result.trim().replaceAll("\\s","");
		
		return result;
	}

}
