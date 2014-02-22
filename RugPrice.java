// The "RugPrice" class.
import hsa.*;
public class RugPrice
{
    public static void main (String[] args)
    {
	double height, width, price;
	System.out.print ("Enter the rug's height (ft): ");
	height = Stdin.readDouble ();
	System.out.print ("Enter the rug's width (ft): ");
	width = Stdin.readDouble ();
	System.out.print ("Enter the rug's price: ");
	price = Stdin.readDouble ();
	System.out.println ("Price per square foot = $" + price / (height * width));
    } // main method
} // RugPrice class
