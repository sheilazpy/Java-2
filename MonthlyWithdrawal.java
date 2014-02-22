// The "MonthlyWithdrawal" class.
import hsa.*;
public class MonthlyWithdrawal
{
    public static void main (String[] args)
    {
	double balance, interest, withdrawal;
	Stdout.print ("Balance?  ");
	balance = Stdin.readDouble ();
	Stdout.print ("Interest rate?  ");
	interest = Stdin.readDouble () / 100;
	Stdout.print ("Monthly withdrawal?  ");
	withdrawal = Stdin.readDouble ();
	Stdout.println ("Month  Balance");
	Stdout.print (0, 3);
	Stdout.println (balance, 11, 2);
	balance -= withdrawal;
	balance += balance * interest;
	Stdout.print (1, 3);
	Stdout.println (balance, 11, 2);
	balance -= withdrawal;
	balance += balance * interest;
	Stdout.print (2, 3);
	Stdout.println (balance, 11, 2);
	balance -= withdrawal;
	balance += balance * interest;
	Stdout.print (3, 3);
	Stdout.println (balance, 11, 2);
    } // main method
} // MonthlyWithdrawal class
