// The "LineBug" class.
import hsa.PaintBug;
import java.awt.*;
public class LineBug
{
    public static void main (String[] args)
    {
	double xPosition = Math.random () * 400;
	double yPosition = Math.random () * 300;
	double direction = Math.random () * 360;
	PaintBug bug1 = new PaintBug (xPosition, yPosition, direction, Color.RED);
	PaintBug bug2 = new PaintBug (xPosition, yPosition, direction, Color.WHITE);
	bug2.hide ();
	PaintBug.setSpeed (98);
	while (0 < 1)
	{
	    if (bug1.getYPos () <= 0 || bug1.getYPos () >= 300)
	    {
		bug1.setDirection (360 - bug1.getDirection ());
		bug1.move (1);
	    } //if
	    if (bug1.getXPos () <= 0 || bug1.getXPos () >= 400)
	    {
		bug1.setDirection (180 - bug1.getDirection ());
		bug1.move (1);
	    } //if
	    if (bug2.getYPos () <= 0 || bug2.getYPos () >= 300)
	    {
		bug2.setDirection (360 - bug2.getDirection ());
	    } //if
	    if (bug2.getXPos () <= 0 || bug2.getXPos () >= 400)
	    {
		bug2.setDirection (180 - bug2.getDirection ());
	    } //if
	    bug1.move (1);
	    bug2.move (1);
	} //while
    } // main method
} // LineBug class
