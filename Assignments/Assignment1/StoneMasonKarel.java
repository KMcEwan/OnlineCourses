/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
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
				decentColumn();			
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
	
	private void decentColumn()
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
	