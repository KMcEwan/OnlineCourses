/*
 * Shows the hierarchy of the acm.program package
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram 
{	
	private static final long serialVersionUID = 1L;
	
	private static final int BOX_WIDTH = 150;
	private static final int BOX_HEIGHT = 50;
	
	
		
	public void run() 
	{	
		final int halfWidth = getWidth() / 2;
		final int halfHeight = getHeight() / 2;
		
		final int quat = getWidth() / 4;
		
				
		/** Bottom row of boxes */
		drawBox(quat * 2 - (BOX_WIDTH / 2), halfHeight, BOX_WIDTH, BOX_HEIGHT ); 		//Middle box
		drawBox(quat - (BOX_WIDTH / 2), halfHeight, BOX_WIDTH, BOX_HEIGHT );		 	//Left box
		drawBox(quat * 3  - (BOX_WIDTH / 2), halfHeight, BOX_WIDTH, BOX_HEIGHT );	    //Right box
		
		/** Top box */
		drawBox(quat * 2 - (BOX_WIDTH / 2), halfHeight - (BOX_HEIGHT * 2), BOX_WIDTH, BOX_HEIGHT );
		
		
		/** Bottom row of labels */
		drawDialog("ConsoleProgram", quat * 2 ,  halfHeight + BOX_HEIGHT/2); 	//Middle label
		drawDialog("GraphicsProgram", quat,  halfHeight + BOX_HEIGHT/2);	 	//Left label
		drawDialog("DialogProgram", quat * 3,  halfHeight + BOX_HEIGHT/2);		 //Right label
		
		/** Top label */
		drawDialog("Program", quat * 2 ,  halfHeight - (BOX_HEIGHT * 2) + (BOX_HEIGHT/2));
		
		/** All connecting lines */		
		drawLine(quat, halfHeight, quat * 2, halfHeight - BOX_HEIGHT); 			//Left to top
		drawLine(quat * 2, halfHeight, quat * 2, halfHeight - BOX_HEIGHT);		//Mid to top
		drawLine(quat * 3, halfHeight, quat * 2, halfHeight - BOX_HEIGHT);		//Right to top
	}
	
	private void drawBox(int X, int Y, int width, int height)
	{
		GRect box = new GRect(X, Y, width, height);
		add(box);
	}
	
	private void drawDialog(String str, int x, int y)
	{		
		GLabel label = new GLabel(str, x, y);
		double width = label.getWidth();
		double height = label.getAscent();
		
		add(label);
		label.move(-width / 2, height / 2);
	}
	
	private void drawLine(double Sx, double Sy,double Fx, double Fy)
	{
		GLine line = new GLine(Sx, Sy, Fx, Fy);
		add(line);
	}
	
}

