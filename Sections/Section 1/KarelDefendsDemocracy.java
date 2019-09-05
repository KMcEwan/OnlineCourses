import stanford.karel.*;


public class KarelDefendsDemocracy extends SuperKarel
{
	public void run()
	{
		while(frontIsClear())
		{			
			checkFront();
		}
	}
	
	private void checkFront()
	{
		if(frontIsClear())
		{
			move();		
			if(noBeepersPresent())
			{
				clearCard();
			}
		}
		move();
	}
	
	private void clearCard()
	{
		moveNorth();
		while(beepersPresent())
		{
			pickBeeper();
		}
		moveSouth();
		while(beepersPresent())
		{
			pickBeeper();
		}
		orientateForMid();		
	}
	
	private void moveNorth()
	{
		turnLeft();
		move();
	}
	
	private void moveSouth()
	{
		turnAround();
		move();
		move();
	}
	
	private void orientateForMid()
	{
		turnAround();
		move();
		turnRight();
	}
}