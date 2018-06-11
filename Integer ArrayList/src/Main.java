/**
 * Bradley Gray
 * 10-17-15
 * This program constructs an integer ArrayList that can be modified with the following commands: add, update, delete, drop, resize, end, remove duplicates, delete max, delete minimum, move max, move minimum.
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
	static ArrayList<Integer> integerArrayList = new ArrayList<Integer>(5);
	static String[] invalidPrefixArray = { "d", "dl", "dlm", "r", "re", "m", "mo", "mov", "movm"};
	static String command;
	static int number1;
	static int number2;
	static int arrayListSize;
	static boolean invalid;
	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[])
	{
		resize(5);
		System.out.println("Please enter the following commands: ADD n | UPDATE n p | DELETE n | DROP m | RESIZE q | END | REMOVEDUPLICATES | DLMAX | DLMIN | MOVMAX | MOVMIN");
		System.out.println("Where n and p are integers, m is an index, and q is the array list size.");

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
	 * This method prints out the contents in the array list.
	 */
	private static void printArray()
	{
		for(int i = 0; i < integerArrayList.size(); i++)
		{
			if(integerArrayList.get(i) == 0)
			{
				System.out.println("<EMPTY>");
			}
			else
			{
				System.out.println(integerArrayList.get(i));
			}
		}
	}
	/**
	 * This method adds values to the array list.
	 * @param n This is the number to add.
	 */
	private static void add(int n)
	{
		if(n < 100 && n > 0)
		{
			if(integerArrayList.size() > arrayListSize)
			{
				integerArrayList.set(arrayListSize, n);
				arrayListSize++;
			}
			else
			{
				System.out.println("The ArrayList is full. The integer was not added.");
			}
		}
		else
		{
			System.out.println("The integer is not in the valid range of 1 to 99. Please try again.");
		}
	}
	/**
	 * This method updates one value in the array list to another value.
	 * @param n This is the old number.
	 * @param p This is the new number.
	 */
	private static void update(int n, int p)
	{
		int index = integerArrayList.indexOf(n);
		
		if(index >= 0)
		{
			if(p < 100 && p > 0)
			{
				integerArrayList.set(index, p);
			}
			else
			{
				System.out.println("The integer is not in the valid range of 1 to 99. Please try again.");
			}
		}
		else
		{
			System.out.println("The value " + n + " does not exist. Try again.");
		}
	}
	/**
	 * This method deletes a value from the array list.
	 * @param n This is the number to delete.
	 */
	private static void delete(int n)
	{
		if(integerArrayList.contains(n))
		{
			integerArrayList.remove(Integer.valueOf(n));
			integerArrayList.add(0);
			arrayListSize--;
		}
		else
		{
			System.out.println("The value " + n + " does not exist. Try again.");
		}
	}
	/**
	 * This method drops a value from the array list.
	 * @param m This is the index of the value to be dropped.
	 */
	private static void drop(int m)
	{
		if(m >= 0 && m < arrayListSize)
		{
			integerArrayList.remove(m);
			integerArrayList.add(0);
			arrayListSize--;
		}
		else
		{
			System.out.println("The index " + m + " is not in the array. Try again.");
		}
	}
	/**
	 * This method changes the size of the array list and auto fills it with zeros.
	 * @param q This is the size the array will become.
	 */
	private static void resize(int q)
	{
		if(q <= 25 && q > 0)
		{
			while(q > integerArrayList.size())
			{
				integerArrayList.add(0);
			}
			while(q < integerArrayList.size())
			{
				integerArrayList.remove(integerArrayList.size() - 1);
			}
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
		System.out.println("PROGRAM TERMINTATED");
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
			
			for(int i = 0; i < arrayListSize; i++)
			{
				int value = integerArrayList.get(i);
				int index = integerArrayList.lastIndexOf(value);
				
				if(index != i)
				{
					drop(index);
					complete = false;
					break;
				}
			}
		}
	}
	/**
	 * This method finds and deletes the maximum value in the array list.
	 */
	private static void dlMax()
	{
		int max = 0;
		
		for(int i = 0; i < arrayListSize; i++)
		{
			if(integerArrayList.get(i) > max)
			{
				max = integerArrayList.get(i);
			}
		}
		delete(max);
	}
	/**
	 * This method finds and deletes the minimum value in the array list.
	 */
	private static void dlMin()
	{
		int min = 100;
		
		for(int i = 0; i < arrayListSize; i++)
		{
			if(integerArrayList.get(i) < min)
			{
				min = integerArrayList.get(i);
			}
		}
		delete(min);
	}
	/**
	 * This method finds and moves the maximum value to the end of the array list.
	 */
	private static void movMax()
	{
		int max = 0;
		
		for(int i = 0; i < arrayListSize; i++)
		{
			if(integerArrayList.get(i) > max)
			{
				max = integerArrayList.get(i);
			}
		}
		integerArrayList.remove(Integer.valueOf(max));
		integerArrayList.add(arrayListSize - 1, max);
	}
	/**
	 * This method finds and moves the minimum value to the beginning of the array list.
	 */
	private static void movMin()
	{
		int min = 100;
		
		for(int i = 0; i < arrayListSize; i++)
		{
			if(integerArrayList.get(i) < min)
			{
				min = integerArrayList.get(i);
			}
		}
		integerArrayList.remove(Integer.valueOf(min));
		integerArrayList.add(0, min);
	}
}