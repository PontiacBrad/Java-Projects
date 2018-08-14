import java.util.Scanner;
/*
 * This Class calculates the Fibonacci sequence using a recursive algorithm
 */
public class RecursiveFib 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of Fibonacci numbers you would like to see: ");
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
	 * This method returns the requested Fibonacci number using a recursive algorithm
	 *  @Param n The Fibonacci number you would like to see
	 */
	public static long fib(int n)
	{
		if(n <= 2)
		{
			return 1;
		}
		else
		{
			return fib(n-1) + fib(n-2);
		}
	}
}