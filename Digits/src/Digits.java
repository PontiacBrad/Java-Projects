import java.util.Scanner;
/*
 * Bradley Gray
 * Version 2-25-15
 * Requirements: This program shall
 * 			accept input for an integer between the min and max value
 * 			display the digits from right to left in a column
 * Design: One class Digits with the main method.
 * 		I used the % 10 to get the digit on the right.
 * 		Then used / 10 to get the new integer with one less digit
 */
public class Digits 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer between " + Integer.MIN_VALUE + " and " + Integer.MAX_VALUE + " : ");
		int int1 = in.nextInt();
		System.out.println("The digits from right to left are:");
		while(int1 != 0)
		{
			System.out.println(int1 % 10);
			int1 = int1 / 10;
		}
	}
}
/*
 * Test: The program input is 54321. It outputs 1
 * 												2
 *  											3
 *  											4
 *  											5
 */