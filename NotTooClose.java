// The "NotTooClose" class.
import hsa.*;
import java.awt.*;
public class NotTooClose
{
    public static void main (String[] args)
    {
	Animator animator = new Animator ();
	Moveable circle1, circle2;
	double x, y, angle, speed;
	boolean jump = true;
	x = Math.random () * 300;
	y = Math.random () * 200;
	angle = Math.random () * 360;
	speed = Math.random () * 5;
	circle1 = new Moveable (x, y, angle, speed);
	x = Math.random () * 300;
	y = Math.random () * 200;
	angle = Math.random () * 360;
	speed = Math.random () * 5;
	circle2 = new Moveable (x, y, angle, speed);
	circle2.setColor (Color.BLUE);
	animator.add (circle1);
	animator.add (circle2);
	while (true)
	{
	    if (Math.sqrt (Math.pow (circle2.getX () - circle1.getX (), 2) + Math.pow (circle2.getY () - circle1.getY (), 2)) <= 50)
	    {
		x = Math.random () * 300;
		y = Math.random () * 200;
		if (jump)
		{
		    circle1.setLocation (x, y);
		    jump = false;
		} //if
		else
		{
		    circle2.setLocation (x, y);
		    jump = true;
		} //else
	    } //if
	    animator.drawFrame ();
	    animator.delay (15);
	} //while
    } // main method
} // NotTooClose class
