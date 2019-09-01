/*
 * Prints out all integers which are divisible by 6 or 7.
 */
import acm.program.*;

public class Chap4Ex4 extends ConsoleProgram
{

	public void run()
	{
		for (int i = 0; i <= 100; i++)
		{
			if ((i % 6 == 0) || (i % 7 == 0))
			{
				println(i);
			}
		}
	}
}