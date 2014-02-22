// The "TicketPrice" class.
import hsa.*;
public class TicketPrice
{
    public static void main (String[] args)
    {
	int age;
	double ticketPrice;
	Stdout.print ("Enter your age:  ");
	age = Stdin.readInt ();
	ticketPrice = 5.00;
	if (age < 15)
	{
	    ticketPrice = 3.50;
	} //if
	if (age >= 65)
	{
	    ticketPrice = 4.00;
	} //if
	Stdout.print ("Your ticket price is $");
	Stdout.println (ticketPrice, 0, 2);
    } // main method
} // TicketPrice class
