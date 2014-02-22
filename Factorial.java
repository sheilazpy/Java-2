// The "Factorial" class.
import hsa.*;
public class Factorial
{
    public static void main (String[] args)
    {
	long number, factorial = 1;
	Stdout.print ("Enter an integer:  ");
	number = Stdin.readLong ();
	for (int loop = 1 ; loop <= number ; loop++)
	{
	    factorial *= loop;
	} //for
	Stdout.println (number + "! equals " + factorial);
    } // main method
} // Factorial class
