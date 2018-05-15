import java.util.Scanner;
/**
 * Bradley Gray
 * Requirements: This program shall
 * 					1. accept the combination
 * 					2. accept three numbers from 0 - 39
 * 					3. turn lock to right or left to a number from 0 - 39
 * 					4. open if the combination equals the three numbers in a sequence R L R
 * 					5. reset the lock to zero
 * Design: class: ComboLock
 * 			methods: constructor
 * 						reset
 * 						turn left
 * 						turn right
 * 						lock open
 */
public class ComboLock 
{
	static int dial;
	static int number1;
	static int number2;
	static int number3;
	static int dial1;
	static int dial2;
	static int dial3;
	Scanner in = new Scanner(System.in);
	
	/**
	 * Constructs a ComboLock with the 3 secret numbers
	 * @param secret1
	 * @param secret2
	 * @param secret3
	 */
	public ComboLock(int secret1, int secret2, int secret3)
	{
		number1 = 26;
		number2 = 13;
		number3 = 39;	
	}
	/**
	 * Resets the ComboLock to 0
	 */
	public void reset()
	{
		dial = 0;
	}
	/**
	 * Turns the lock to the left to the specified number
	 * @param number
	 */
	public void turnLeft(int number)
	{
		int newNumber;
		System.out.println("Turn left to what number?");
		do 
			{
			newNumber = in.nextInt();
			if (newNumber <= 39)
			{
				dial = newNumber;
			}
			else
			{
				System.out.println("Not a valid input. Enter a number between 0 and 39:");
			}	
			}
		while (dial == 0);
	}
	/**
	 * Turns the lock to the right to the specified number
	 * @param number
	 */
	public void turnRight(int number)
	{
		int newNumber;
		System.out.println("Turn right to what number?");
		do 
			{
			newNumber = in.nextInt();
			if (newNumber <= 39)
			{
				dial = newNumber;
			}
			else
			{
				System.out.println("Not a valid input. Enter a number between 0 and 39:");
			}	
			}
		while (dial == 0);
	}
	/**
	 * Attempts to open the lock
	 * @return
	 */
	public boolean open()
	{
		if (dial1 == number1)
		{
			if (dial2 == number2)
			{
				if (dial3 == number3)
				{
					return true;
				}
				else return false;
			}
			else return false;
		}
		else return false; 
	}
	public static void main(String[] args)
	{
		ComboLock gymLocker = new ComboLock(number1, number2, number3);
		gymLocker.reset();
		gymLocker.turnRight(dial);
		dial1 = dial;
		gymLocker.reset();
		gymLocker.turnLeft(dial);
		dial2 = dial;
		gymLocker.reset();
		gymLocker.turnRight(dial);
		dial3 = dial;
		gymLocker.reset();
		boolean a = gymLocker.open();
		
		if (a == true) 
		{
			System.out.println("The lock is open!");
		}
		else
		{
			System.out.println("The lock did not open!");
		}
	}
}
/**
 * Test: 
 * 		Correct combination: 
 * 				Input:	right to 26
 * 						left to 13
 * 						right to 39
 * 		Output: The lock opens
 * 
 * 		Wrong combination: 	
 * 				Input:	right to 25
 * 						left to 38
 * 						right to 40
 * 		Output: Not a valid input
 * 				Input:  right to 39
 * 		Output: the lock is not open
 * */
