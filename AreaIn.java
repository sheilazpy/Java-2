// The "AreaIn" class.
import hsa.*;
public class AreaIn
{
    public static void main (String[] args)
    {
	double radius;
	System.out.print ("Enter the radius of a circle: ");
	radius = Stdin.readDouble ();
	System.out.println ("area = " + Math.PI * Math.pow (radius, 2));
    } // main method
} // AreaIn class
