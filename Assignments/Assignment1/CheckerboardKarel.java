/*
 * File: CheckerboardKarel.java
 * ----------------------------
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
