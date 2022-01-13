	package com.katas.BowlingGame.code;

public class BowlingGame {

	
	private int[] rolls = new int[21];
	private int currentRoll = 0;
	public void roll(int pinsdown) {
		rolls[currentRoll++] = pinsdown; 
	}

	/**
	 * Calculates the bowling game score.
	 * @return
	 */
	public Integer getScore() {
		
		int score = 0;
		int frameIndex = 0;
		//loop through each frame, 2 rolls at a time.
		for (int frame = 0; frame < 10; frame++) {
			if(isStrike(frameIndex))
			{
				score += 10 + strikeBonus(frameIndex);
				frameIndex++;
			}
			else if(isSpare(frameIndex)) //spare condition
			{
				score += 10 + spareBonus(frameIndex);
				frameIndex+=2;
			}
			else {
				score += sumOfBallsInFrame(frameIndex);
				frameIndex+=2;
			}
				
			
			
		}
		
		return score;
	}

	private int spareBonus(int frameIndex) {
		return rolls[frameIndex+2];
	}
	
	private int strikeBonus(int frameIndex)
	{
		return rolls[frameIndex+1] + spareBonus(frameIndex);
	}
	
	
	
	private int sumOfBallsInFrame(int frameIndex) {
		return rolls[frameIndex] + rolls[frameIndex+1];
	}

	private boolean isStrike(int frameIndex) {
		return rolls[frameIndex] == 10;
	}

	private boolean isSpare(int frameIndex) {
		return sumOfBallsInFrame(frameIndex) == 10;
	}

}
