/**
 * Bradley Gray
 * 10-17-15
 * This program constructs an integer array that can be modified with the following commands: add, update, delete, drop, resize, end, remove duplicates, delete max, delete minimum, move max, move minimum.
 */
import java.util.Scanner;

public class Main
{
	static int[] integerArray = new int[5];
	static String[] invalidPrefixArray = { "d", "dl", "dlm", "r", "re", "m", "mo", "mov", "movm"};
	static String command;
	static int number1;
	static int number2;
	static int arraySize;
	static boolean invalid;
	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[])
	{
		System.out.println("Please enter the following commands: ADD n | UPDATE n p | DELETE n | DROP m | RESIZE q | END | REMOVEDUPLICATES | DLMAX | DLMIN | MOVMAX | MOVMIN");
		System.out.println("Where n and p are integers, m is an index, and q is the array size.");
		
		while(in.hasNext())
		{
			invalid = false;
			command = in.next();
			command.toLowerCase();
			checkPrefix(command);
			
			if(!invalid)
			{
				if(command.equals("update") || "update".startsWith(command))
				{
					number1 = in.nextInt();
					number2 = in.nextInt();
					update(number1, number2);
				}
				else
				{
					findCommand(command);
				}
				printArray();
			}
		}
	}
	/**
	 * This method checks the input to see if it is an invalid prefix.
	 * @param command This is the command inputed.
	 */
	private static void checkPrefix(String command)
	{
		for(int i = 0; i < invalidPrefixArray.length; i++)
		{
			if(command.equals(invalidPrefixArray[i]))
			{
				invalid = true;
				System.out.println("The prefix is not unique. Try again.");
			}
		}
	}
	/**
	 * This method finds the method that corresponds to the command entered into the keyboard.
	 * @param command This is what was entered into the keyboard.
	 */
	private static void findCommand(String command)
	{
		if(command.equals("add") || "add".startsWith(command))
		{
			number1 = in.nextInt();
			add(number1);
		}
		else if(command.equals("delete") || "delete".startsWith(command))
		{
			number1 = in.nextInt();
			delete(number1);
		}
		else if(command.equals("drop") || "drop".startsWith(command))
		{
			number1 = in.nextInt();
			drop(number1);
		}
		else if(command.equals("resize") || "resize".startsWith(command))
		{
			number1 = in.nextInt();
			resize(number1);
		}
		else
		{
			findOtherCommand(command);
		}
	}
	/**
	 * This method finds one of the other commands when the first method is unsuccessful.
	 * @param command This is the command entered into the keyboard.
	 */
	private static void findOtherCommand(String command)
	{
		if(command.equals("end") || "end".startsWith(command))
		{
			end();
		}
		else if(command.equals("removeDuplicates") || "removeduplicates".startsWith(command))
		{
			removeDuplicates();
		}
		else if(command.equals("dlmax") || "dlmax".startsWith(command))
		{
			dlMax();
		}
		else if(command.equals("dlmin") || "dlmin".startsWith(command))
		{
			dlMin();
		}
		else if(command.equals("movmax") || "movmax".startsWith(command))
		{
			movMax();
		}
		else if(command.equals("movmin") || "movmin".startsWith(command))
		{
			movMin();
		}
		else 
		{
			System.out.println("This is not a command!");
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
	/**
	 * This method finds and remove all duplicate values except the first one.
	 */
	private static void removeDuplicates()
	{
		boolean complete = false;
		
		while(!complete)
		{
			complete = true;
			
			for(int i = 0; i < arraySize; i++)
			{
				for(int j = i + 1; j < arraySize; j++)
				{
					if(integerArray[i] == integerArray[j])
					{
						drop(j);
						complete = false;
						break;
					}
				}
				if(!complete)
				{
					break;
				}
			}
		}
	}
	/**
	 * This method finds and deletes the maximum value in the array.
	 */
	private static void dlMax()
	{
		int max = 0;
		
		for(int i = 0; i < arraySize; i++)
		{
			if(integerArray[i] > max)
			{
				max = integerArray[i];
			}
		}
		delete(max);
	}
	/**
	 * This method finds and deletes the minimum value in the array.
	 */
	private static void dlMin()
	{
		int min = 100;
		
		for(int i = 0; i < arraySize; i++)
		{
			if(integerArray[i] < min)
			{
				min = integerArray[i];
			}
		}
		delete(min);
	}
	/**
	 * This method finds and moves the maximum value to the end of the array.
	 */
	private static void movMax()
	{
		int max = 0;
		
		for(int i = 0; i < arraySize; i++)
		{
			if(integerArray[i] > max)
			{
				max = integerArray[i];
			}
		}
		delete(max);
		integerArray[arraySize] = max;
		arraySize++;
	}
	/**
	 * This method finds and moves the minimum value to the beginning of the array.
	 */
	private static void movMin()
	{
		int min = 100;
		
		for(int i = 0; i < arraySize; i++)
		{
			if(integerArray[i] < min)
			{
				min = integerArray[i];
			}
		}
		delete(min);
		
		for(int j = arraySize; j > 0; j--)
		{
			integerArray[j] = integerArray[j - 1];
		}
		integerArray[0] = min;
		arraySize++;
	}
}