// The "MaxHeight" class.
import hsa.*;
public class MaxHeight
{
    public static void main (String[] args)
    {
	double speed;
	System.out.print ("Enter initial speed (m/s): ");
	speed = Stdin.readDouble ();
	System.out.println ("The max height is " + Math.pow (speed, 2) / 19.6 + " meters.");
    } // main method
} // MaxHeight class
