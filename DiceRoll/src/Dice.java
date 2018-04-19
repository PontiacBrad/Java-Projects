import java.util.Random;
/**
 * @author Lab CSCI1010 Class - Text example E2.11
 * @version 1-21-2015
 *Requirements:
 * This program shall simulate the throw of a die by generating and printing a random integer from 1 - 6
 *Design:
 * Simple single class single method sample program to experiment with a Random class from the API library
 */
public class Dice
{   
	public static void main(String[] args)
	{   
		int myDie;
		Random dieGenerator = new Random();
		myDie = dieGenerator.nextInt(6) + 1;
		System.out.println(myDie);
	}
}
/**Test:
 * The program out put: 6, 5, 3, 3, 4, 5
 * This appears to be generating random numbers.
 */