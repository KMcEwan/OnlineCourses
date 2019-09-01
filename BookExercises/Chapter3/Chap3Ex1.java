/* 
 * Program takes in two values, feet and inches, and outputs a value in CM.
 */

import acm.program.*;

public class Chap3Ex1 extends ConsoleProgram
{
	public void run()
	{
		println("This program converts feet and inches to centimeters.");
		int feet = readInt("Enter value in feet : ");
		double inches = readDouble("Enter value in inches : ");
		double ftToCm = feet * CM_PER_FOOT;
		double inToCm = inches * CENTIMERTS_PER_INCH;
		double cmTotal = ftToCm + inToCm;
		println(feet + "ft " + inches + "in = " + cmTotal + "cm");
	}
	
	private static final double CENTIMERTS_PER_INCH = 2.54;
	private static final double CM_PER_FOOT = 30.48;
}