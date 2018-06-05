import java.util.ArrayList;

public class Purse 
{
	ArrayList<String> purse = new ArrayList<String>();
	
	/**This method allows you to add valid United States coins to a purse.
	 * 
	 * @param coinName This is the name of the coin you entered into the keyboard.
	 */
	public void addCoin(String coinName)
	{
		if(coinName.equalsIgnoreCase("PENNY"))
		{
			purse.add("Penny");
		}
		if(coinName.equalsIgnoreCase("NICKEL"))
		{
			purse.add("Nickel");
		}
		if(coinName.equalsIgnoreCase("DIME"))
		{
			purse.add("Dime");
		}
		if(coinName.equalsIgnoreCase("QUARTER"))
		{
			purse.add("Quarter");
		}
	}
	/**This prints out the contents in the purse.
	 * 
	 */
	public void printPurseContents()
	{
		System.out.println("Purse" + purse);
	}
	/**This reverses the order of the coins in the purse.
	 * 
	 */
	public void reverse()
	{
		ArrayList<String> purseReverse = new ArrayList<String>();
		
		for(int i = purse.size(); i > 0; i--)
		{
			purseReverse.add(purse.get(i-1));
		}
		purse = purseReverse;
	}
	/**This transfers the contents from one purse to another.
	 * 
	 * @param purse2 This is the second purse you put coins in that you will take coins out of.
	 */
	public void transfer(Purse other)
	{
		for(int i = 0; i < other.purse.size(); i++)
		{
			purse.add(other.purse.get(i));
		}
		other.purse.clear();
	}
	/**
	 * This checks to see if the two purses have the same coins in the same order.
	 * @param other This is the second purse.
	 * @return Returns true if contents are the same and false if the contents are not the same.
	 */
	public boolean sameContents(Purse other)
	{
		for(int i = 0; i < purse.size(); i++)
		{
			String coin1 = purse.get(i);
			String coin2 = other.purse.get(i);
			
			if(coin1.equals(coin2))
			{
			}
			else
			{
				System.out.println("The contents are not the same");
				return false;
			}
		}
		System.out.println("The contents are the same.");
		return true;
	}
	/**
	 * This checks to see if the purses have the same coins in them.
	 * @param other This is the second purse.
	 * @return Returns true if purses have the same coins and false if the coins are different.
	 */
	public boolean sameCoins(Purse other)
	{
		for(int i = 0; i < purse.size(); i++)
		{
			ArrayList<String> tempPurse = new ArrayList<String>(other.purse);			
			int coin = tempPurse.indexOf(purse.get(i));
			
			if(coin >= 0)
			{
				tempPurse.remove(coin);
			}
			else
			{
				System.out.println("The coins are not the same");
				return false;
			}
		}
		System.out.println("The coins are the same.");
		return true;
	}
	/**
	 * This adds up the value of the coins in the purse.
	 * @return Returns the value of the purse.
	 */
	public double value()
	{
		double purseValue = 0;
		
		for(int i = 0; i < purse.size(); i++)
		{
			String coinName;
			coinName = purse.get(i);
			Coin coin1 = new Coin(coinName);
			purseValue = purseValue + coin1.value;
		}
		System.out.printf("The value of coins in the purse is: $%.2f", purseValue); 
		System.out.println();
		return purseValue;
	}
	/**
	 * This allows you to spend a coin and remove it from the purse.
	 * @param coinName This is the name of the coin to remove.
	 */
	public void spendCoins(String coinName)
	{
		if(coinName.equalsIgnoreCase("PENNY"))
		{
			purse.remove("Penny");
		}
		if(coinName.equalsIgnoreCase("NICKEL"))
		{
			purse.remove("Nickel");
		}
		if(coinName.equalsIgnoreCase("DIME"))
		{
			purse.remove("Dime");
		}
		if(coinName.equalsIgnoreCase("QUARTER"))
		{
			purse.remove("Quarter");
		}
	}
	/**
	 * This checks to see if you have the funds to pay a bill.
	 * @param purseValue This is the amount of money in the purse.
	 * @param bill This is the cost of the bill.
	 */
	public void payBill(double purseValue, double bill)
	{
		if(purseValue >=  bill)
		{
			System.out.println("Yes, you can pay the bill.");
		}
		else
		{
			System.out.println("You cannot pay the bill!!!");
		}
	}
}