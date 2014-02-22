// The "RadiusIn" class.
import hsa.*;
public class RadiusIn
{
    public static void main (String[] args)
    {
	double area;
	System.out.print ("Enter the area of a circle: ");
	area = Stdin.readDouble();
	System.out.println ("radius = " + Math.sqrt (area / Math.PI));
    } // main method
} // RadiusIn class
