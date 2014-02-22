// The "DeVowel" class.
import hsa.*;
public class DeVowel
{
    public static void main (String[] args)
    {
	String input;
	StringBuffer noVowels;
	int position;
	Stdout.print ("Enter a line of text:  ");
	input = Stdin.readLine ();
	noVowels = new StringBuffer (input);
	position = noVowels.indexOf ("A");
	while (position != -1)
	{
	    noVowels.deleteCharAt (position);
	    position = noVowels.indexOf ("A", position);
	} //while
	position = noVowels.indexOf ("a");
	while (position != -1)
	{
	    noVowels.deleteCharAt (position);
	    position = noVowels.indexOf ("a", position);
	} //while
	position = noVowels.indexOf ("E");
	while (position != -1)
	{
	    noVowels.deleteCharAt (position);
	    position = noVowels.indexOf ("E", position);
	} //while
	position = noVowels.indexOf ("e");
	while (position != -1)
	{
	    noVowels.deleteCharAt (position);
	    position = noVowels.indexOf ("e", position);
	} //while
	position = noVowels.indexOf ("I");
	while (position != -1)
	{
	    noVowels.deleteCharAt (position);
	    position = noVowels.indexOf ("I", position);
	} //while
	position = noVowels.indexOf ("i");
	while (position != -1)
	{
	    noVowels.deleteCharAt (position);
	    position = noVowels.indexOf ("i", position);
	} //while
	position = noVowels.indexOf ("O");
	while (position != -1)
	{
	    noVowels.deleteCharAt (position);
	    position = noVowels.indexOf ("O", position);
	} //while
	position = noVowels.indexOf ("o");
	while (position != -1)
	{
	    noVowels.deleteCharAt (position);
	    position = noVowels.indexOf ("o", position);
	} //while
	position = noVowels.indexOf ("U");
	while (position != -1)
	{
	    noVowels.deleteCharAt (position);
	    position = noVowels.indexOf ("U", position);
	} //while
	position = noVowels.indexOf ("u");
	while (position != -1)
	{
	    noVowels.deleteCharAt (position);
	    position = noVowels.indexOf ("u", position);
	} //while
	Stdout.println ("The line without vowels is: " + noVowels);
    } // main method
} // DeVowel class
