/*
 * Bradley Gray
 * 4-22-15
 * Requirements: This program shall:
 * 					create an array using the given table
 * 					ask whether users want to search by seat or price
 * 					change sold seats to 0
 * 					check to see if the seat is available
 * Design: One class with the main method.  
 * 			I used nested if statements within a do while loop.  
 */
import java.util.Scanner;
public class TheaterSeats 
{
	static int[][] seatArray = {{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
						{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
						{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
						{10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
						{10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
						{10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
						{20, 20, 30, 30, 40, 40, 30, 30, 20, 20},
						{20, 30, 30, 40, 50, 50, 40, 30, 30, 20},
						{30, 40, 50, 50, 50, 50, 50, 50, 40, 30}};
	
	public static void main(String[] args)
	{
		int x = 0;
		
		do
		{
			System.out.println("Would you like to search by seat or by price? Enter 's' or 'p'");
			Scanner in = new Scanner(System.in);
			String a = in.next();
			
			if(a.equals("s"))
			{
				System.out.println("Enter row number between 0 and 9");
				int r = in.nextInt();
				System.out.println("Enter column number between 0 and 8");
				int c = in.nextInt();
				
				if(seatArray[r][c] > 0)
				{
					System.out.println("That seat costs $" + seatArray[r][c]);
					System.out.println("Press c to confirm or anything to cancel");
					String b = in.next();
					
					if(b.equals("c"))
					{
						seatArray[r][c] = 0;
						System.out.println("Your seat is " + r + c);
					}
					else
					{
						System.out.println("Transaction cancelled!");
					}
				}
				else
				{
					System.out.println("That seat is unavailable.");
				}
			}
			else if(a.equals("p"))
			{
				System.out.println("Enter a price of 10, 20, 30, 40, or 50:");
				int p = in.nextInt();
				int q = 0;
				
				for (int r = 0; r < 9; r++)
				{
					if(q == 0)
					{
						for (int c = 0; c < 10; c++)
						{
							if(seatArray[r][c] == p)
							{
								System.out.println("Your seat is " + r + c);
								q++;
								seatArray[r][c] = 0;
								break;
							}
						}
					}
				}
			}
			System.out.println("Buy another ticket? Enter 'y' or 'n'");
			
			if(in.next().equals("n"))
			{
				x++;
			}
		}
		while (x == 0);
		
	}
}
/*Test:  I bought a couple tickets by seat and price.  
 * 			It alerts me when the chosen seat is unavailable
 */
