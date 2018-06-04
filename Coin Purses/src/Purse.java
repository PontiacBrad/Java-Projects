import java.util.ArrayList;

public class Purse 
{
	static ArrayList<String> purse = new ArrayList<String>();
	
	/**This method allows you to add valid United States coins to a purse.
	 * 
	 * @param coinName This is the name of the coin you entered into the keyboard.
	 */
	public static void addCoin(String coinName)
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
	public static void printPurseContents()
	{
		System.out.println("Purse" + purse);
	}
	/**This reverses the order of the coins in the purse.
	 * 
	 */
	public static void reverse()
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
	public static void transfer(ArrayList<String> purse2)
	{
		for(int i = 0; i < Purse2.purse2.size(); i++)
		{
			purse.add(Purse2.purse2.get(i));
		}
		Purse2.purse2.clear();
	}
}