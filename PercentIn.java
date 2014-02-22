// The "PercentIn" class.
import hsa.*;
public class PercentIn
{
    public static void main (String[] args)
    {
	double x, y;
	System.out.print ("Enter two numbers: ");
	x = Stdin.readDouble ();
	y = Stdin.readDouble ();
	System.out.println (x + " is " + x / y * 100 + "% of " + y);
    } // main method
} // PercentIn class
