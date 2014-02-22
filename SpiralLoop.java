// The "SpiralLoop" class.
import hsa.*;
public class SpiralLoop
{
    public static void main (String[] args)
    {
	PaintBug bug = new PaintBug (50, 0);
	int side;
	PaintBug.setSpeed (90);
	for (side = 300 ; side > 0 ; side -= 5)
	{
	    bug.move (side);
	    bug.turnRight (90);
	} //for
    } // main method
} // SpiralLoop class
