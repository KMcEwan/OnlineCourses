/*
 * Prints out the Fibonacci sequence up till 10,000
 */
import acm.program.*;

public class Chap4Ex10 extends ConsoleProgram
{
	public void run()
	{		
		int start = 0;
		int a = 1;
		int fib = 0;
		
		while(fib < 10000)
		{
			
			fib = start + a;
			start = a;
			if (fib > 10000) break;
			println(fib);
			a = fib;
			
		}
	}	

}
