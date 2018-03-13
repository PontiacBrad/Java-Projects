import java.awt.Point;
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
public class Tester
{
    public  static void main(String[] args)
    {
    	Point p1 = new Point(3,4);
    	Point p2 = new Point(-3,-4);
    	System.out.println("Distance is " + p1.distance(p2));
    	System.out.println("Expected value is 10");
    }
}
