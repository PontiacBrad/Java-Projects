import java.util.Scanner;
/**
 * 
 * @author Bradley
 * This class generates an array that represents the sides of a die.
 */
public class Dice 
{
	private int[] counters;
	//Instantiates a Die with a specified number of sides
	public Dice(int SIDES)
	{
		counters = new int[SIDES + 1];
	}
	//Counts the number of times eash side of the die was rolled
	public void countInputs()
	{
		System.out.println("Please enter values, Q to quit:");
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt())
		{
			int value = in.nextInt();
			
			if (1 <= value && value <= counters.length)
			{
				counters[value]++;
			}
			else
			{
				System.out.println(value + " is not a valid input.");
			}
		}
	}
	//Displays the number of times each side of the die was rolled
	public void printCounters()
	{
		for (int i = 1; i < counters.length; i++)
		{
			System.out.print(i);
			System.out.print(":    ");
			System.out.println(counters[i]);
		}
	}
}
