// The "TaxAmount" class.
import hsa.*;
import java.text.*;
public class TaxAmount
{
    public static void main (String[] args)
    {
	double salary, tax = 0;
	Stdout.print ("Enter your annual salary:  ");
	salary = Stdin.readDouble ();
	if (salary > 10000)
	{
	    if (salary > 25000)
	    {
		if (salary > 50000)
		{
		    if (salary > 100000)
		    {
			tax += (salary - 100000) * .35;
			salary = 100000;
		    }
		    tax += (salary - 50000) * .3;
		    salary = 50000;
		}
		tax += (salary - 25000) * .25;
		salary = 25000;
	    }
	    tax += (salary - 10000) * .2;
	}
	else
	{
	    tax = 0;
	}
	NumberFormat myFormat = NumberFormat.getCurrencyInstance ();
	Stdout.print ("Your taxes are ");
	Stdout.println (myFormat.format (tax));
    } // main method
} // TaxAmount class


