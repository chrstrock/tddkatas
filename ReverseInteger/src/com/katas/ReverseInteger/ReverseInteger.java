package com.katas.ReverseInteger;

public class ReverseInteger {

	/**
	 * This method takes a 32 bit integer and reverses it, accounting for Integer overload.
	 * If negative, the reversal retains the negative sign.
	 * This was implemented mathematically rather than converting to a string, reversing, 
	 * than reverting back to an integer.  This was created using TDD.
	 * @param n - the integer to reverse.
	 * @return
	 */
	public Integer reverseInt(int n) {
		int result = 0; //variable to store the result
		
			int lastDigit = 0; //variable to store the last digit to incrementally reverse
			
			while(n != 0) //if n is zero we just return it.
			{
				lastDigit = n % 10;
				n /= 10;
				//check reversal doesn't cause overload.
				//If the MAX or MIN value of an integer is reached or exceeded by multiplying by 10, we need to break
				//out of the while loop.
				if(result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE / 10 && lastDigit > 7)) return 0;
				if(result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE / 10 && lastDigit < -8)) return 0;
				
				result = result * 10 + lastDigit;
			}
			
		
		return result;
	}
	
	

}

	
