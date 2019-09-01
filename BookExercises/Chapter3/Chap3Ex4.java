/*
 * Takes in a value for the radius and computes the area of a circle. 
 */
import acm.program.*;

public class Chap3Ex4 extends ConsoleProgram
{
	public void run()
	{
		double rad = readDouble("Input value for the radius: ");
		double area = PI * (rad*rad);
		println ("The area of the circle is: " + area);
		
	}
	private static final double PI = 3.1416;
	
}