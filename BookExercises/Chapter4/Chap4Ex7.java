/*
 * Prints the Digit root of a number
 */
import acm.program.*;

public class Chap4Ex7 extends ConsoleProgram
{
	public void run()
	{
		int userInput = readInt("Enter a number : ");
		int sum = 0;
		int inputMod = 0;
		while(userInput > 0)
		{
			sum = 0;
			while (userInput > 0)
			{				
				inputMod = userInput % 10;
				sum = sum + inputMod;
				userInput /= 10;				
			}
			//sum += userInput;
			println(sum);
			if(sum >= 10)
			{
				userInput = sum;	
			}
						
			
		}
	}	

}
