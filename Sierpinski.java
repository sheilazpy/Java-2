import hsa.PaintBug;
import hsa.Stdin;

// The "Sierpinski" class.
public class Sierpinski
{
    static void sierpinskiTriangle (PaintBug bug, int level, double length)
    {
	if (level > 0)
	{
	    sierpinskiTriangle (bug, level - 1, length / 2);
	    bug.turnLeft (120);
	    bug.move (length / 2);
	    bug.turnRight (120);
	    sierpinskiTriangle (bug, level - 1, length / 2);
	    bug.turnRight (120);
	    bug.move (length / 2);
	    bug.turnLeft (120);
	    sierpinskiTriangle (bug, level - 1, length / 2);
	} //if
	else
	{
	    bug.move (length);
	    bug.turnLeft (120);
	    bug.move (length);
	    bug.turnLeft (120);
	    bug.move (length);
	    bug.turnLeft (120);
	    bug.move (length);
	} //else
    } //sierpinskiTriangle method


    public static void main (String[] args)
    {
	System.out.println ("How many levels?");
	int levels = Stdin.readInt ();
	System.out.println ("Length? ");
	double length = Stdin.readDouble ();
	PaintBug.setWindowSize (800, 600);
	PaintBug bug = new PaintBug (5, 595);
	bug.setTrailWidth (1);
	sierpinskiTriangle (bug, levels, length * Math.pow (2, levels));
    } // main method
} // Sierpinski class
