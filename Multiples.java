// The "Multiples" class.
import hsa.*;
public class Multiples
{
    public static void main (String[] args)
    {
	int n1, n2;
	System.out.print ("Enter two numbers: ");
	n1 = Stdin.readInt ();
	n2 = Stdin.readInt ();
	if (n1 % n2 == 0)
	{
	    System.out.println (n1 + " is a multiple of " + n2);
	} //if
	else
	{
	    System.out.println (n1 + " is not a multiple of " + n2);
	} //else
    } // main method
} // Multiples class
