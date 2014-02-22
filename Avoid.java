// The "Avoid" class.
import hsa.*;
import java.awt.*;
public class Avoid
{
    public static void main (String[] args)
    {
	Animator animator = new Animator ();
	Moveable userCircle, circle1, circle2, circle3, circle4;
	double x, y, angle, speed;
	int count = 0;
	userCircle = new Moveable (100, 100, 0, 0);
	userCircle.setColor (Color.BLUE);
	angle = Math.random () * 360;
	circle1 = new Moveable (300, 200, angle, 1);
	angle = Math.random () * 360;
	circle2 = new Moveable (300, 200, angle, 1);
	angle = Math.random () * 360;
	circle3 = new Moveable (300, 200, angle, 1);
	angle = Math.random () * 360;
	circle4 = new Moveable (300, 200, angle, 1);
	animator.add (userCircle);
	animator.add (circle1);
	animator.add (circle2);
	animator.add (circle3);
	animator.add (circle4);
	while (true)
	{
	    animator.drawFrame ();
	    animator.delay (15);
	    if (animator.isKeyPressed (37))
	    {
		userCircle.setLocation (userCircle.getX () - 5, userCircle.getY ());
	    } //if
	    if (animator.isKeyPressed (38))
	    {
		userCircle.setLocation (userCircle.getX (), userCircle.getY () - 5);
	    } //if
	    if (animator.isKeyPressed (39))
	    {
		userCircle.setLocation (userCircle.getX () + 5, userCircle.getY ());
	    } //if
	    if (animator.isKeyPressed (40))
	    {
		userCircle.setLocation (userCircle.getX (), userCircle.getY () + 5);
	    } //if
	    if (Math.sqrt (Math.pow (circle1.getX () - userCircle.getX (), 2) + Math.pow (circle1.getY () - userCircle.getY (), 2)) < 40)
	    {
		System.out.println ("Your score is " + count);
		break;
	    } //if
	    if (Math.sqrt (Math.pow (circle2.getX () - userCircle.getX (), 2) + Math.pow (circle2.getY () - userCircle.getY (), 2)) < 40)
	    {
		System.out.println ("Your score is " + count);
		break;
	    } //if
	    if (Math.sqrt (Math.pow (circle3.getX () - userCircle.getX (), 2) + Math.pow (circle3.getY () - userCircle.getY (), 2)) < 40)
	    {
		System.out.println ("Your score is " + count);
		break;
	    } //if
	    if (Math.sqrt (Math.pow (circle4.getX () - userCircle.getX (), 2) + Math.pow (circle4.getY () - userCircle.getY (), 2)) < 40)
	    {
		System.out.println ("Your score is " + count);
		break;
	    } //if
	    count++;
	    circle1.setSpeed (count / (Math.random () * 500 + 500) + 1);
	    circle2.setSpeed (count / (Math.random () * 500 + 500) + 1);
	    circle3.setSpeed (count / (Math.random () * 500 + 500) + 1);
	    circle4.setSpeed (count / (Math.random () * 500 + 500) + 1);
	} //while
    } // main method
} // Avoid class
