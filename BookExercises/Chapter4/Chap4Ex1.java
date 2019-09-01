import acm.program.*;

public class Chap4Ex1 extends ConsoleProgram
{
	public void run()
	{
		for(int i = 99; i > 0; i--)
		{
			println(i + " bottles of beer on the wall.");
			println(i + " bottles of beer.");
			println("You take one down, pass it around");
			println(i - 1 + " bottles of beer on the wall.....");
		}
	}
	
	
}