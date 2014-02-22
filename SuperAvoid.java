// The "SuperAvoid" class.
import hsa.*;
import java.awt.*;
public class SuperAvoid
{
    public static void main (String[] args)
    {
	Animator animator = new Animator (449, 443);
	Moveable back, user, comp1, comp2, comp3, comp4;
	double x, y, angle, speed;
	int count = 0;
	back = new MoveableImage (animator.loadImage ("back.jpg"), 0, 0, 0, 0);
	user = new MoveableImage (animator.loadImage ("car.gif"), 100, 100, 0, 0);
	angle = Math.random () * 360;
	comp1 = new MoveableImage (animator.loadImage ("cop.gif"), 300, 200, angle, 1);
	angle = Math.random () * 360;
	comp2 = new MoveableImage (animator.loadImage ("cop.gif"), 300, 200, angle, 1);
	angle = Math.random () * 360;
	comp3 = new MoveableImage (animator.loadImage ("cop.gif"), 300, 200, angle, 1);
	angle = Math.random () * 360;
	comp4 = new MoveableImage (animator.loadImage ("cop.gif"), 300, 200, angle, 1);
	animator.add (back);
	animator.add (user);
	animator.add (comp1);
	animator.add (comp2);
	animator.add (comp3);
	animator.add (comp4);
	while (true)
	{
	    animator.drawFrame ();
	    animator.delay (15);
	    if (animator.isKeyPressed (37))
	    {
		user.setLocation (user.getX () - 5, user.getY ());
	    } //if
	    if (animator.isKeyPressed (38))
	    {
		user.setLocation (user.getX (), user.getY () - 5);
	    } //if
	    if (animator.isKeyPressed (39))
	    {
		user.setLocation (user.getX () + 5, user.getY ());
	    } //if
	    if (animator.isKeyPressed (40))
	    {
		user.setLocation (user.getX (), user.getY () + 5);
	    } //if
	    if (Math.sqrt (Math.pow (comp1.getX () - user.getX (), 2) + Math.pow (comp1.getY () - user.getY (), 2)) < 75)
	    {
		System.out.println ("Your score is " + count);
		break;
	    } //if
	    if (Math.sqrt (Math.pow (comp2.getX () - user.getX (), 2) + Math.pow (comp2.getY () - user.getY (), 2)) < 75)
	    {
		System.out.println ("Your score is " + count);
		break;
	    } //if
	    if (Math.sqrt (Math.pow (comp3.getX () - user.getX (), 2) + Math.pow (comp3.getY () - user.getY (), 2)) < 75)
	    {
		System.out.println ("Your score is " + count);
		break;
	    } //if
	    if (Math.sqrt (Math.pow (comp4.getX () - user.getX (), 2) + Math.pow (comp4.getY () - user.getY (), 2)) < 75)
	    {
		System.out.println ("Your score is " + count);
		break;
	    } //if
	    count++;
	    comp1.setSpeed (count / (Math.random () * 500 + 500) + 1);
	    comp2.setSpeed (count / (Math.random () * 500 + 500) + 1);
	    comp3.setSpeed (count / (Math.random () * 500 + 500) + 1);
	    comp4.setSpeed (count / (Math.random () * 500 + 500) + 1);
	} //while
    } // main method
} // SuperAvoid class
