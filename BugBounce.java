// The "BugBounce" class.
import hsa.PaintBug;
import java.awt.*;
public class BugBounce
{
    public static void main (String[] args)
    {
	double xPosition = Math.random () * 400;
	double yPosition = Math.random () * 300;
	double direction = Math.random () * 360;
	PaintBug bug = new PaintBug (xPosition, yPosition, direction, Color.RED);
	PaintBug.setSpeed (95);
	while (0 < 1)
	{
	    if (bug.getYPos () <= 0 || bug.getYPos () >= 300)
	    {
		bug.setDirection (360 - bug.getDirection ());
	    } //if
	    if (bug.getXPos () <= 0 || bug.getXPos () >= 400)
	    {
		bug.setDirection (180 - bug.getDirection ());
	    } //if
	    bug.move (1);
	} //while
    } // main method
} // BugBounce class
