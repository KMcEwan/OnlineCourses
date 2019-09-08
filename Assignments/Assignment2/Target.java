/*
 * Creates a red and white archery target.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram 

{	
	private static final long serialVersionUID = 1L;
	
	private static final int LargeRadii = 96;
	private static final int midRadii = 59;
	private static final int smallRadii = 28;

	public void run() 
	{
		int heightMid = getHeight() / 2;
		int widthMid = getWidth() / 2 ;
		
		int largeX = widthMid - LargeRadii;
		int medX = widthMid - midRadii;
		int smallX = widthMid - smallRadii;
		
		int largeY = heightMid - LargeRadii;
		int medY = heightMid - midRadii;
		int smallY = heightMid - smallRadii;
		
		drawCircle(largeX, largeY, 2 *LargeRadii, 2 * LargeRadii, Color.RED);
		drawCircle(medX, medY, 2 * midRadii, 2 * midRadii, Color.WHITE);
		drawCircle(smallX, smallY, 2 * smallRadii, 2 * smallRadii, Color.RED);
	}
	
	private void drawCircle(int x, int y, int radX, int radY, Color colour)
	{
		GOval circle = new GOval(x, y, radX, radY);
		circle.setFilled(true);
		circle.setColor(colour);
		add(circle);
	}
}
