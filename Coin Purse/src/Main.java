import java.util.Scanner;

/**
 * @author Bradley Gray
 * 9-3-15
 * Lab 2
 * This programs allows you to add coins to a purse. Then you can print out the contents or reverse the order
 *  and transfer coins between purses.  You can also check for the same contents or the same coins.  
 *  You also have the ability to spend coins and add up the value of the purse to see if you can pay a bill.
 */
public class Main 
{
	static Scanner in = new Scanner(System.in);
	static Purse purse1 = new Purse();
	static Purse purse2 = new Purse();
	static double bill = 0.25;
	
	public static void main(String[] args)
	{
		System.out.println("Enter the coin name:");
		String coinName = in.next();
		purse1.addCoin(coinName);
		System.out.println("Enter the coin name:");
		coinName = in.next();
		purse1.addCoin(coinName);
		System.out.println("Enter the coin name:");
		coinName = in.next();
		purse1.addCoin(coinName);
		System.out.println("Enter the coin name:");
		coinName = in.next();
		purse1.addCoin(coinName);
		System.out.println("Enter the coin name for purse2:");
		coinName = in.next();
		purse2.addCoin(coinName);
		System.out.println("Enter the coin name for purse2:");
		coinName = in.next();
		purse2.addCoin(coinName);
		System.out.println("Enter the coin name for purse2:");
		coinName = in.next();
		purse2.addCoin(coinName);
		System.out.println("Enter the coin name for purse2:");
		coinName = in.next();
		purse2.addCoin(coinName);
		purse1.printPurseContents();
		purse1.value();
		purse2.printPurseContents();
		purse2.value();
		purse1.sameContents(purse2);
		purse1.sameCoins(purse2);
		System.out.println("What coin would you like to spend from purse1?");
		coinName = in.next();
		purse1.spendCoins(coinName); 
		System.out.println("What coin would you like to spend from purse2?");
		coinName = in.next();
		purse2.spendCoins(coinName); 
		purse1.printPurseContents();
		purse1.payBill(purse1.value(), bill);
		purse2.printPurseContents();
		purse2.payBill(purse2.value(), bill);
		purse1.sameContents(purse2);
		purse1.sameCoins(purse2);
	}
}