//Bradley Gray
import java.util.Scanner;

public class Counting 
{
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.print("What is the maximum number to count: ");
		int max = in.nextInt();
		System.out.print("What would you like to divide by: ");
		int div = in.nextInt();
		Divide.math(max, div);
	}
}