package com.duplicateencoder.kata;

public class DuplicateEncoder {

	public static String encode(String word) {
		// TODO Auto-generated method stub
		String returnString = "";
		
		if(word != null && !word.isEmpty())
		{
			
			//loop through each character
			for(char c : word.toLowerCase().toCharArray())
			{
				//count occurence in string
				long tempCount = CountOccurrence(c,word);
				if(tempCount == 1)
				{
					returnString += "(";
				}
				
				else if (tempCount > 1) {
					returnString += ")";
				}
			}
		}
		return returnString;
	}

	private static long CountOccurrence(char c, String word) {
		// TODO Auto-generated method stub
		return word.chars().filter(ch->ch == c).count();
	}

}
