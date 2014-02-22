// The "MoveableText" class.
import java.awt.*;
import hsa.*;
public class MoveableText extends Moveable
{
    private Font myFont;
    private String text;

    public MoveableText (String word, double x, double y, double direction, double speed)
    {
	super (x, y, direction, speed);
	text = word;
	myFont = new Font ("Comic Sans MS", Font.PLAIN, 48);
    } // MoveableText constructor


    public void setString (String newWord)
    {
	text = newWord;
    }


    public void paint (Graphics g, int x, int y)
    {
	g.setColor (getColor ());
	g.setFont (myFont);
	g.drawString (text, x, y);
    } //paint method
} // MoveableText class
