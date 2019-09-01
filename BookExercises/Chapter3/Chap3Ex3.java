import acm.program.*;

public class Chap3Ex3 extends ConsoleProgram
{
	public void run()
	{
		double rad = readDouble("Input value for the radius: ");
		double area = PI * (rad*rad);
		println ("The area of the circle is: " + area);
		
	}
	private static final double PI = 3.1416;
	
}