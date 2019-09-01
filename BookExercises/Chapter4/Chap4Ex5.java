/*
 * Reads in grades until the sentinel is given, when it then prints out the 
 * average grade
 */
import acm.program.*;

public class Chap4Ex5 extends ConsoleProgram
{

	public void run()
	{
		double gradeTotal = 0;
		int numberOfTests = 0;
		while(true)
		{
			int value = readInt("Enter a value");
			if (value == SENTINEL) break;
			gradeTotal += value;		
			numberOfTests++;
		}
		println("The average for the test was : " + (gradeTotal / numberOfTests));
	}
	
	private static final int SENTINEL = -1;
}