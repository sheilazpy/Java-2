// The "Comparison" class.
import hsa.*;
public class Comparison
{
    public static void main (String[] args)
    {
	int n1, n2;
	System.out.print ("Enter 2 numbers: ");
	n1 = Stdin.readInt ();
	n2 = Stdin.readInt ();
	if (n1 > n2)
	{
	    System.out.println (n1 + " > " + n2);
	} //if
	if (n1 < n2)
	{
	    System.out.println (n1 + " < " + n2);
	} //if
	if (n1 == n2)
	{
	    System.out.println (n1 + " = " + n2);
	} //if
    } // main method
} // Comparison class
