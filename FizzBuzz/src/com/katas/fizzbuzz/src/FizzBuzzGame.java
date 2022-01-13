package com.katas.fizzbuzz.src;

public class FizzBuzzGame {

	public String FizzBuzz(int n) {
		// TODO Auto-generated method stub
	
		{
			
			if(n == 0)
			{
				return "0";
			}
			return _FizzBuzz(n);
		}
	}

	private String _FizzBuzz(int n) {
		String result = "";
		if(n % 3 == 0)
		{
			result = "Fizz";
		}
		
		if(n % 5 == 0)
		{
			result += "Buzz";
		}
		
		return !result.isEmpty() ? result : String.valueOf(n);
	}

}
