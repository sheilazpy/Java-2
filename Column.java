// The "Column" class.
import hsa.*;
public class Column
{
    public static void main (String[] args)
    {
	int n1, n2, n3, n4, n5;
	Stdout.print ("Enter 5 numbers: ");
	n1 = Stdin.readInt ();
	n2 = Stdin.readInt ();
	n3 = Stdin.readInt ();
	n4 = Stdin.readInt ();
	n5 = Stdin.readInt ();
	Stdout.println (n1, 5);
	Stdout.println (n2, 5);
	Stdout.println (n3, 5);
	Stdout.println (n4, 5);
	Stdout.println (n5, 5);
    } // main method
} // Column class
