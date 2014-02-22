// The "SpeedingFine" class.
import hsa.*;
public class SpeedingFine
{
    public static void main (String[] args)
    {
	double speed, limit;
	System.out.print ("Enter your speed: ");
	speed = Stdin.readDouble ();
	System.out.print ("Enter the speed limit: ");
	limit = Stdin.readDouble ();
	if (speed > limit)
	{
	    System.out.println ("Your fine is $" + 3 * (speed - limit));
	} //if
	else
	{
	    System.out.println ("Good!");
	} //else
    } // main method
} // SpeedingFine class
