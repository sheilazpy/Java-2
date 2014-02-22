// The "Quad" class.
import hsa.*;
public class Quad
{
    public static void main (String[] args)
    {
	double a, b, c, root1, root2;
	int decimal;
	Stdout.println ("Enter values for a, b, and c for:");
	Stdout.println ("    ax^2 + bx + c");
	Stdout.print ("Enter a value for a:  ");
	a = Stdin.readDouble ();
	Stdout.print ("Enter a value for b:  ");
	b = Stdin.readDouble ();
	Stdout.print ("Enter a value for c:  ");
	c = Stdin.readDouble ();
	Stdout.print ("Enter number of decimals:  ");
	decimal = Stdin.readInt ();
	double disc = b * b - 4 * a * c;
	root1 = (-b + Math.sqrt (disc)) / (2 * a);
	root2 = (-b - Math.sqrt (disc)) / (2 * a);
	Stdout.print ("The first root is ");
	Stdout.println (root1, 0, decimal);
	Stdout.print ("The second root is ");
	Stdout.println (root2, 0, decimal);
	Stdout.println ();
	Stdout.println (a + "x^2 + " + b + "x + " + c + " = 0");
	Stdout.print ("  for x = ");
	Stdout.print (root1, 0, decimal);
	Stdout.print (" or x = ");
	Stdout.println (root2, 0, decimal);
    } // main method
} // Quad class
