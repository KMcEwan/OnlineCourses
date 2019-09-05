/*
 * File: UnitedNationsKarel.java
 * ----------------------------
 * The UnitedNationsKarel subclass builds houses at corners
 * marked by rubble.
 */

import stanford.karel.*;

public class UnitedNationsKarel extends SuperKarel {
	
	public void run()
	{
		while(noBeepersPresent())
		{
			move();
			if(beepersPresent())
			{
				drawHouse();
				orientate();
			}
		}
	
	}
	
	private void drawHouse()
	{
		drawMid();
		drawLeft();
		drawRight();
	}
	
	private void drawMid()
	{
		turnLeft();
		pickBeeper();
		for(int i = 0; i < 3; i++)
		{
			move();
			putBeeper();
		}
	}
	
	private void drawLeft()
	{
		turnLeft();
		move();
		turnLeft();
		for(int i = 0; i < 3; i++)
		{
			move();
			putBeeper();
		}
	}
	
	private void drawRight()
	{
		turnLeft();
		move();
		move();
		turnLeft();
		for(int i = 0; i < 2; i++)
		{
			putBeeper();
			move();
		}
		putBeeper();
	}
	
	private void orientate()
	{
		turnAround();
		move();
		move();
		turnLeft();
		if(frontIsClear())
		{
			move();
		}
	}

}
