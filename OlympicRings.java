// The "OlympicRings" class.
import hsa.*;
import java.awt.*;
public class OlympicRings
{
    public static void main (String[] args)
    {
	PaintBug bug1 = new PaintBug (74, 114, 225, Color.BLUE);
	bug1.setTrailWidth (8);
	bug1.hide ();
	PaintBug bug2 = new PaintBug (180, 114, 225, Color.BLACK);
	bug2.setTrailWidth (8);
	bug2.hide ();
	PaintBug bug3 = new PaintBug (286, 180, 135, Color.RED);
	bug3.setTrailWidth (8);
	bug3.hide ();
	PaintBug bug4 = new PaintBug (189, 235, 45, Color.YELLOW);
	bug4.setTrailWidth (8);
	bug4.hide ();
	PaintBug bug5 = new PaintBug (296, 235, 45, Color.GREEN);
	bug5.setTrailWidth (8);
	bug5.hide ();
	PaintBug.setSpeed (98);
	for (int side = 1 ; side <= 72 ; side++)
	{
	    bug1.move (4);
	    bug1.turnLeft (5);
	    bug2.move (4);
	    bug2.turnLeft (5);
	    bug3.move (4);
	    bug3.turnRight (5);
	    bug4.move (4);
	    bug4.turnLeft (5);
	    bug5.move (4);
	    bug5.turnLeft (5);
	}
    } // main method
} // OlympicRings class
