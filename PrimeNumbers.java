// The "PrimeNumbers" class.
public class PrimeNumbers
{
    public static void main (String[] args)
    {
	int number = 3, factor;
	boolean prime;
	System.out.println ("Prime Numbers");
	System.out.println (2);
	while (number<1000)
	{
	    prime = true;
	    for (factor = 3 ; factor <= Math.sqrt(number) ; factor+=2)
	    {
		if (number % factor == 0)
		{
		    prime = false;
		    break;
		} //if
	    } //for
	    if (prime == true)
	    {
		System.out.println (number);
	    } //if
	    number += 2;
	} //while
    } // main method
} // PrimeNumbers class
