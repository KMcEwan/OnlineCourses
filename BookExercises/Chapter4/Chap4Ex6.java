/*
 * Takes in a positive integer and prints out the reverse.
 */
import acm.program.*;

public class Chap4Ex6 extends ConsoleProgram
{

	public void run()
	{
		println("This program reverses your input");
		int userInput = readInt("Enter a positive integer : ");
		
		int lastDigit = 0;
		int reversedInput = 0;
		
		while(userInput > 0)
		{
			lastDigit = userInput % 10 ;
			reversedInput = reversedInput * 10 + lastDigit;		
			userInput /= 10;
		}
		println(reversedInput);
	}	
}