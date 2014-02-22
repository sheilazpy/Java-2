// The "Savings" class.
public class Savings
{
    public static void main (String[] args)
    {
	double balance = 100, interestInPercent = 10;
	System.out.println (balance);
	balance += balance * interestInPercent / 100;
	System.out.println (balance);
	balance += balance * interestInPercent / 100;
	System.out.println (balance);
    } // main method
} // Savings class
