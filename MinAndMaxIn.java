// The "MinAndMaxIn" class.
import hsa.*;
public class MinAndMaxIn
{
    public static void main (String[] args)
    {
	double a, b, c, d;
	System.out.print ("Enter 4 numbers: ");
	a = Stdin.readDouble ();
	b = Stdin.readDouble ();
	c = Stdin.readDouble ();
	d = Stdin.readDouble ();
	System.out.println ("Max = " + Math.max (Math.max (a, b), Math.max (c, d)));
	System.out.println ("Min = " + Math.min (Math.min (a, b), Math.min (c, d)));
    } // main method
} // MinAndMaxIn class
