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

public class DrawingAFace extends GraphicsProgram {	
	
	private static final long serialVersionUID = 1L;
	
	static final int HEAD_WIDTH = 130;
	static final int HEAD_HEIGHT = 200;
	
	static final int EYES_RADIUS = 20;
	
	static final int MOUTH_WIDTH = 80;
	static final int MOUTH_HEIGHT = 30;

	
	public void run()
	{
		setSize(500, 300);
		
		int midWidth = getWidth() / 2;
		int midHeight = getHeight() / 2;
			
		drawHead(midWidth, midHeight);
		drawEyes(midWidth - (HEAD_WIDTH / 4), midHeight - (HEAD_HEIGHT / 4));
		drawEyes(midWidth + (HEAD_WIDTH / 4), midHeight - (HEAD_HEIGHT / 4));
		drawMouth(midWidth - (MOUTH_WIDTH / 2), midHeight + (HEAD_HEIGHT /4) - (MOUTH_HEIGHT / 2));
		
				
	}
	
	private void drawHead(int x, int y)
	{
		GRect head = new GRect (x - (HEAD_WIDTH / 2), y - (HEAD_HEIGHT / 2), HEAD_WIDTH, HEAD_HEIGHT);
		head.setFilled(true);
		head.setFillColor(Color.GRAY);		
		add(head);
		
	}
	
	private void drawEyes(int x, int y)
	{
		GOval eyes = new GOval (x - (EYES_RADIUS/2), y, EYES_RADIUS, EYES_RADIUS);
		eyes.setFilled(true);
		eyes.setFillColor(Color.YELLOW);		
		add(eyes);
	}
	
	private void drawMouth(int x, int y)
	{
		GRect mouth = new GRect (x,  y, MOUTH_WIDTH, MOUTH_HEIGHT);
		mouth.setFilled(true);
		mouth.setFillColor(Color.WHITE);		
		add(mouth);
	}
	
	

}
