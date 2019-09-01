/*
 * File: CollectNewspaperKarel.java
 * --------------------------------

 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void run() {
		moveToNewspaper();
		pickUpNewspaper();
		moveToStartingPoint();
		} 
	
	private void moveToNewspaper() {
		move();
		turnRight();
		move(); 
		turnLeft();
		move();
		move();
	}
	
	private void pickUpNewspaper()
	{
		pickBeeper();
	}
	
	private void moveToStartingPoint()
	{
		turnAround();
		move();
		move();
		move();
		turnRight();
		move();
		turnRight();
	}
}
