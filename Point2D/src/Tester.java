import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * This class constructs two points and then finds the distance between the two.
 * 
 * @author Bradley 
 * @version 3/9/18
 * Requirements:
 *      This program shall
 *          1. construct two points on a coordinate plan
 *          2. find the distance between the two points
 *          3. display the distance and the expected value
 */
public class Tester extends JPanel
{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	    Graphics2D g2d = (Graphics2D) g;
	    g2d.drawLine(30, 40, 300, 40);
    }
	
    public  static void main(String[] args)
    {
    	Point p1 = new Point(30,40);
    	Point p2 = new Point(300,40);
    	Tester tester = new Tester();
    	JFrame frame = new JFrame();
		JLabel distance = new JLabel("Distance is " + p1.distance(p2));
		JPanel panel = new JPanel();
		panel.add(distance);
		frame.add(panel, BorderLayout.NORTH);
		frame.add(tester);
    	frame.setSize(700, 500);
		frame.setLocation(400, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("2D Points");
		frame.setVisible(true);
    }
}