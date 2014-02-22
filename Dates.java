// The "Dates" class.
import java.text.*;
import java.util.*;
import hsa.*;
public class Dates
{
    public static void main (String[] args)
    {
	Date date = new Date ();
	DateFormat myFormat1 = DateFormat.getDateInstance (DateFormat.SHORT);
	DateFormat myFormat2 = DateFormat.getDateInstance (DateFormat.MEDIUM);
	DateFormat myFormat3 = DateFormat.getDateInstance (DateFormat.LONG);
	DateFormat myFormat4 = DateFormat.getDateInstance (DateFormat.FULL);
	Stdout.println (myFormat1.format (date), -30);
	Stdout.println (myFormat2.format (date), -30);
	Stdout.println (myFormat3.format (date), -30);
	Stdout.println (myFormat4.format (date), -30);
    } // main method
} // Dates class
