import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
/**
 * 
 * @author Bradley
 * This program generates a black and white target
 */
public class Target 
{
	double x;
	double y;
	double r;
	//Instantiates a target with a set radius r, and a set center at (x,y)
	public Target(double r, double x, double y)
	{
	    this.r = r;
	    this.x = x;
	    this.y = y;
	}
	//Draws the target
	public void draw(Graphics2D g2)
	{
		g2.setColor(Color.BLACK);
	    Ellipse2D.Double target1 = new Ellipse2D.Double(25, 25, 100, 100);
	    g2.fill(target1);
	    g2.setColor(Color.WHITE);
		Ellipse2D.Double target2 = new Ellipse2D.Double(35, 35, 80, 80);
		g2.fill(target2);
		g2.setColor(Color.BLACK);
		Ellipse2D.Double target3 = new Ellipse2D.Double(45, 45, 60, 60);
		g2.fill(target3);
		g2.setColor(Color.WHITE);
		Ellipse2D.Double target4 = new Ellipse2D.Double(55, 55, 40, 40);
		g2.fill(target4);
		g2.setColor(Color.BLACK);
		Ellipse2D.Double target5 = new Ellipse2D.Double(65, 65, 20, 20);
		g2.fill(target5);
		g2.draw(target1);
		g2.draw(target2);
		g2.draw(target3);
		g2.draw(target4);
		g2.draw(target5);
	}
}
