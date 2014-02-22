// The "CalcInterestIn" class.
import hsa.*;
public class CalcInterestIn
{
    public static void main (String[] args)
    {
	double balance, annualInterestInPercent;
	System.out.print ("Enter the balance: ");
	balance = Stdin.readDouble ();
	System.out.print ("Enter the annual interest rate: ");
	annualInterestInPercent = Stdin.readDouble ();
	System.out.println ("The value after 100 years is $" + balance * Math.pow (1 + annualInterestInPercent / 100, 100));
    } // main method
} // CalcInterestIn class
