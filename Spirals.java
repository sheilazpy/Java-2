// The "Spirals" class.
import hsa.*;
public class Spirals
{
    public static void main (String[] args)
    {
	PaintBug.setSpeed(98);
	PaintBug bug1 = new PaintBug ();
	bug1.hide ();
	PaintBug bug2 = new PaintBug ();
	bug2.setDirection (36);
	bug2.hide ();
	PaintBug bug3 = new PaintBug ();
	bug3.setDirection (72);
	bug3.hide ();
	PaintBug bug4 = new PaintBug ();
	bug4.setDirection (108);
	bug4.hide ();
	PaintBug bug5 = new PaintBug ();
	bug5.setDirection (144);
	bug5.hide ();
	PaintBug bug6 = new PaintBug ();
	bug6.setDirection (180);
	bug6.hide ();
	PaintBug bug7 = new PaintBug ();
	bug7.setDirection (216);
	bug7.hide ();
	PaintBug bug8 = new PaintBug ();
	bug8.setDirection (252);
	bug8.hide ();
	PaintBug bug9 = new PaintBug ();
	bug9.setDirection (288);
	bug9.hide ();
	PaintBug bug10 = new PaintBug ();
	bug10.setDirection (324);
	bug10.hide ();
	for (int side = 300 ; side > 1 ; side--)
	{
	    bug1.move (side / 18);
	    bug1.turnRight (10);
	    bug2.move (side / 18);
	    bug2.turnRight (10);
	    bug3.move (side / 18);
	    bug3.turnRight (10);
	    bug4.move (side / 18);
	    bug4.turnRight (10);
	    bug5.move (side / 18);
	    bug5.turnRight (10);
	    bug6.move (side / 18);
	    bug6.turnRight (10);
	    bug7.move (side / 18);
	    bug7.turnRight (10);
	    bug8.move (side / 18);
	    bug8.turnRight (10);
	    bug9.move (side / 18);
	    bug9.turnRight (10);
	    bug10.move (side / 18);
	    bug10.turnRight (10);
	}
    } // main method
} // Spirals class
