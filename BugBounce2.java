// The "BugBounce2" class.
import hsa.PaintBug;
import java.awt.*;
public class BugBounce2
{
    public static void main (String[] args)
    {
	double xPosition = Math.random () * 400;
	double yPosition = Math.random () * 300;
	double direction = Math.random () * 360;
	PaintBug bug1 = new PaintBug (xPosition, yPosition, direction, Color.RED);
	bug1.hide ();
	PaintBug bug2 = new PaintBug (xPosition, yPosition, direction, Color.GREEN);
	bug2.trailOff ();
	PaintBug bug3 = new PaintBug (xPosition, yPosition, direction, Color.WHITE);
	bug3.hide();
	bug3.setTrailWidth(10);
	PaintBug.setSpeed (98);
	int a, b, c;
	boolean test = false;
	a = (int) (Math.random () * 256);
	b = (int) (Math.random () * 256);
	c = (int) (Math.random () * 256);
	while (0 < 1)
	{
	    if (bug1.getYPos () <= 0 || bug1.getYPos () >= 300)
	    {
		bug1.setDirection (360 - bug1.getDirection ());
		bug1.move(2);
		a = (int) (Math.random () * 256);
		b = (int) (Math.random () * 256);
		c = (int) (Math.random () * 256);
	    } //if
	    if (bug1.getXPos () <= 0 || bug1.getXPos () >= 400)
	    {
		bug1.setDirection (180 - bug1.getDirection ());
		bug1.move(2);
		a = (int) (Math.random () * 256);
		b = (int) (Math.random () * 256);
		c = (int) (Math.random () * 256);
	    } //if
	    if (bug3.getYPos () <= 0 || bug3.getYPos () >= 300)
	    {
		bug3.setDirection (360 - bug3.getDirection ());
	    } //if
	    if (bug3.getXPos () <= 0 || bug3.getXPos () >= 400)
	    {
		bug3.setDirection (180 - bug3.getDirection ());
	    } //if
	    bug1.setColor (new Color (a, b, c));
	    bug1.hide ();
	    bug2.setColor (new Color (255 - a, 255 - b, 255 - c));
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
	    bug1.move (1);
	    bug2.setPosition (bug1.getXPos (), bug1.getYPos ());
	    bug2.turnRight (1);
	    bug3.move(1);
	} //while
    } // main method
} //BugBounce2 class
