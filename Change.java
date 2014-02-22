// The "Change" class.
import hsa.Stdin;
public class Change
{
    public static void main (String[] args)
    {
	double value;
	int twenties, tens, fives, ones, quarters, dimes, nickels, pennies;
	System.out.print ("Enter an amount to make change for:  ");
	value = Stdin.readDouble ();
	twenties = (int) value / 20;
	value -= twenties * 20;
	System.out.println ("Twenties: " + twenties);
	tens = (int) value / 10;
	value -= tens * 10;
	System.out.println ("Tens: " + tens);
	fives = (int) value / 5;
	value -= fives * 5;
	System.out.println ("Fives: " + fives);
	ones = (int) value;
	value -= ones;
	System.out.println ("Ones: " + ones);
	quarters = (int) (value * 4);
	value -= quarters / 4.0;
	System.out.println ("Quarters: " + quarters);
	dimes = (int) (value * 10);
	value -= dimes / 10.0;
	System.out.println ("Dimes: " + dimes);
	nickels = (int) (value * 20);
	value -= nickels / 20.0;
	System.out.println ("Nickels: " + nickels);
	pennies = (int) Math.round (value * 100);
	System.out.println ("Pennies: " + pennies);
    } // main method
} // Change class
