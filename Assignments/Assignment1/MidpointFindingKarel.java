/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void run()
	{
		fillStage();
		turnAround();		
		moveEast();	
			
	}
	
	private void fillStage()
	{
		while(frontIsClear())
		{
			putBeeper();
			move();
		}
		putBeeper();
	}
	
	private void moveEast()
	{		
		if(beepersPresent())			//Karel starts facing west on the last corner east. if a beeper	
		{								//is present move west to find if there is a beeper in the next  
			move();						//corner. If so move back to the first beeper and pick it up
			if(beepersPresent())		
			{							
				moveBeeperE();
			}
			moveWest();
		}
		else							//If no beeper present move until present, once beeper is found, repeat as above
		{									
			while(noBeepersPresent())	
			{							
				move();
			}
			move();
			if(beepersPresent())
			{
				moveBeeperE();
				moveWest();
			}
			
			else						//if checking for 2nd beeper is neg then stop on that beeper.
			{				
				while(noBeepersPresent())
				{
					move();
					if(frontIsBlocked())
					{
						turnAround();
					}
				}
			}
		}
		
	}
	
	private void moveWest()
	{
		if(beepersPresent())
		{			
			move();
			if(beepersPresent())
			{
				moveBeeperW();
			}
			moveEast();
		}
		else
		{			
			while(noBeepersPresent())
			{
				move();
			}
			move();
			if(beepersPresent())
			{
				moveBeeperW();
				moveEast();
				
			}
			else
			{
				while(noBeepersPresent())
				{
					move();					
					if(frontIsBlocked())
					{
						turnAround();
					}	
					
				}
				turnAround();
			}
		}
		
	}
	
	private void moveBeeperW()								
	{
		turnAround();
		move();
		pickBeeper();		
		turnAround();
		while(frontIsClear())
		{
			move();
		}
		turnAround();
	}
	
	private void moveBeeperE()
	{
		turnAround();
		move();
		pickBeeper();		
		turnAround();
		while(frontIsClear())
		{
			move();
		}
		turnAround();
	}
		
}
