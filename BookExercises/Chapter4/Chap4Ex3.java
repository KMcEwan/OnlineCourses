/*
 * Program reads in a pos int, N, and sums the first N odd numbers.
 */
import acm.program.*;

public class Chap4Ex3 extends ConsoleProgram
{
	public void run()
	{
		int total = 1;
		int num = 0;
				
		int val = readInt("Enter a positive value: ");
		
		for (int i = 0; i < val; i++)
		{
			println(total);
			num += total;
			total+=2;			
		}
		
		println("The negative numbers within " + val + "equate to : " + num);
	}
}

