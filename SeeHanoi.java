// The "SeeHanoi" class.
import hsa.VisibleHanoi;

public class SeeHanoi
{
    static VisibleHanoi towers;

    private static void hanoi (int numberOfDisks, int fromPost,
	    int toPost, int otherPost)
    {
	if (numberOfDisks != 0)
	{
	    hanoi (numberOfDisks - 1, fromPost, otherPost, toPost);
	    towers.moveTop (fromPost, toPost);
	    hanoi (numberOfDisks - 1, otherPost, toPost, fromPost);
	}
    } // hanoi method


    public static void main (String[] args)
    {
	towers = new VisibleHanoi (4);
	hanoi (4, 1, 2, 3);
    } // main method
} // SeeHanoi class
