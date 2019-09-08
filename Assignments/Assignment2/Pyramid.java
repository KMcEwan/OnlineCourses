/*
 *Draws a pyramid with a base of 14, and 14 bricks high.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

	private static final long serialVersionUID = 1L;

	/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

	/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

	/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	
	
	public void run() 
	
	{					
		int startingPointX = (getWidth() / 2) - (BRICKS_IN_BASE * (BRICK_WIDTH / 2));
		int startingPointY = getHeight() - BRICK_HEIGHT;
		
		int posX = startingPointX;
		int posY = startingPointY;
			
		for (int i = 0; i < BRICKS_IN_BASE; i++)
		{ 
			posX = startingPointX;
			posY = startingPointY;			
							
			posX += ( i * BRICK_WIDTH / 2);
			posY -= (i * BRICK_HEIGHT);		
			
		
			for (int j = 0; j < BRICKS_IN_BASE - i; j++)
			{
				drawBrick(posX, posY);
				posX += BRICK_WIDTH;
			}
				
			
		}
	}
	
	private void drawBrick(int x, int y)
	{
		GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
		add(brick);		
	}
	
}

