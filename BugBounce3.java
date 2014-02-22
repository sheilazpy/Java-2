// The "BugBounce3" class.
import hsa.PaintBug;
import java.awt.*;
public class BugBounce3
{
    public static void main (String[] args)
    {
	double xPosition = Math.random () * 400;
	double yPosition = Math.random () * 300;
	double direction = Math.random () * 360;
	PaintBug bug1 = new PaintBug (xPosition, yPosition, direction, Color.RED);
	bug1.hide ();
	PaintBug bug2 = new PaintBug (xPosition, yPosition, direction, Color.BLUE);
	bug2.trailOff ();
	xPosition = Math.random () * 400;
	yPosition = Math.random () * 300;
	direction = Math.random () * 360;
	PaintBug bug3 = new PaintBug (xPosition, yPosition, direction, Color.GREEN);
	bug3.hide ();
	PaintBug bug4 = new PaintBug (xPosition, yPosition, direction, Color.RED);
	bug4.trailOff ();
	xPosition = Math.random () * 400;
	yPosition = Math.random () * 300;
	direction = Math.random () * 360;
	PaintBug bug5 = new PaintBug (xPosition, yPosition, direction, Color.BLUE);
	bug5.hide ();
	PaintBug bug6 = new PaintBug (xPosition, yPosition, direction, Color.GREEN);
	bug6.trailOff ();
	PaintBug.setSpeed (98);
	int a1, b1, c1, a2, b2, c2, a3, b3, c3;
	boolean test = false;
	a1 = (int) (Math.random () * 256);
	b1 = (int) (Math.random () * 256);
	c1 = (int) (Math.random () * 256);
	a2 = (int) (Math.random () * 256);
	b2 = (int) (Math.random () * 256);
	c2 = (int) (Math.random () * 256);
	a3 = (int) (Math.random () * 256);
	b3 = (int) (Math.random () * 256);
	c3 = (int) (Math.random () * 256);
	while (0 < 1)
	{
	    if (bug1.getYPos () <= 0 || bug1.getYPos () >= 300)
	    {
		bug1.setDirection (360 - bug1.getDirection ());
		// a1 = (int) (Math.random () * 256);
		// b1 = (int) (Math.random () * 256);
		// c1 = (int) (Math.random () * 256);
	    } //if
	    if (bug1.getXPos () <= 0 || bug1.getXPos () >= 400)
	    {
		bug1.setDirection (180 - bug1.getDirection ());
		// a1 = (int) (Math.random () * 256);
		// b1 = (int) (Math.random () * 256);
		// c1 = (int) (Math.random () * 256);
	    } //if
	    if (bug3.getYPos () <= 0 || bug3.getYPos () >= 300)
	    {
		bug3.setDirection (360 - bug3.getDirection ());
		// a2 = (int) (Math.random () * 256);
		// b2 = (int) (Math.random () * 256);
		// c2 = (int) (Math.random () * 256);
	    } //if
	    if (bug3.getXPos () <= 0 || bug3.getXPos () >= 400)
	    {
		bug3.setDirection (180 - bug3.getDirection ());
		// a2 = (int) (Math.random () * 256);
		// b2 = (int) (Math.random () * 256);
		// c2 = (int) (Math.random () * 256);
	    } //if
	    if (bug5.getYPos () <= 0 || bug5.getYPos () >= 300)
	    {
		bug5.setDirection (360 - bug5.getDirection ());
		// a3 = (int) (Math.random () * 256);
		// b3 = (int) (Math.random () * 256);
		// c3 = (int) (Math.random () * 256);
	    } //if
	    if (bug5.getXPos () <= 0 || bug5.getXPos () >= 400)
	    {
		bug5.setDirection (180 - bug5.getDirection ());
		// a3 = (int) (Math.random () * 256);
		// b3 = (int) (Math.random () * 256);
		// c3 = (int) (Math.random () * 256);
	    } //if
	    bug1.setColor (new Color (a1, b1, c1));
	    bug1.hide ();
	    bug2.setColor (new Color (a2, b2, c2));
	    bug3.setColor (new Color (a2, b2, c2));
	    bug3.hide ();
	    bug4.setColor (new Color (a3, b3, c3));
	    bug5.setColor (new Color (a3, b3, c3));
	    bug5.hide ();
	    bug6.setColor (new Color (a1, b1, c1));
	    if (a1 > 250)
		test = true;
	    if (a1 < 5)
		test = false;
	    if (test == true)
	    {
		a1 -= (int) (Math.random () * 5);
	    } //if
	    else
	    {
		a1 += (int) (Math.random () * 5);
	    } //else
	    if (b1 > 250)
		test = true;
	    if (b1 < 5)
		test = false;
	    if (test == true)
	    {
		b1 -= (int) (Math.random () * 5);
	    } //if
	    else
	    {
		b1 += (int) (Math.random () * 5);
	    } //else
	    if (c1 > 250)
		test = true;
	    if (c1 < 5)
		test = false;
	    if (test == true)
	    {
		c1 -= (int) (Math.random () * 5);
	    } //if
	    else
	    {
		c1 += (int) (Math.random () * 5);
	    } //else
	    if (a2 > 250)
		test = true;
	    if (a2 < 5)
		test = false;
	    if (test == true)
	    {
		a2 -= (int) (Math.random () * 5);
	    } //if
	    else
	    {
		a2 += (int) (Math.random () * 5);
	    } //else
	    if (b2 > 250)
		test = true;
	    if (b2 < 5)
		test = false;
	    if (test == true)
	    {
		b2 -= (int) (Math.random () * 5);
	    } //if
	    else
	    {
		b2 += (int) (Math.random () * 5);
	    } //else
	    if (c2 > 250)
		test = true;
	    if (c2 < 5)
		test = false;
	    if (test == true)
	    {
		c2 -= (int) (Math.random () * 5);
	    } //if
	    else
	    {
		c2 += (int) (Math.random () * 5);
	    } //else
	    if (a3 > 250)
		test = true;
	    if (a3 < 5)
		test = false;
	    if (test == true)
	    {
		a3 -= (int) (Math.random () * 5);
	    } //if
	    else
	    {
		a3 += (int) (Math.random () * 5);
	    } //else
	    if (b3 > 250)
		test = true;
	    if (b3 < 5)
		test = false;
	    if (test == true)
	    {
		b3 -= (int) (Math.random () * 5);
	    } //if
	    else
	    {
		b3 += (int) (Math.random () * 5);
	    } //else
	    if (c3 > 250)
		test = true;
	    if (c3 < 5)
		test = false;
	    if (test == true)
	    {
		c3 -= (int) (Math.random () * 5);
	    } //if
	    else
	    {
		c3 += (int) (Math.random () * 5);
	    } //else
	    bug1.move (1);
	    bug1.turnRight(.2);
	    bug2.setPosition (bug1.getXPos (), bug1.getYPos ());
	    bug2.turnRight (1);
	    bug3.move (1);
	    bug3.turnRight(.2);
	    bug4.setPosition (bug3.getXPos (), bug3.getYPos ());
	    bug4.turnRight (1);
	    bug5.move (1);
	    bug5.turnRight(.2);
	    bug6.setPosition (bug5.getXPos (), bug5.getYPos ());
	    bug6.turnRight (1);
	} //while
    } // main method
} // BugBounce3 class
