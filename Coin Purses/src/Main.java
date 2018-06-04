import java.util.Scanner;
/**
 * 
 * @author Bradley Gray
 * 8-30-15
 * Lab 1
 * This programs allows you to add coins to a purse. Then you can print out the contents or reverse the order
 *  and transfer coins between purses.
 *
 */
public class Main 
{
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("Enter the coin name:");
		String coinName = in.next();
		Purse.addCoin(coinName);
		System.out.println("Enter the coin name:");
		coinName = in.next();
		Purse.addCoin(coinName);
		System.out.println("Enter the coin name:");
		coinName = in.next();
		Purse.addCoin(coinName);
		System.out.println("Enter the coin name:");
		coinName = in.next();
		Purse.addCoin(coinName);
		Purse.printPurseContents();
		Purse.reverse();
		Purse.printPurseContents();
		System.out.println("Enter the coin name for purse2:");
		coinName = in.next();
		Purse2.addCoin(coinName);
		System.out.println("Enter the coin name for purse2:");
		coinName = in.next();
		Purse2.addCoin(coinName);
		Purse2.printPurseContents();
		Purse.transfer(Purse2.purse2);
		Purse.printPurseContents();
		Purse2.printPurseContents();
		Purse2.transfer(Purse.purse);
		Purse2.printPurseContents();
		Purse.printPurseContents();
	}
}