// The "DetermineSign" class.
import hsa.*;
public class DetermineSign
{
    public static void main (String[] args)
    {
	double number;
	System.out.print ("Enter a number: ");
	number = Stdin.readDouble ();
	switch ((int) (number / Math.abs (number)))
	{
	    case - 1:
		System.out.println (number + " is negative");
		break;
	    default:
		System.out.println (number + " is positive");
		break;
	} //switch
    } // main method
} // DetermineSign class
