// The "RoundTenths" class.
public class RoundTenths
{
    public static void main (String[] args)
    {
	double x, round, xRound;
	x = 3.1415;
	round = 10.0;
	xRound = Math.round (x * round) / round;
	System.out.println (xRound);
    } // main method
} // RoundTenths class
