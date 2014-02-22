// The "SquaresIn" class.
import hsa.*;
public class SquaresIn
{
    public static void main (String[] args)
    {
	int n1, n2, n3;
	System.out.println ("Enter three numbers:");
	n1 = Stdin.readInt ();
	n2 = Stdin.readInt ();
	n3 = Stdin.readInt ();
	System.out.println (n1 + " " + (int) Math.pow (n1, 2));
	System.out.println (n2 + " " + (int) Math.pow (n2, 2));
	System.out.println (n3 + " " + (int) Math.pow (n3, 2));
    } // main method
} // SquaresIn class
