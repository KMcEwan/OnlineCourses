/*
 * Prints out a countdown timer
 */
import acm.program.*;

public class Chap4Ex8 extends ConsoleProgram
{
	public void run()
	{		
		int liftOff = 10;
		while(liftOff >= 0)
		{
			println(liftOff);
			liftOff--;
		}
		println("LIFT OFF!!");
	}	

}
