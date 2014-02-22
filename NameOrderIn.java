// The "NameOrderIn" class.
import hsa.*;
public class NameOrderIn
{
    public static void main (String[] args)
    {
	String firstName, secondName, thirdName, space = " ";
	System.out.print ("Enter your full name: ");
	firstName = Stdin.readString ();
	secondName = Stdin.readString ();
	thirdName = Stdin.readString ();
	System.out.println (firstName + space + secondName + space + thirdName);
	System.out.println (firstName + space + thirdName + space + secondName);
	System.out.println (secondName + space + firstName + space + thirdName);
	System.out.println (secondName + space + thirdName + space + firstName);
	System.out.println (thirdName + space + firstName + space + secondName);
	System.out.println (thirdName + space + secondName + space + firstName);
    } // main method
} // NameOrderIn class
