/**
 * This program shall:
       a.determine the cost to drive to work
       b.compare it to cost of taking the train
 * 
 * @author Bradley Gray  
 * @version 1-14-15
 */
public class Commute
{
	static int distance;
	static int mpg;
	static int train;
	static double gas;
	static double cost;
    
    public static void main(String[] args)
    {
	    distance = 7;
	    mpg = 20;
	    train = 22;
	    gas = distance / mpg;
	    cost = (gas * 3.89);
	    cost = cost + (distance * 0.05);
	    System.out.printf("The cost of driving is $%.2f\n", cost);
	    System.out.println("The cost of taking the train is " + train);
        System.out.println("The cheaper option is taking the car");
    }
}
