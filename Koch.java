import hsa.PaintBug;
import hsa.Stdin;

// The "Koch" class.
public class Koch
{
    static void kochCurve (PaintBug bug, int level, double length)
    {
	if (level > 0)
	{
	    kochCurve (bug, level - 1, length / 3);
	    bug.turnLeft (60);
	    kochCurve (bug, level - 1, length / 3);
	    bug.turnRight (120);
	    kochCurve (bug, level - 1, length / 3);
	    bug.turnLeft (60);
	    kochCurve (bug, level - 1, length / 3);
	} //if
	else
	{
	    bug.move (length);
	} //else
    } //kochCurve method


    public static void main (String[] args)
    {
	System.out.println ("How many levels?");
	int levels = Stdin.readInt ();
	System.out.println ("Length? ");
	double length = Stdin.readDouble ();
	PaintBug.setWindowSize (800, 600);
	PaintBug bug = new PaintBug (5, 150);
	bug.setTrailWidth (1);
	kochCurve (bug, levels, length * Math.pow (3, levels));
	bug.turnRight (120);
	kochCurve (bug, levels, length * Math.pow (3, levels));
	bug.turnRight (120);
	kochCurve (bug, levels, length * Math.pow (3, levels));
    } // main method
} // Koch class
