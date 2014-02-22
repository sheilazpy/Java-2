// The "FirstTwo" class.
import hsa.*;
public class FirstTwo
{
    public static void main (String[] args)
    {
	String input, firstWord = "~", secondWord = "~";
	do
	{
	    Stdout.print ("Enter a word: \"stop\" = quit  ");
	    input = Stdin.readString ();
	    if (input.equalsIgnoreCase ("stop"))
	    {
		break;
	    } //if
	    if (input.compareToIgnoreCase (secondWord) <= 0)
	    {
		secondWord = input;
	    } //if
	    if (input.compareToIgnoreCase (firstWord) <= 0)
	    {
		secondWord = firstWord;
		firstWord = input;
	    } //if
	} //do
	while (!input.equalsIgnoreCase ("stop"));
	if (firstWord.equals ("~"))
	{
	    Stdout.println ("You didn't enter any words.");
	} //if
	else if (secondWord.equals ("~"))
	{
	    Stdout.println ("The first word is " + firstWord);
	} //else if
	else
	{
	    Stdout.println ("The first word is " + firstWord);
	    Stdout.println ("The second word is " + secondWord);
	} //else
    } // main method
} // FirstTwo class
