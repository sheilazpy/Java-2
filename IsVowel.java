// The "IsVowel" class.
import hsa.*;
public class IsVowel
{
    public static void main (String[] args)
    {
	char letter;
	Stdout.print ("Enter a letter:  ");
	letter = Stdin.readChar ();
	switch (letter)
	{
	    case 'a':
	    case 'e':
	    case 'i':
	    case 'o':
	    case 'u':
	    case 'A':
	    case 'E':
	    case 'I':
	    case 'O':
	    case 'U':
		Stdout.println (letter + " is a vowel.");
		break;
	    case 'y':
	    case 'Y':
		Stdout.println (letter + " is sometimes a vowel.");
		break;
	    default:
		Stdout.println (letter + " is a consonant.");
		break;
	} //switch
    } // main method
} // IsVowel class
