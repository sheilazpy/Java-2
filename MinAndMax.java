// The "MinAndMax" class.
public class MinAndMax
{
    public static void main (String[] args)
    {
	double a, b, c, d;
	a = Math.random () * 100;
	b = Math.random () * 100;
	c = Math.random () * 100;
	d = Math.random () * 100;
	System.out.println ("Max = " + Math.max (Math.max (a, b), Math.max (c, d)));
	System.out.println ("Min = " + Math.min (Math.min (a, b), Math.min (c, d)));
    } // main method
} // MinAndMax class
