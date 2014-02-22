// The "ColorChangeBug" class.
import hsa.PaintBug;
import java.awt.*;
public class ColorChangeBug
{
    public static void main (String[] args)
    {
	double xPosition = Math.random () * 400;
	double yPosition = Math.random () * 300;
	double direction = Math.random () * 360;
	PaintBug bug = new PaintBug (xPosition, yPosition, direction, Color.RED);
	PaintBug.setSpeed (98);
	int a, b, c;
	boolean test = false;
	a = (int) (Math.random () * 256);
	b = (int) (Math.random () * 256);
	c = (int) (Math.random () * 256);
	while (0 < 1)
	{
	    if (bug.getYPos () <= 0 || bug.getYPos () >= 300)
	    {
		bug.setDirection (360 - bug.getDirection ());
		a = (int) (Math.random () * 256);
		b = (int) (Math.random () * 256);
		c = (int) (Math.random () * 256);
	    } //if
	    if (bug.getXPos () <= 0 || bug.getXPos () >= 400)
	    {
		bug.setDirection (180 - bug.getDirection ());
		a = (int) (Math.random () * 256);
		b = (int) (Math.random () * 256);
		c = (int) (Math.random () * 256);
	    } //if
	    bug.setColor (new Color (a, b, c));
	    if (a > 250)
		test = true;
	    if (a < 5)
		test = false;
	    if (test == true)
	    {
		a -= (int) (Math.random () * 5);
	    } //if
	    else
	    {
		a += (int) (Math.random () * 5);
	    } //else
	    if (b > 250)
		test = true;
	    if (b < 5)
		test = false;
	    if (test == true)
	    {
		b -= (int) (Math.random () * 5);
	    } //if
	    else
	    {
		b += (int) (Math.random () * 5);
	    } //else
	    if (c > 250)
		test = true;
	    if (c < 5)
		test = false;
	    if (test == true)
	    {
		c -= (int) (Math.random () * 5);
	    } //if
	    else
	    {
		c += (int) (Math.random () * 5);
	    } //else
	    bug.move (1);
	} //while
    } // main method
} //ColorChangeBug class
