import java.util.Scanner;
/*
 * This class computes a fibonacci sequence up to a specific number using a looping structure
 */
public class FibonacciLoop 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Fibonacci number you would like to compute: ");
		int n = in.nextInt();
		long startTime = System.nanoTime();
		
		for(int i = 1; i <= n; i++)
		{
			long f = fib(i);
			System.out.println("fib(" + i + ") = " + f);
		}
		long endTime = System.nanoTime();
		double elapsedTime = (endTime - startTime)* 0.000001;
		System.out.println("Total time: " + elapsedTime + " milliseconds");
	}
	/*
	 *This method calculates a Fibonacci number n 
	 * @param n The nth Fibonacci number to compute
	 */
	public static long fib(int n)
	{
		if(n <= 2)
		{
			return 1;
		}
		else
		{
			long olderValue = 1;
			long oldValue = 1;
			long newValue = 1;
			
			for(int i =3; i <= n; i++)
			{
				newValue = oldValue +olderValue;
				olderValue = oldValue;
				oldValue = newValue;
			}
			return newValue;
		}
	}
}
