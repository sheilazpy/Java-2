// The "SavingsIn" class.
import hsa.Stdin;
public class SavingsIn
{
    public static void main (String[] args)
    {
	double balance, interest;
	System.out.print ("Balance?  ");
	balance = Stdin.readDouble ();
	System.out.print ("Interest rate?  ");
	interest = Stdin.readDouble () / 100;
	System.out.println (balance);
	balance += balance * interest;
	System.out.println (balance);
	balance += balance * interest;
	System.out.println (balance);
    } // main method
} // SavingsIn class
