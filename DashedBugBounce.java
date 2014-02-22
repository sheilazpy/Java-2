// The "DashedBugBounce" class.
import hsa.PaintBug;
import java.awt.*;
public class DashedBugBounce
{
    public static void main (String[] args)
    {
	double xPosition = Math.random () * 400;
	double yPosition = Math.random () * 300;
	double direction = Math.random () * 360;
	double dLength = Math.random () * 20 + 5;
	double dSpace = Math.random () * 20 + 5;
	double direction1 = Math.random () * 360;
	PaintBug bug2 = new PaintBug(xPosition, yPosition, direction1, Color.BLUE);
	DashedPaintBug bug = new DashedPaintBug (xPosition, yPosition, direction, Color.RED, dLength, dSpace);
	DashedPaintBug.setSpeed (95);
	while (true)
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
	    if (bug2.getYPos () <= 0 || bug2.getYPos () >= 300)
	    {
		bug2.setDirection (360 - bug2.getDirection ());
	    } //if
	    if (bug2.getXPos () <= 0 || bug2.getXPos () >= 400)
	    {
		bug2.setDirection (180 - bug2.getDirection ());
	    } //if
	    bug2.move (1);
	} //while
    } // main method
} // DashedBugBounce class
