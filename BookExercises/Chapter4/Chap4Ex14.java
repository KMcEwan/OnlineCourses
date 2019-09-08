/*
 * Program draws a checker board
 */
import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.*;

public class Chap4Ex14 extends GraphicsProgram
{
	public void run()
	{		
		double sqSize = (double) getHeight() / N_ROWS;
		int halfPoint = getWidth() / 2;
		int startingX = (int) (halfPoint - ( 4  * sqSize));
		
			for (int i = 0; i < N_ROWS; i++)
			{
				for (int j = 0; j < N_COLUMNS; j++)
				{
					double x =  startingX + (j * sqSize);
					double y =  (i * sqSize);
					GRect sq = new GRect (x, y, sqSize, sqSize);
					sq.setColor(Color.GRAY);
					sq.setFilled((i + j) % 2 != 0);
					add(sq);
					
					if (((i + j) % 2 != 0) && (i < 3))
					{
						GOval oval = new GOval (x + 3, y + 3, sqSize - 6, sqSize - 6);
						oval.setColor(Color.RED);
						oval.setFilled(true);
						add(oval);
					}
					
					if (((i + j) % 2 != 0) && i > 4 )
					{
						GOval oval = new GOval (x + 3, y + 3, sqSize - 6, sqSize - 6);
						oval.setColor(Color.BLACK);
						oval.setFilled(true);
						add(oval);
					}
					
					
				}
			}
	}	
	
	private static final int N_ROWS = 8;
	private static final int N_COLUMNS = 8;
}

/*
while (i < 3)
{
	if ((i + j) % 2 != 0)
	{
		GOval oval = new GOval (x, y, sqSize, sqSize);
		oval.setColor(Color.RED);
		oval.setFilled(true);
		add(oval);
		break;
	}
	else break;
}

while(i > 4)
{
	if ((i + j) % 2 != 0)
	{
		GOval oval = new GOval (x, y, sqSize, sqSize);
		oval.setColor(Color.BLACK);
		oval.setFilled(true);
		add(oval);
		break;
	}
	else break;
}
*/
