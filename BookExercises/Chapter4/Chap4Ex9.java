/*
 * Takes in a positive integer and prints out the reverse.
 */
import acm.program.*;

public class Chap4Ex9 extends ConsoleProgram
{
	public void run()
	{		
		int start = 0;
		int a = 1;
		int fib = 0;
		
		for (int i = 0; i < 15; i++)
		{
			fib = start + a;
			start = a;
			println(fib);
			a = fib;
			
		}
	}	

}
