// The "SpinBug" class.
import hsa.PaintBug;
import java.awt.*;
public class SpinBug
{
    public static void main (String[] args)
    {
	double xPosition = Math.random () * 400;
	double yPosition = Math.random () * 300;
	double direction = Math.random () * 360;
	PaintBug bug1 = new PaintBug (xPosition, yPosition, direction, Color.RED);
	bug1.hide ();
	PaintBug bug2 = new PaintBug (xPosition, yPosition, direction, Color.RED);
	bug2.trailOff ();
	PaintBug.setSpeed (98);
	while (0 < 1)
	{
	    if (bug1.getYPos () <= 0 || bug1.getYPos () >= 300)
	    {
		bug1.setDirection (360 - bug1.getDirection ());
	    } //if
	    if (bug1.getXPos () <= 0 || bug1.getXPos () >= 400)
	    {
		bug1.setDirection (180 - bug1.getDirection ());
	    } //if
	    bug1.move (1);
	    bug2.setPosition (bug1.getXPos (), bug1.getYPos ());
	    bug2.turnRight (1);
	} //while
    } // main method
} // SpinBug class
