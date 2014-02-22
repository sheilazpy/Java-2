// The "AbsoluteValue" class.
import hsa.*;
public class AbsoluteValue
{
    public static void main (String[] args)
    {
	double number, abs;
	System.out.print ("Enter a number: ");
	number = Stdin.readDouble ();
	abs = number;
	if (number < 0)
	{
	    abs = number * -1;
	} //if
	System.out.println ("|" + number + "| = " + abs);
    } // main method
} // AbsoluteValue class
