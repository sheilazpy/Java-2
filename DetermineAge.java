// The "DetermineAge" class.
import hsa.*;
public class DetermineAge
{
    public static void main (String[] args)
    {
	int birthYear, currentYear, age;
	Stdout.print ("Enter last 2 digits of year you were born:  ");
	birthYear = Stdin.readInt ();
	Stdout.print ("Enter last 2 digits of current year:  ");
	currentYear = Stdin.readInt ();
	if (currentYear > birthYear)
	{
	    age = currentYear - birthYear;
	} //if
	else
	{
	    age = currentYear + 100 - birthYear;
	} //else
	Stdout.println ("Your age is " + age);
    } // main method
} // DetermineAge class
