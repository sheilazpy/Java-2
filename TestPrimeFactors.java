// The "TestPrimeFactors" class.
import hsa.*;
public class TestPrimeFactors
{
    private static void primeFactors (int number)
    {
	int factor = 2;
	do
	{
	    if (number % factor == 0)
	    {
		Stdout.print (factor + "  ");
		number /= factor;
	    } //if
	    else
	    {
		factor++;
	    } //else
	} //do
	while (number != 1);
    } //primeFactors method


    public static void main (String[] args)
    {
	int number;
	Stdout.print ("Enter a number:  ");
	number = Stdin.readInt ();
	primeFactors (number);
	Stdout.println ();
    } // main method
} // TestPrimeFactors class


