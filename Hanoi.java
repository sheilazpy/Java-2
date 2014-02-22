// The "Hanoi" class.
public class Hanoi
{
    private static void moveTop (int diskNo, int fromPost,
	    int toPost)
    {
	String alpha = "_abcdefghijklmnopqrstuvwxyz";

	System.out.println ("Move disk " + alpha.charAt (diskNo) +
		" from pole " + fromPost +
		" to pole " + toPost);
    } // moveTop method


    private static void hanoi (int numberOfDisks, int fromPost,
	    int toPost, int otherPost)
    {
	if (numberOfDisks != 0)
	{
	    hanoi (numberOfDisks - 1, fromPost, otherPost, toPost);
	    moveTop (numberOfDisks, fromPost, toPost);
	    hanoi (numberOfDisks - 1, otherPost, toPost, fromPost);
	}
    } // hanoi method


    public static void main (String[] args)
    {
	hanoi (26, 1, 2, 3);
    } // main method
} // Hanoi class
