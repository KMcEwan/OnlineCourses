/*
 * Takes in a set of numbers until the sentinel is given, when it then prints out the largest value
 * that had been entered.
 */
import acm.graphics.GRect;
import acm.program.*;

public class Chap4Ex12 extends ConsoleProgram
{
	
	public void run()
	{		
		final int SENTINEL = 0;
		int value = 0;
		println("This program finds the largest integer in a list. Enter values, one per line,"
				+ "using a 0 to signal the end of the list.");
		
		while (true)
		{
			int val = readInt( "?" );
			if (val == SENTINEL) break;
			if (value < val)
			{
				value = val;
			}
		}
		println("The largest value is " + value);
		
	}	
	
	
}
