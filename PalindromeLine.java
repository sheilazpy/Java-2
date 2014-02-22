// The "PalindromeLine" class.
import hsa.*;
public class PalindromeLine
{
    public static void main (String[] args)
    {
	String input, endLine, reverseLine;
	StringBuffer line;
	Stdout.print ("Enter a line of text:  ");
	input = Stdin.readLine ();
	line = new StringBuffer (input.toUpperCase ());
	for (int pos = 0 ; pos < line.length () ; pos++)
	{
	    if ((line.charAt (pos) < 65) || (line.charAt (pos) > 90))
	    {
		line.deleteCharAt (pos);
		pos--;
	    } //if
	} //for
	endLine = line.toString ();
	reverseLine = line.reverse ().toString ();
	if (endLine.equals (reverseLine))
	{
	    Stdout.println ("\"" + input + "\" is a palindrome");
	} //if
	else
	{
	    Stdout.println ("\"" + input + "\" is not a palindrome");
	} //else
    } // main method
} // PalindromeLine class
