// The "GraphicCount" class.
import hsa.*;
public class GraphicCount
{
    public static void main (String[] args)
    {
	Animator animator = new Animator ();
	MoveableText numbers = new MoveableText ("1", 150, 150, 0, 0);
	int count = 1;
	animator.add (numbers);
	while (true)
	{
	    animator.drawFrame ();
	    animator.delay (10);
	    count++;
	    numbers.setString (count + "");
	} //while
    } // main method
} // GraphicCount class
