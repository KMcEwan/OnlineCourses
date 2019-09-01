/*
 * File: StoneMasonKarel.java
 * --------------------------
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void run()
	{		
		while (frontIsClear())
		{			
				accendColumn();
				if(frontIsClear())
				{
					moveToNextColumn();
				}				
				decendColumn();			
				if(frontIsClear())
				{
					moveToNextColumn();
				}
		}
		
	}
	
	private void accendColumn()
	{
		turnLeft();		
		while(frontIsClear())
		{
			if (noBeepersPresent())
			{
				putBeeper();				
			}		
			move();
		}
		if (noBeepersPresent())
		{
			putBeeper();			
		}
		turnRight();
	}
	
	private void moveToNextColumn()
	{
		move();
		if(frontIsClear())
		{
			move();
		}
		if(frontIsClear())
		{
			move();
		}
		if(frontIsClear())
		{
			move();
		}
				
	}
	
	private void decendColumn()
	{
		turnRight();
		while(frontIsClear())
		{
			if(noBeepersPresent())
			{
				putBeeper();				
			}
			move();
		}
		if(noBeepersPresent())
		{
			putBeeper();
		}
		turnLeft();
	}
	
}
	