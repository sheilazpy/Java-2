// The "TestBaseConversion" class.
import hsa.*;
public class TestBaseConversion
{
    private static String convertToBase (int value, int base)
    {
	int digit, power = 1;
	StringBuffer number = new StringBuffer ();
	if (base < 2 || base > 16)
	{
	    return "";
	} //if
	while (Math.pow (base, power) <= value)
	{
	    power++;
	} //while
	power--;
	do
	{
	    digit = (int) (value / Math.pow (base, power));
	    value -= digit * Math.pow (base, power);
	    power--;
	    if (digit < 10)
	    {
		number.append (digit);
	    }
	    else
	    {
		switch (digit)
		{
		    case 10:
			number.append ("a")
			    ;
			break;
		    case 11:
			number.append ("b");
			break;
		    case 12:
			number.append ("c");
			break;
		    case 13:
			number.append ("d");
			break;
		    case 14:
			number.append ("e");
			break;
		    case 15:
			number.append ("f");
			break;
		    default:
			return "";
		} //switch
	    } //else
	} //do
	while (value != 0);
	return number.toString ();
    } //convertToBase method


    private static int convertFromBase (String numberString, int base)
    {
	int digit, power = 0, convertNum = 0;
	if (base < 2 || base > 16)
	{
	    return -1;
	} //if
	for (int pos = numberString.length () - 1 ; pos >= 0 ; pos--)
	{
	    switch (numberString.charAt (pos))
	    {
		case '0':
		    digit = 0;
		    break;
		case '1':
		    digit = 1;
		    break;
		case '2':
		    digit = 2;
		    break;
		case '3':
		    digit = 3;
		    break;
		case '4':
		    digit = 4;
		    break;
		case '5':
		    digit = 5;
		    break;
		case '6':
		    digit = 6;
		    break;
		case '7':
		    digit = 7;
		    break;
		case '8':
		    digit = 8;
		    break;
		case '9':
		    digit = 9;
		    break;
		case 'A':
		    digit = 10;
		    break;
		case 'B':
		    digit = 11;
		    break;
		case 'C':
		    digit = 12;
		    break;
		case 'D':
		    digit = 13;
		    break;
		case 'E':
		    digit = 14;
		    break;
		case 'F':
		    digit = 15;
		    break;
		default:
		    return -1;
	    } //switch
	    if (digit >= base)
	    {
		return -1;
	    }
	    convertNum += digit * Math.pow (base, power);
	    power++;
	} //for
	return convertNum;
    } //convertFromBase method


    public static void main (String[] args)
    {
	String numStr;
	int number, baseFrom, baseTo;
	Stdout.println ("1 = Convert from a base to base 10");
	Stdout.println ("2 = Convert from base 10 to a base");
	Stdout.println ("3 = Convert from a base to a base");
	Stdout.print ("Choose an option:  ");
	int mode = Stdin.readInt ();
	switch (mode)
	{
	    case 1:
		Stdout.print ("Enter a number:  ");
		numStr = Stdin.readLine ().toUpperCase ();
		Stdout.print ("Enter base to convert from:  ");
		baseFrom = Stdin.readInt ();
		Stdout.println (convertFromBase (numStr, baseFrom));
		break;
	    case 2:
		Stdout.print ("Enter a number:  ");
		number = Stdin.readInt ();
		Stdout.print ("Enter base to convert to:  ");
		baseTo = Stdin.readInt ();
		Stdout.println (convertToBase (number, baseTo));
		break;
	    case 3:
		Stdout.print ("Enter a number:  ");
		numStr = Stdin.readLine ().toUpperCase ();
		Stdout.print ("Enter base to convert from:  ");
		baseFrom = Stdin.readInt ();
		Stdout.print ("Enter base to convert to:  ");
		baseTo = Stdin.readInt ();
		number = convertFromBase (numStr, baseFrom);
		Stdout.println (convertToBase (number, baseTo));
		break;
	    default:
		break;
	} //switch
    } // main method
} // TestBaseConversion class


