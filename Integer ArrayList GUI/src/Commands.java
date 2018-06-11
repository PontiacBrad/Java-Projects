import javax.swing.JLabel;

public class Commands 
{
	/**
	 * This method prints out the contents in the array list.
	 */
	static void printArray()
	{
		ArrayManagerFrame.outputArea.setText(null);
		
		for(int i = 0; i < ArrayManagerFrame.integerArrayList.size(); i++)
		{
			if(ArrayManagerFrame.integerArrayList.get(i) == 0)
			{
				ArrayManagerFrame.outputArea.append("<EMPTY> \n");
			}
			else
			{
				ArrayManagerFrame.outputArea.append(ArrayManagerFrame.integerArrayList.get(i) + "\n");
			}
		}
		ArrayManagerFrame.resetHeaderPanel("Please click the command you wish to perform.");
	}
	/**
	 * This method adds values to the array list.
	 * @param n This is the number to add.
	 */
	static void add(int n)
	{
		if(n < 100 && n > 0)
		{
			if(ArrayManagerFrame.integerArrayList.size() > ArrayManagerFrame.arrayListSize)
			{
				ArrayManagerFrame.integerArrayList.set(ArrayManagerFrame.arrayListSize, n);
				ArrayManagerFrame.arrayListSize++;
				ArrayManagerFrame.resetOutputArea();
			}
			else
			{
				ArrayManagerFrame.resetHeaderPanel("The array list is full. The integer was not added.");
			}
		}
		else
		{
			ArrayManagerFrame.resetHeaderPanel("The integer is not in the valid range of 1 to 99. Please try again.");
		}
	}
	/**
	 * This method updates one value in the array list to another value.
	 * @param n This is the old number.
	 * @param p This is the new number.
	 */
	static void update(int n, int p)
	{
		int index = ArrayManagerFrame.integerArrayList.indexOf(n);
	
		if(index >= 0 && index < ArrayManagerFrame.arrayListSize)
		{
			if(p < 100 && p > 0)
			{
				ArrayManagerFrame.integerArrayList.set(index, p);
				ArrayManagerFrame.resetOutputArea();
			}
			else
			{
				ArrayManagerFrame.resetHeaderPanel("The integer is not in the valid range of 1 to 99. Please try again.");
			}
		}
		else
		{
			ArrayManagerFrame.resetHeaderPanel("The value " + n + " does not exist. Try again.");
		}
	}
	/**
	 * This method deletes a value from the array list.
	 * @param n This is the number to delete.
	 */
	static void delete(int n)
	{
		if(ArrayManagerFrame.integerArrayList.contains(n) && n > 0)
		{
			ArrayManagerFrame.integerArrayList.remove(Integer.valueOf(n));
			ArrayManagerFrame.integerArrayList.add(0);
			ArrayManagerFrame.arrayListSize--;
			ArrayManagerFrame.resetOutputArea();
		}
		else
		{
			ArrayManagerFrame.resetHeaderPanel("The value " + n + " does not exist. Try again.");
		}
	}
	/**
	 * This method drops a value from the array list.
	 * @param m This is the index of the value to be dropped.
	 */
	static void drop(int m)
	{
		if(m >= 0 && m < ArrayManagerFrame.arrayListSize)
		{
			ArrayManagerFrame.integerArrayList.remove(m);
			ArrayManagerFrame.integerArrayList.add(0);
			ArrayManagerFrame.arrayListSize--;
			ArrayManagerFrame.resetOutputArea();
		}
		else
		{
			ArrayManagerFrame.resetHeaderPanel("The index " + m + " is not in the array. Try again.");
		}
	}
	/**
	 * This method changes the size of the array list and auto fills it with zeros.
	 * @param q This is the size the array will become.
	 */
	static void resize(int q)
	{
		if(q <= 25 && q > 0)
		{
			while(q > ArrayManagerFrame.integerArrayList.size())
			{
				ArrayManagerFrame.integerArrayList.add(0);
			}
			while(q < ArrayManagerFrame.integerArrayList.size())
			{
				ArrayManagerFrame.integerArrayList.remove(ArrayManagerFrame.integerArrayList.size() - 1);
			}
			ArrayManagerFrame.resetOutputArea();
		}
		else
		{
			ArrayManagerFrame.resetHeaderPanel("The size " + q + " is not an acceptible array size. Please enter a size between 1 and 25.");
		}
	}
	/**
	 * This method ends the program.
	 */
	static void end()
	{
		System.exit(0);
	}
	/**
	 * This method finds and remove all duplicate values except the first one.
	 */
	static void removeDuplicates()
	{
		boolean complete = false;
		
		while(!complete)
		{
			complete = true;
			
			for(int i = 0; i < ArrayManagerFrame.arrayListSize; i++)
			{
				int value = ArrayManagerFrame.integerArrayList.get(i);
				int index = ArrayManagerFrame.integerArrayList.lastIndexOf(value);
				
				if(index != i)
				{
					drop(index);
					complete = false;
					break;
				}
			}
		}
		ArrayManagerFrame.resetOutputArea();
	}
	/**
	 * This method finds and deletes the maximum value in the array list.
	 */
	static void dlMax()
	{
		int max = 0;
		
		for(int i = 0; i < ArrayManagerFrame.arrayListSize; i++)
		{
			if(ArrayManagerFrame.integerArrayList.get(i) > max)
			{
				max = ArrayManagerFrame.integerArrayList.get(i);
			}
		}
		delete(max);
		ArrayManagerFrame.resetOutputArea();
	}
	/**
	 * This method finds and deletes the minimum value in the array list.
	 */
	static void dlMin()
	{
		int min = 100;
		
		for(int i = 0; i < ArrayManagerFrame.arrayListSize; i++)
		{
			if(ArrayManagerFrame.integerArrayList.get(i) < min)
			{
				min = ArrayManagerFrame.integerArrayList.get(i);
			}
		}
		delete(min);
		ArrayManagerFrame.resetOutputArea();
	}
	/**
	 * This method finds and moves the maximum value to the end of the array list.
	 */
	static void movMax()
	{
		int max = 0;
		
		for(int i = 0; i < ArrayManagerFrame.arrayListSize; i++)
		{
			if(ArrayManagerFrame.integerArrayList.get(i) > max)
			{
				max = ArrayManagerFrame.integerArrayList.get(i);
			}
		}
		ArrayManagerFrame.integerArrayList.remove(Integer.valueOf(max));
		ArrayManagerFrame.integerArrayList.add(ArrayManagerFrame.arrayListSize - 1, max);
		ArrayManagerFrame.resetOutputArea();
	}
	/**
	 * This method finds and moves the minimum value to the beginning of the array list.
	 */
	static void movMin()
	{
		int min = 100;
		
		for(int i = 0; i < ArrayManagerFrame.arrayListSize; i++)
		{
			if(ArrayManagerFrame.integerArrayList.get(i) < min)
			{
				min = ArrayManagerFrame.integerArrayList.get(i);
			}
		}
		ArrayManagerFrame.integerArrayList.remove(Integer.valueOf(min));
		ArrayManagerFrame.integerArrayList.add(0, min);
		ArrayManagerFrame.resetOutputArea();
	}
}