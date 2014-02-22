// The "TempConvert" class.
import hsa.*;
public class TempConvert
{
    public static void main (String[] args)
    {
	double temp;
	System.out.print ("Enter a temperature: ");
	temp = Stdin.readDouble ();
	System.out.println (temp + "F = " + (temp - 32) * 5 / 9 + "C");
    } // main method
} // TempConvert class
