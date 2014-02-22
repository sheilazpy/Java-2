// The "EvenOdd" class.
import hsa.*;
public class EvenOdd
{
    public static void main (String[] args)
    {
	int number;
	System.out.print ("Enter a number: ");
	number = Stdin.readInt ();
	if (number % 2 == 0)
	{
	    System.out.println (number + " is even");
	} //if
	else
	{
	    System.out.println (number + " is odd");
	} //else
    } // main method
} // EvenOdd class
