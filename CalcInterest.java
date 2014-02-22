// The "CalcInterest" class.
public class CalcInterest
{
    public static void main (String[] args)
    {
	double balance = 150, annualInterestInPercent = 4.5;
	System.out.println ("The value after 100 years is $" + balance * Math.pow (1 + annualInterestInPercent / 100, 100));
    } // main method
} // CalcInterest class
