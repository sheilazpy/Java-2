// The "Encoder" class.
import hsa.*;
public class Encoder
{
    public static void main (String[] args)
    {
	String input;
	StringBuffer codeLine;
	Stdout.print ("Enter a line of text:  ");
	input = Stdin.readLine ();
	codeLine = new StringBuffer (input);
	for (int pos = 0 ; pos < codeLine.length () ; pos++)
	{
	    if ((codeLine.charAt (pos) >= 65 && codeLine.charAt (pos) < 90) ||
		    (codeLine.charAt (pos) >= 97 && codeLine.charAt (pos) < 122))
	    {
		codeLine.setCharAt (pos, (char) (codeLine.charAt (pos) + 1));
	    } //if
	    else if (codeLine.charAt (pos) == 90 || codeLine.charAt (pos) == 122)
	    {
		codeLine.setCharAt (pos, (char) (codeLine.charAt (pos) - 25));
	    } //if
	} //for
	Stdout.println ("The coded line is: " + codeLine);
    } // main method
} // Encoder class
