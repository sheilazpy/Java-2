// The "NameOrder" class.
import hsa.*;
public class NameOrder
{
    public static void main (String[] args)
    {
	String firstName = "Ricardo", secondName = "Alonzo", thirdName = "Webber", space = " ";
	System.out.println (firstName + space + secondName + space + thirdName);
	System.out.println (firstName + space + thirdName + space + secondName);
	System.out.println (secondName + space + firstName + space + thirdName);
	System.out.println (secondName + space + thirdName + space + firstName);
	System.out.println (thirdName + space + firstName + space + secondName);
	System.out.println (thirdName + space + secondName + space + firstName);
    } // main method
} // NameOrder class
