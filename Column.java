// The "Column1" class.
import hsa.*;
public class Column1
{
    public static void main (String[] args)
    {
	int n1, n2, n3, n4, n5, width;
	Stdout.print ("Enter the column width: ");
	width = Stdin.readInt ();
	Stdout.print ("Enter 5 numbers: ");
	n1 = Stdin.readInt ();
	n2 = Stdin.readInt ();
	n3 = Stdin.readInt ();
	n4 = Stdin.readInt ();
	n5 = Stdin.readInt ();
	Stdout.println (n1, width);
	Stdout.println (n2, width);
	Stdout.println (n3, width);
	Stdout.println (n4, width);
	Stdout.println (n5, width);
    } // main method
} // Column1 class
