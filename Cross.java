// The "Cross" class.
import hsa.*;
public class Cross
{
    public static void main (String[] args)
    {
	PaintBug bug1 = new PaintBug (0, 150);
	PaintBug bug2 = new PaintBug (200, 0);
	PaintBug bug3 = new PaintBug (400, 150);
	PaintBug bug4 = new PaintBug (200, 300);
	bug2.setDirection (270);
	bug3.setDirection (180);
	bug4.setDirection (90);
	bug1.move (200);
	bug2.move (150);
	bug3.move (200);
	bug4.move (150);
    } // main method
} // Cross class
