// The "CalcButtonPrice" class.
import hsa.*;
public class CalcButtonPrice
{
    public static void main (String[] args)
    {
	int buttons;
	System.out.print ("Enter number of buttons purchased: ");
	buttons = Stdin.readInt ();
	if (buttons > 10)
	{
	    if (buttons > 50)
	    {
		System.out.println ("The cost is $" + buttons * .2);
	    } //if
	    else
	    {
		System.out.println ("The cost is $" + buttons * .3);
	    } //else
	} //if
	else
	{
	    System.out.println ("The cost is $" + buttons * .5);
	} //else
    } // main method
} // CalcButtonPrice class
