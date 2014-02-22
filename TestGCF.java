// The "TestGCF" class.
import hsa.*;
public class TestGCF
{
    private static int gcf (int number1, int number2)
    {
	for (int factor = number1 ; factor > 0 ; factor--)
	{
	    if (number1 % factor == 0 && number2 % factor == 0)
	    {
		return factor;
	    } //if
	} //for
	return 1;
    } //lcm method


    public static void main (String[] args)
    {
	int num1, num2, GCF;
	Stdout.print ("Enter 2 numbers:  ");
	num1 = Stdin.readInt ();
	num2 = Stdin.readInt ();
	GCF = gcf (num1, num2);
	Stdout.println ("The greatest common factor is " + GCF);
    } // main method
} // TestGCF class
