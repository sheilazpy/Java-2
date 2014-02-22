// The "MoveableImage" class.
import java.awt.*;
import hsa.*;
public class MoveableImage extends Moveable
{
    private Image image;

    public MoveableImage (Image img, double x, double y, double direction, double speed)
    {
	super (x, y, direction, speed);
	image = img;
    } //MoveableImage constructor


    public void paint (Graphics g, int x, int y)
    {
	g.drawImage (image, x, y, null);
    } //paint method
} // MoveableImage class
