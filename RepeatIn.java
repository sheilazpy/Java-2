// The "RepeatIn" class.
import hsa.Stdin;
public class RepeatIn
{
    public static void main (String[] args)
    {
	String word1, word2, word3;
	System.out.print ("Enter three words.  ");
	word1 = Stdin.readString ();
	word2 = Stdin.readString ();
	word3 = Stdin.readString ();
	System.out.println (word3 + " " + word2 + " " + word1);
    } // main method
} // RepeatIn class
