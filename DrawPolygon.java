// The "DrawPolygon" class.
import hsa.*;
public class DrawPolygon
{
    public static void main (String[] args)
    {
	int sides, length, rotations;
	double angle;
	System.out.print ("Enter number of sides:  ");
	sides = Stdin.readInt ();
	System.out.print ("Enter side length:  ");
	length = Stdin.readInt ();
	System.out.print ("Enter number of full rotations:  ");
	rotations = Stdin.readInt ();
	angle = 360 * rotations / sides;
	PaintBug bug = new PaintBug ();
	for (int side = 1 ; side <= sides ; side++)
	{
	    bug.move (length);
	    bug.turnRight (angle);
	} //for
	bug.hide ();
    } // main method
} // DrawPolygon class
