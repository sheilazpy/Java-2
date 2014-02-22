// The "Echo" class.
import hsa.*;
public class Echo
{
    public static void main (String[] args)
    {
	String input;
	System.out.print ("Enter a line of text: ");
	input = Stdin.readLine ();
	System.out.println ("The echo replies \"" + input + "\"");
    } // main method
} // Echo class
