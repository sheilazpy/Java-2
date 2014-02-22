// The "NumberForm" class.
import java.text.*;
import hsa.*;
public class NumberForm
{
    public static void main (String[] args)
    {
	double n1, n2, n3;
	DecimalFormat myFormat = new DecimalFormat ("#,###.000");
	Stdout.print ("Enter 3 numbers: ");
	n1 = Stdin.readDouble ();
	n2 = Stdin.readDouble ();
	n3 = Stdin.readDouble ();
	Stdout.println (myFormat.format (n1));
	Stdout.println (myFormat.format (n2));
	Stdout.println (myFormat.format (n3));
    } // main method
} // NumberForm class
