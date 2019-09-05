/*
 * Prints out a pyramid
 */
import acm.graphics.GRect;
import acm.program.*;

public class Chap4Ex11 extends GraphicsProgram
{
	public static final int BRICK_WIDTH = 30;
	public static final int BRICK_HEIGHT = 12;
	public static final int BRICKS_IN_BASE = 12;

	public void run()
	{		
		 setSize(1000, 500);
		
		int width  = getWidth();
		int height = getHeight();
		int midPointX = width / 2;
		int midPointY = height / 2;
			
		for (int i = 0; i < BRICKS_IN_BASE; i++)
		{					
			int startingX = midPointX - (BRICKS_IN_BASE * BRICK_WIDTH / 2);
			int startingY = midPointY + (BRICKS_IN_BASE * BRICK_HEIGHT / 2);
			startingX += i * (BRICK_WIDTH / 2);
			startingY -= i * BRICK_HEIGHT;
			
			for (int j = 0; j < BRICKS_IN_BASE - i; j++)
			{
				drawBrick(startingX, startingY);
				startingX +=  BRICK_WIDTH ;					
			}
		}				
	
	}	
	/*Method called to add bricks to canvas */
	private void drawBrick(int x, int y)
	{
		GRect rect = (new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT));
		add(rect);
	}
}
