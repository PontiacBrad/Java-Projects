/**
 * Bradley Gray
 * 10-3-15
 * This program constructs an integer array that can be modified with the following commands: add, update, delete, drop, resize, and end.
 */
import java.util.Scanner;

public class Main
{
	static int[] integerArray = new int[5];
	static String command;
	static int number1;
	static int number2;
	static int arraySize;
	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[])
	{
		System.out.println("Please enter the following commands: ADD n | UPDATE n p | DELETE n | DROP m | RESIZE q | END");
		System.out.println("Where n and p are integers, m is an index, and q is the array size.");
		
		while(in.hasNext())
		{
			command = in.next();
			
			if(command.equalsIgnoreCase("update"))
			{
				number1 = in.nextInt();
				number2 = in.nextInt();
				update(number1, number2);
			}
			else if(command.equalsIgnoreCase("end"))
			{
				end();
			}
			else
			{
				number1 = in.nextInt();
				findCommand(command);
			}
			printArray();
		}
	}
	/**
	 * This method finds the method that corresponds to the command entered into the keyboard.
	 * @param command This is what was entered into the keyboard.
	 */
	private static void findCommand(String command)
	{
		if(command.equalsIgnoreCase("add"))
		{
			add(number1);
		}
		else if(command.equalsIgnoreCase("delete"))
		{
			delete(number1);
		}
		else if(command.equalsIgnoreCase("drop"))
		{
			drop(number1);
		}
		else if(command.equalsIgnoreCase("resize"))
		{
			resize(number1);
		}
	}
	/**
	 * This method prints out the contents in the array.
	 */
	private static void printArray()
	{
		for(int i = 0; i < integerArray.length; i++)
		{
			if(integerArray[i] == 0)
			{
				System.out.println("<EMPTY>");
			}
			else
			{
				System.out.println(integerArray[i]);
			}
		}
	}
	/**
	 * This method adds values to the array.
	 * @param n This is the number to add.
	 */
	private static void add(int n)
	{
		if(n < 100 && n > 0)
		{
			if(integerArray.length > arraySize)
			{
				integerArray[arraySize] = n;
				arraySize++;
			}
			else
			{
				System.out.println("The array is full. The integer was not added.");
			}
		}
		else
		{
			System.out.println("The integer is not in the valid range of 1 to 99. Please try again.");
		}
	}
	/**
	 * This method updates one value in the array to another value.
	 * @param n This is the old number.
	 * @param p This is the new number.
	 */
	private static void update(int n, int p)
	{
		int value = n;
		boolean found = false;
		
		for(int i = 0; i < integerArray.length; i++)
		{
			if(integerArray[i] == value)
			{
				found = true;
				
				if(p < 100 && p > 0 && n < 100 && n > 0)
				{
					integerArray[i] = p;
					break;
				}
				else
				{
					System.out.println("The integer is not in the valid range of 1 to 99. Please try again.");
				}
			}
		}
		if(found == false)
		{
			System.out.println("The value " + n + " does not exist. Try again.");
		}
	}
	/**
	 * This method deletes a value from the array.
	 * @param n This is the number to delete.
	 */
	private static void delete(int n)
	{
		int value = n;
		boolean found = false;
		
		for(int i = 0; i < integerArray.length; i++)
		{
			if(integerArray[i] == value)
			{
				found = true;
				
				for(int j = i + 1; j < integerArray.length; j++)
				{
					integerArray[j - 1] = integerArray[j];
				}
				integerArray[integerArray.length - 1] = 0;
				arraySize--;
				break;
			}
		}
		if(found == false)
		{
			System.out.println("The value " + n + " does not exist. Try again.");
		}
	}
	/**
	 * This method drops a value from the array.
	 * @param m This is the index of the value to be dropped.
	 */
	private static void drop(int m)
	{
		int index = m;
		
		if(m >= 0 && m < arraySize)
		{
			for(int i = index + 1; i < integerArray.length; i++)
			{
				integerArray[i - 1] = integerArray[i];
			}
			integerArray[integerArray.length - 1] = 0;
			arraySize--;
		}
		else
		{
			System.out.println("The index " + m + " is not in the array. Try again.");
		}
	}
	/**
	 * This method changes the size of the array.
	 * @param q This is the size the array will become.
	 */
	private static void resize(int q)
	{
		int size = q;
		int[] newArray;
		int newArraySize = 0;
		
		if(q <= 25 && q > 0)
		{
			newArray = new int[size];
			
			for(int i = 0; i < newArray.length && i < arraySize; i++)
			{
				newArray[i] = integerArray[i];
				newArraySize++;
			}
			integerArray = newArray;
			arraySize = newArraySize;
		}
		else
		{
			System.out.println("The size " + q + " is not an acceptible array size. Please enter a size between 1 and 25.");
		}
	}
	/**
	 * This method ends the program.
	 */
	private static void end()
	{
		System.out.println("PROGRAM TERMINATED");
		System.exit(0);
	}
}