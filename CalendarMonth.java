// The "CalendarMonth" class.
import hsa.*;
public class CalendarMonth
{
    public static void main (String[] args)
    {
	int start, days, date;
	Stdout.print ("Enter start day of month (1=Sun, 7=Sat):  ");
	start = Stdin.readInt ();
	if (start <= 7)
	{
	    Stdout.print ("Enter number of days in month:  ");
	    days = Stdin.readInt ();
	    Stdout.print ("Sun", -5);
	    Stdout.print ("Mon", -5);
	    Stdout.print ("Tues", -5);
	    Stdout.print ("Wed", -5);
	    Stdout.print ("Thur", -5);
	    Stdout.print ("Fri", -5);
	    Stdout.println ("Sat", -5);
	    for (int space = 1 ; space < start ; space++)
	    {
		Stdout.print ("", 5);
	    } //for
	    for (date = 1 ; date <= days ; date++)
	    {
		Stdout.print (date, 5);
		if ((date + start - 1) % 7 == 0)
		{
		    Stdout.println ();
		} //if
	    } //for
	} //if
    } // main method
} // CalendarMonth class
