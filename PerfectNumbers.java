// The "PerfectNumbers" class.
public class PerfectNumbers
{
    public static void main (String[] args)
    {
	int number, factor, factorSum;
	System.out.println ("Perfect Numbers");
	for (number = 1 ; number < 10000 ; number++)
	{
	    factorSum = 0;
	    for (factor = 1 ; factor <= Math.sqrt (number) ; factor++)
	    {
		if (number % factor == 0)
		{
		    factorSum += factor;
		    factorSum += number / factor;
		} //if
	    } //for
	    if (number == factorSum / 2)
	    {
		System.out.println (number);
	    } //if
	} //for
    } // main method
} // PerfectNumbers class


