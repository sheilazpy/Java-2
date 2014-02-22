// The "MoveCircle" class.
import hsa.*;
import java.awt.event.KeyEvent;
public class MoveCircle
{
    public static void main (String[] args)
    {
	Animator animator = new Animator ();
	Moveable circle;
	double x, y;
	x = Math.random () * 300;
	y = Math.random () * 200;
	circle = new Moveable (x, y, 0, 0);
	animator.add (circle);
	while (true)
	{
	    animator.drawFrame ();
	    animator.delay(15);
	    if (animator.isKeyPressed (37))
	    {
		circle.setLocation (circle.getX () - 1, circle.getY ());
	    } //if
	    if (animator.isKeyPressed (38))
	    {
		circle.setLocation (circle.getX (), circle.getY () - 1);
	    } //if
	    if (animator.isKeyPressed (39))
	    {
		circle.setLocation (circle.getX () + 1, circle.getY ());
	    } //if
	    if (animator.isKeyPressed (40))
	    {
		circle.setLocation (circle.getX (), circle.getY () + 1);
	    } //if
	} //while
    } // main method
} // MoveCircle class
