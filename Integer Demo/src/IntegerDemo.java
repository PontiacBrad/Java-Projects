import java.io.FileNotFoundException;
import java.io.PrintWriter;
/**
 * @author Bradley
 *This class tests the max and min values of all Numeric types
 */
public class IntegerDemo 
{
	public static PrintWriter output;

	public static void main(String[] args) throws FileNotFoundException
	{
		output = new PrintWriter("Output.txt");
		output.println("Integer max is " + Integer.MAX_VALUE);
		output.println("Integer min is " + Integer.MIN_VALUE);
		output.println("Byte max is " + Byte.MAX_VALUE);
		output.println("Byte min is " + Byte.MIN_VALUE);
		output.println("Short max is " + Short.MAX_VALUE);
		output.println("Short min is " + Short.MIN_VALUE);
		output.println("Long max is " + Long.MAX_VALUE);
		output.println("Long min is " + Long.MIN_VALUE);
		output.close();
		System.out.println("See file Output.txt for the output from this program");
	}
}
