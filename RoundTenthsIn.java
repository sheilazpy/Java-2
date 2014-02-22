// The "RoundTenthsIn" class.
import hsa.*;
public class RoundTenthsIn
{
    public static void main (String[] args)
    {
	double x, round;
	System.out.print ("Enter a number: ");
	x = Stdin.readDouble ();
	System.out.print ("Enter place to round to: ");
	round = 1 / Stdin.readDouble ();
	System.out.println (Math.round (x * round) / round);
    } // main method
} // RoundTenthsIn class
