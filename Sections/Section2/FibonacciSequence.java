/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class FibonacciSequence extends ConsoleProgram {	
	
	private static final long serialVersionUID = 1L;

	
	public void run() 
	{
		
		int first = 0;
		int second = 1;
		int fib = 0;
				
		while(fib < MAX_TERM_VALUE)	
		{
			println(fib);
			first = fib + second;
			fib = second;
			second = first;
			
		}
	}
	
	static final int MAX_TERM_VALUE = 10000;
}
