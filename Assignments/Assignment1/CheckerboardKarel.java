/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void run() 
	{
		putBeeper();
		if(frontIsClear())
		{
			while(frontIsClear())
			{
					moveEast();
					if(frontIsClear())
					{
						moveIntoPosGoingWest();
					}
				
				if(frontIsClear())
				{
					moveWest();
					if(frontIsClear())
					{
						moveIntoPosGoingEast();
					}
				}	
								
			}
			
		}
		else
		{
			turnLeft();
			while(frontIsClear())
			{
				move();
				if(frontIsClear())
				{
					move();
					putBeeper();
				}
			}
			
		}
	}
	
	private void moveEast()
	{
		while(frontIsClear())
		{
			move();
			if(frontIsClear())
			{
				move();
				putBeeper();
			}
		}
		turnLeft();
	}
	
	private void moveWest()
	{
		while(frontIsClear())
		{
			move();
			if(frontIsClear())
			{
				move();
				putBeeper();
			}
		}
		turnRight();
	}
	
	private void moveIntoPosGoingWest()
	{
		if(beepersPresent())
		{			
			move();
			turnLeft();
			move();
			putBeeper();
		}
		else
		{			
			move();
			turnLeft();
			putBeeper();
		}
	}
	
	private void moveIntoPosGoingEast()
	{
		if(beepersPresent())
		{			
			move();
			turnRight();
			move();
			putBeeper();
		}
		else
		{			
			move();
			turnRight();
			putBeeper();
		}
	}
}
