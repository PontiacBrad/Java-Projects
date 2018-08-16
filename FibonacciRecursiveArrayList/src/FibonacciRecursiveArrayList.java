import java.util.Scanner;
import java.util.ArrayList;

/*
 * This class calculates Fibonacci numbers with a recursive algorithm that stores previous numbers in an ArrayList to speed up the algorithm
 */
public class FibonacciRecursiveArrayList
{
	static long[] fibList;
	static int lastFib = 0;
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of the Fibonacci sequence you would like to see: ");
		int n = in.nextInt();
		fibList = new long[n];
		long startTime = System.nanoTime();
		
		for(int i = 1; i <= n; i++)
		{
			long f = fib(i);
			lastFib++;
			System.out.println("fib(" + i + ") = " + f);
		}
		long endTime = System.nanoTime();
		double elapsedTime = (endTime - startTime)* 0.000001;
		System.out.println("Total time: " + elapsedTime + " milliseconds");
	}
	
	/*
	 * This method is a recursive function that calculates a Fibonacci number
	 * @Param n The nth Fibonacci number you would like to see
	 */
	public static long fib(int n)
	{
		if(n <= 2)
		{
			fibList[n-1] = 1;
		}
		else if(n > lastFib)
		{
			fibList[n-1] = fib(n-1) + fib(n-2);
		}
		return fibList[n-1];
	}
}