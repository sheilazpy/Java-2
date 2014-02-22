// The "Factor2And3" class.
import hsa.*;
public class Factor2And3
{
    public static void main (String[] args)
    {
	int number;
	System.out.print ("Enter a number: ");
	number = Stdin.readInt ();
	if (number % 2 == 0)
	{
	    if (number % 3 == 0)
	    {
		System.out.println (number + " is a multiple of 2 and 3");
	    } //if
	    else
	    {
		System.out.println (number + " is a multiple of 2");
	    } //else
	} //if
	else if (number % 3 == 0)
	{
	    System.out.println (number + " is a multiple of 3");
	} //else if
	else
	{
	    System.out.println (number + " is not a multiple of 2 or 3");
	} //else
    } // main method
} // Factor2And3 class
