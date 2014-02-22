// The "TestConvertFromBase" class.
import hsa.*;
public class TestConvertFromBase
{
    private static int convertFromBase (String numberString, int base)
    {
	int digit, power = 0, convertNum = 0;
	if (base < 2 || base > 16)
	{
	    return -1;
	}
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
	int baseIn;
	Stdout.print ("Enter a number:  ");
	numStr = Stdin.readLine ().toUpperCase ();
	Stdout.print ("Enter the base:  ");
	baseIn = Stdin.readInt ();
	Stdout.println (convertFromBase (numStr, baseIn));
    } // main method
} // TestConvertFromBase class
