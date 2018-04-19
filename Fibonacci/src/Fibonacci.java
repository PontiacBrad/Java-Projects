import java.util.Scanner;
/**
 * 
 * @author gr513837
 *This program shall:
 *				read in an integer, m
 *				read in m integers that are the first m fibonacci numbers
 *				store the fibonacci numbers
 *				display the numbers
 *				verify the displayed numbers by using a calculation
 *Design: class Fibonacci
 *			data: 1-D array
 *			methods: constructor
 *					input method
 *					display method
 *					main method to call methods and test method
 */	
public class Fibonacci 
{
	static int m = 100;
	int[] fArray = new int[m];
	Scanner in = new Scanner(System.in);
	//Instantiates an Array to hold Fibonacci numbers to all zeros	
	public Fibonacci()
	{
		for(int i = 0; i < 100; i++)
		{
			fArray[i] = 0;
		}
	} 
	//Prompts user for input of the Fibonacci numbers
	public void fInput(int a)
	{
		int i = 0;
		System.out.print("Enter an integer: ");
		m = in.nextInt();
		System.out.println("Enter the first " + m + " Fibonacci numbers: ");
		for(i = 0; i < m; i++)
		{
			fArray[i] = in.nextInt();
		}
	}
	//Displays the user entered Fibonacci numbers
	public void fDisplay(int a)
	{
		int i = 0;
		System.out.println("The first " + m + " Fibonacci numbers are:");
		while(i < m)
		{
		System.out.print(fArray[i]);
		System.out.print(" ");
		i++;
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		int i = 0;
		int x = 0;
		int y = 1;
		int f;
		Fibonacci fNumbers = new Fibonacci();
		fNumbers.fInput(m);
		fNumbers.fDisplay(m);
		System.out.println("The expected values are:");
		System.out.print(x + " ");
		System.out.print(y + " ");
		for(i = 2; i < m; i++)
		{
			f = x + y;
			System.out.print(f + " ");
			x = y;
			y = f;
		}
	}
}
/**
 * Test: F(m) = F(m-1) + F(m-2)
 * if m = 2
 * F(0) = 0
 * F(1) = 1
*/