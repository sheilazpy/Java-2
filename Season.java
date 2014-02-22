// The "Season" class.
import hsa.*;
public class Season
{
    public static void main (String[] args)
    {
	int month;
	System.out.print ("Enter a number coresponding to the month ( 1 = Jan, etc ): ");
	month = Stdin.readInt ();
	switch (month)
	{
	    case 12:
	    case 1:
	    case 2:
		System.out.println ("The season is winter.");
		break;
	    case 3:
	    case 4:
	    case 5:
		System.out.println ("The season is spring.");
		break;
	    case 6:
	    case 7:
	    case 8:
		System.out.println ("The season is summer.");
		break;
	    default:
		System.out.println ("The season is fall.");
		break;
	} //switch
    } // main method
} // Season class
