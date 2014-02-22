// The "Chase" class.
import hsa.*;
import java.awt.*;
public class Chase
{
    public static void main (String[] args)
    {
	Animator animator = new Animator ();
	Moveable userCircle, compCircle, circle2, circle3, circle4;
	double x, y, angle, speed;
	int count = 0;
	userCircle = new Moveable (100, 100, 0, 0);
	userCircle.setColor (Color.BLUE);
	angle = Math.random () * 360;
	compCircle = new Moveable (300, 200, angle, 1);
	animator.add (userCircle);
	animator.add (compCircle);
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
	    if (Math.sqrt (Math.pow (compCircle.getX () - userCircle.getX (), 2) + Math.pow (compCircle.getY () - userCircle.getY (), 2)) < 40)
	    {
		System.out.println ("Your score is " + count);
		break;
	    } //if
	    count++;
	    if (compCircle.getX () - userCircle.getX () > 0)
	    {
		compCircle.setDirection (Math.toDegrees (Math.atan ((userCircle.getY () - compCircle.getY ()) / (compCircle.getX () - userCircle.getX ()))) - 180);
	    }
	    else
	    {
		compCircle.setDirection (Math.toDegrees (Math.atan ((userCircle.getY () - compCircle.getY ()) / (compCircle.getX () - userCircle.getX ()))));
	    }
	    compCircle.setSpeed (count / (Math.random () * 500 + 500) + 1);
	} //while
    } // main method
} // Chase class
