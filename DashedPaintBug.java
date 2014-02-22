// The "DashedPaintBug" class.
import java.awt.Color;

public class DashedPaintBug extends hsa.PaintBug
{
    private static double dashLength, dashSpace, dashOn, dashOff;

    public DashedPaintBug (double startX, double startY, double startDirection, Color startColor, double startLength, double startSpace)
    {
	super (startX, startY, startDirection, startColor);
	dashLength = startLength;
	dashSpace = startSpace;
	dashOn = 0;
	dashOff = dashSpace;
    } //DashedPaintBug constructor


    public void move (double distance)
    {
	while (distance > 0)
	{
	    while (dashOn < dashLength && distance > 0)
	    {
		if (distance >= dashLength - dashOn)
		{
		    super.move (dashLength - dashOn);
		    dashOn = dashLength;
		    distance -= (dashLength - dashOn);
		    trailOff ();
		    dashOff = 0;
		} //if
		else
		{
		    super.move (distance);
		    dashOn += distance;
		    distance = 0;
		} //else
	    } //while
	    while (dashOff < dashSpace && distance > 0)
	    {
		if (distance >= dashSpace - dashOff)
		{
		    super.move (dashSpace - dashOff);
		    dashOff = dashSpace;
		    distance -= (dashSpace - dashOff);
		    trailOn ();
		    dashOn = 0;
		} //if
		else
		{
		    super.move (distance);
		    dashOff += distance;
		    distance = 0;
		} //else
	    } //while
	} //while
    } // move method
} // DashedPaintBug class
