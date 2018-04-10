/*
 * Bradley Gray
 * Version 2-25-15
 * Requirements: This program shall
 * 			accept values for die throws
 * 			display the number of times each value showed up
 * Design: Two classes a Dice class with a method for setting up the dice, counting the values, and printing them.
 * 				DiceAnalyzer class with main method to run the program.
 */
public class DiceAnalyzer 
{
	public static void main(String[] args)
	{
		final int SIDES = 6;
		Dice dice = new Dice(SIDES);
		dice.countInputs();
		dice.printCounters();
	}
}
/*
 * Test: input 1 4 2 5 5 2 6 1 4 6 3 1 4 5
 * 		output  1: 3
 * 				2: 2
 * 				3: 1
 * 				4: 3
 * 				5: 3
 * 				6: 2
 * 		These are correct values
 */
