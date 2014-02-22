// The "CerealCompare" class.
import hsa.*;
public class CerealCompare
{
    public static void main (String[] args)
    {
	double price1, size1, price2, size2;
	System.out.print ("Enter the price of the first cereal: ");
	price1 = Stdin.readDouble ();
	System.out.print ("Enter the number of ounces of the first cereal: ");
	size1 = Stdin.readDouble ();
	System.out.print ("Enter the price of the second cereal: ");
	price2 = Stdin.readDouble ();
	System.out.print ("Enter the number of ounces of the second cereal: ");
	size2 = Stdin.readDouble ();
	if (price1 / size1 < price2 / size2)
	{
	    System.out.println ("The first cereal is cheaper per ounce.");
	} //if
	else if (price1 / size1 > price2 / size2)
	{
	    System.out.println ("The second cereal is cheaper per ounce.");
	} //else if
	else
	{
	    System.out.println ("The cereals are the same price per ounce.");
	} //else
    } // main method
} // CerealCompare class
