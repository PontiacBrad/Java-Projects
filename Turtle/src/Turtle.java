import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

public class Turtle 
{
	static int x = 300;
	static int y = 300;
	int d;
	static int w = 100;
	Color c;
	static int x1;
	static int y1;
	static int x2;
	static int y2;
	static Point2D.Double from;
	static Point2D.Double to;
	
	/**
	 * Constructs a Turtle object
	 * @param ax The x coordinate
	 * @param ay The y coordinate
	 * @param ac The color of the Turtle
	 * @param aw The location on the screen
	 */
	public Turtle(int ax, int ay, Color ac, int aw)
	{
		x = ax;
		y = ay;
		w = aw;
		c = ac;
	}
	/**
	 * Draws the Turtle object on the screen
	 * @param g2
	 */
	public void draw(Graphics2D g2)
	{
		Ellipse2D.Double turtle = new Ellipse2D.Double(x, y, w, w);
		g2.setColor(c);
		g2.fill(turtle);	
	}
	/**
	 * Moves the Turtle upwards
	 * @param d The distance up
	 */
	public static void up(int d)
	{
		x1 = x + (w / 2);
		y1 = y + (w / 2);
		Point2D.Double from = new Point2D.Double(x1, y1);
		y = y - d;
		x2 = x + (w / 2);
		y2 = y + (w / 2);
		Point2D.Double to = new Point2D.Double(x2, y2);
	}
	/**
	 * Moves the Turtle downward
	 * @param d The distance down
	 */
	public static void down(int d)
	{
		x1 = x + (w / 2);
		y1 = y + (w / 2);
		Point2D.Double from = new Point2D.Double(x1, y1);
		y = y + d;
		x2 = x + (w / 2);
		y2 = y + (w / 2);
		Point2D.Double to = new Point2D.Double(x2, y2);
	}
	/**
	 * Moves the Turtle leftwards
	 * @param d The distance left
	 */
	public static void left(int d)
	{
		x1 = x + (w / 2);
		y1 = y + (w / 2);
		Point2D.Double from = new Point2D.Double(x1, y1);
		x = x - d;
		x2 = x + (w / 2);
		y2 = y + (w / 2);
		Point2D.Double to = new Point2D.Double(x2, y2);
	}
	/**
	 * Moves the Turtle rightwards
	 * @param d The distance right
	 */
	public static void right(int d)
	{
		x1 = x + (w / 2);
		y1 = y + (w / 2);
		Point2D.Double from = new Point2D.Double(x1, y1);
		x = x + d;
		x2 = x + (w / 2);
		y2 = y + (w / 2);
		Point2D.Double to = new Point2D.Double(x2, y2);
	}
	/**
	 * Moves the Turtle in a square shape
	 * @param lengthOfSides The length of the sides of the square
	 */
	public static void square(int lengthOfSides)
	{
		Turtle.up(lengthOfSides);
		Turtle.right(lengthOfSides);
		Turtle.down(lengthOfSides);
		Turtle.left(lengthOfSides);
	}
}
	
