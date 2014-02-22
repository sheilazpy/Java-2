// The "RockPaperScissors" class.
import hsa.*;
public class RockPaperScissors
{
    public static void main (String[] args)
    {
	int computerMove, playerMove, computerScore = 0, playerScore = 0;
	for (int loop = 1 ; loop <= 5 ; loop++)
	{
	    Stdout.print ("Choose a move: 1=Rock, 2=Paper, 3=Scissors  ");
	    playerMove = Stdin.readInt ();
	    while (playerMove < 1 || playerMove > 3)
	    {
		if (playerMove == 123)
		{
		    break;
		}
		Stdout.println ("You must enter a 1, 2, or 3");
		Stdout.print ("Choose a move: 1=Rock, 2=Paper, 3=Scissors  ");
		playerMove = Stdin.readInt ();
	    } //while
	    computerMove = (int) (Math.random () * 3 + 1);
	    Stdout.println ();
	    switch (playerMove)
	    {
		case 1:
		    Stdout.println ("You chose Rock.");
		    break;
		case 2:
		    Stdout.println ("You chose Paper.");
		    break;
		case 3:
		    Stdout.println ("You chose Scissors.");
		    break;
		default:
		    Stdout.println ("You chose Bomb.");
		    break;
	    } //switch
	    switch (computerMove)
	    {
		case 1:
		    Stdout.println ("The computer chose Rock.");
		    break;
		case 2:
		    Stdout.println ("The computer chose Paper.");
		    break;
		case 3:
		    Stdout.println ("The computer chose Scissors.");
		    break;
	    } //switch
	    switch (computerMove - playerMove)
	    {
		case - 2:
		    Stdout.println ("The computer won.");
		    computerScore++;
		    break;
		case - 1:
		    Stdout.println ("You won.");
		    playerScore++;
		    break;
		case 0:
		    Stdout.println ("It was a tie.");
		    break;
		case 1:
		    Stdout.println ("The computer won.");
		    computerScore++;
		    break;
		case 2:
		    Stdout.println ("You won.");
		    playerScore++;
		    break;
		default:
		    Stdout.println ("You won.");
		    playerScore = 5;
		    loop = 5;
		    break;
	    } //switch
	    Stdout.println ();
	} //for
	Stdout.println ();
	Stdout.println ("Your score is " + playerScore);
	Stdout.println ("The computer's score is " + computerScore);
	if (playerScore > computerScore)
	{
	    Stdout.println ("You won.");
	} //if
	else if (computerScore > playerScore)
	{
	    Stdout.println ("The computer won.");
	} //else if
	else
	{
	    Stdout.println ("It was a tie.");
	} //else
    } // main method
} // RockPaperScissors class
