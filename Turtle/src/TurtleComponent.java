import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class TurtleComponent extends JComponent
{
	Color TurtleColor = new Color(100, 100, 40);
	
	/**
	 * Draws the Turtle component on the screen
	 */
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		Color TurtleColor = new Color(100, 100, 40);
		Turtle turtle1 = new Turtle(Turtle.x, Turtle.y, TurtleColor, Turtle.w);
		turtle1.draw(g2);
	}
}