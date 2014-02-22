// The "Average" class.
import hsa.*;
public class Average
{
    public static void main (String[] args)
    {
	int number, max, min;
	double sum = 0;
	System.out.print ("Enter 10 numbers: ");
	min = Stdin.readInt ();
	max = min;
	sum += min;
	number = Stdin.readInt ();
	max = Math.max (max, number);
	min = Math.min (min, number);
	sum += number;
	number = Stdin.readInt ();
	max = Math.max (max, number);
	min = Math.min (min, number);
	sum += number;
	number = Stdin.readInt ();
	max = Math.max (max, number);
	min = Math.min (min, number);
	sum += number;
	number = Stdin.readInt ();
	max = Math.max (max, number);
	min = Math.min (min, number);
	sum += number;
	number = Stdin.readInt ();
	max = Math.max (max, number);
	min = Math.min (min, number);
	sum += number;
	number = Stdin.readInt ();
	max = Math.max (max, number);
	min = Math.min (min, number);
	sum += number;
	number = Stdin.readInt ();
	max = Math.max (max, number);
	min = Math.min (min, number);
	sum += number;
	number = Stdin.readInt ();
	max = Math.max (max, number);
	min = Math.min (min, number);
	sum += number;
	number = Stdin.readInt ();
	max = Math.max (max, number);
	min = Math.min (min, number);
	sum += number;
	System.out.println ("Max = " + max);
	System.out.println ("Min = " + min);
	System.out.println ("Average = " + sum / 10);
    } // main method
} // Average class
