// The "RollDice" class.
public class RollDice
{
    public static void main (String[] args)
    {
	int roll1, roll2, sum;
	roll1 = (int) (Math.random () * 6) + 1;
	roll2 = (int) (Math.random () * 6) + 1;
	sum = roll1 + roll2;
	System.out.println (roll1 + "+" + roll2 + "=" + sum);
    } // main method
} // RollDice class
