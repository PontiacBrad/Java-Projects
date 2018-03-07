import java.util.Scanner;
/**
 * 
 * @author Bradley
 * This program calculates a student's grade based on total number of points for assignments
 */
public class GradeCalculation 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your total points for lab assignments out of 50");
		int lab = in.nextInt();
		System.out.println("Enter your total points for tests out of 100");
		int test = in.nextInt();
		System.out.println("Enter your total extra credit points");
		int extra = in.nextInt();
		double average = ((lab + test + extra) / 1.50);
		if(average < 60)
		{
			System.out.println("You got an 'F'");
		}
		else if(average < 70)
		{
			System.out.println("You got an 'D'");
		}
		else if(average < 80)
		{
			System.out.println("You got an 'C'");
		}
		else if(average < 90)
		{
			System.out.println("You got an 'B'");
		}
		else
		{
			System.out.println("You got an 'A'");
		}
		System.out.println(average);
	}
}