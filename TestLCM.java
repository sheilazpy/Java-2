// The "TestLCM" class.
import hsa.*;
public class TestLCM
{
    private static int lcm (int number1, int number2)
    {
	for (int factor = 2 ; factor <= number1 ; factor++)
	{
	    if (number1 % factor == 0 && number2 % factor == 0)
	    {
		number2 /= factor;
	    } //if
	} //for
	return number1 * number2;
    } //lcm method


    public static void main (String[] args)
    {
	int num1, num2, LCM;
	Stdout.print ("Enter 2 numbers:  ");
	num1 = Stdin.readInt ();
	num2 = Stdin.readInt ();
	LCM = lcm (num1, num2);
	Stdout.println ("The least common multiple is " + LCM);
    } // main method
} // TestLCM class
