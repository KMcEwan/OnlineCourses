/*
 * Takes in a set of numbers until the sentinel is given, when it then prints out the largest
 *second largest value that had been entered.
 */
import acm.graphics.GRect;
import acm.program.*;

public class Chap4Ex13 extends ConsoleProgram
{
	
	public void run()
	{		
		final int SENTINEL = 0;
		int largest = 0;
		int second = 0;
		println("This program finds the largest integer in a list. Enter values, one per line,"
				+ "using a 0 to signal the end of the list.");
		
		while (true)
		{
			int val = readInt( "?" );
			if (val == SENTINEL) break;
			if (largest < val)
			{
				second = largest;
				largest = val;				
			}
			else if(second < val)
			{
				second = val;
			}
			
			
		}
		println("The largest value is " + largest);
		println("The second largest is " + second);
		
	}	
	
	
}
