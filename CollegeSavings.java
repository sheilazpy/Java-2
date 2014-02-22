// The "CollegeSavings" class.
import hsa.*;
public class CollegeSavings
{
    public static void main (String[] args)
    {
	double balance;
	System.out.print ("Enter the amount deposited: ");
	balance = Stdin.readDouble ();
	if (balance < 2000)
	{
	    balance *= 1.2;
	}
	else
	{
	    balance += 400;
	}
	System.out.println ("The balance is $" + balance);
    } // main method
} // CollegeSavings class
