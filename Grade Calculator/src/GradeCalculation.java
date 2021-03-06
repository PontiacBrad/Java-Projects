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
		double totalPoints = 0;
		double earnedPoints = 0;
		boolean inputing = true;
		Scanner in = new Scanner(System.in);
		
		while(inputing)
		{
			System.out.println("Enter your grades as follows: lab x (out of 50), test x (out of 100), extracredit x (out of 0), or end");
			String type = in.next();
			
			if(type.equalsIgnoreCase("lab"))
			{
				totalPoints = totalPoints + 50;
				earnedPoints = earnedPoints + in.nextInt();
			}
			else if(type.equalsIgnoreCase("test"))
			{
				totalPoints = totalPoints + 100;
				earnedPoints = earnedPoints + in.nextInt();
			}
			else if(type.equalsIgnoreCase("extracredit"))
			{
				earnedPoints = earnedPoints + in.nextInt();
			}
			else
			{
				inputing = false;
			}
		}
		double average = earnedPoints / totalPoints;
		
		if(average < .60)
		{
			System.out.println("You got an 'F'");
		}
		else if(average < .70)
		{
			System.out.println("You got an 'D'");
		}
		else if(average < .80)
		{
			System.out.println("You got an 'C'");
		}
		else if(average < .90)
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