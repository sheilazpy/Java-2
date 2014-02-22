// The "Pong" class.
import java.awt.*;
import hsa.*;
import java.awt.event.*;
import javax.swing.*;
public class Pong extends JFrame implements KeyListener
{
    JFrame frame = new JFrame ("Key Listener");
    static int code = 0;
    public Pong ()
    {
	Container contentPane = frame.getContentPane ();
	JTextField text = new JTextField ();
	text.addKeyListener (this);
	contentPane.add (text);
	frame.pack ();
	frame.show ();
    } //Pong method


    //Called when the key is pressed down.
    public void keyPressed (KeyEvent e)
    {
	code = e.getKeyCode ();
    } //keyPressed method


    //Called when the key is released
    public void keyReleased (KeyEvent e)
    {
	code = 0;
    } //keyReleased method


    //Called when a key is typed
    public void keyTyped (KeyEvent e)
    {
    } //keyTyped method


    public static void main (String[] args)
    {
	PaintBug.setSpeed (85);
	int speed = 85, score = 0;
	boolean end = false;
	PaintBug bug = new PaintBug (200, 295, Math.random () * 360, Color.RED);
	bug.trailOff ();
	PaintBug barBug1 = new PaintBug (150, 300, 180, Color.RED);
	barBug1.hide ();
	PaintBug barBug2 = new PaintBug (150, 300, 0, Color.RED);
	barBug2.hide ();
	barBug2.move (100);
	PaintBug endBug1 = new PaintBug (149, 300, 0, Color.WHITE);
	endBug1.hide ();
	PaintBug endBug2 = new PaintBug (251, 300, 180, Color.WHITE);
	endBug2.hide ();
	Pong key = new Pong ();
	while (end == false)
	{
	    if (bug.getYPos () <= 0)
	    {
		bug.setDirection (360 - bug.getDirection ());
	    } //if
	    if (bug.getXPos () <= 0 || bug.getXPos () >= 400)
	    {
		bug.setDirection (180 - bug.getDirection ());
	    } //if
	    if (bug.getYPos () >= 300)
	    {
		if (bug.getXPos () >= barBug1.getXPos () && bug.getXPos () <= barBug2.getXPos ())
		{
		    bug.setDirection (360 - bug.getDirection ());
		    score++;
		    if (speed < 95)
		    {
			speed++;
			PaintBug.setSpeed (speed);
		    } //if
		    else if (barBug2.getXPos () - barBug1.getXPos () > 50)
		    {
			barBug1.setDirection (0);
			endBug1.setDirection (0);
			barBug1.move (1);
			endBug1.move (1);
		    } //else if
		} //if
		else
		{
		    end = true;
		} //else
	    } //if
	    bug.move (1);
	    if (code == 39 && barBug2.getXPos () < 400)
	    {
		barBug1.setDirection (0);
		barBug2.setDirection (0);
		endBug1.setDirection (0);
		endBug2.setDirection (0);
		barBug1.move (1);
		barBug2.move (1);
		endBug1.move (1);
		endBug2.move (1);
	    } //if
	    if (code == 37 && barBug1.getXPos () > 0)
	    {
		barBug1.setDirection (180);
		barBug2.setDirection (180);
		endBug1.setDirection (180);
		endBug2.setDirection (180);
		barBug1.move (1);
		barBug2.move (1);
		endBug1.move (1);
		endBug2.move (1);
	    } //if
	} //while
	System.out.println ("Game over!");
	System.out.println ("Your score is " + score);
    } //main method
} //Pong class
