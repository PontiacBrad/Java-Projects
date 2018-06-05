/**
 * This constructs a coin with a name and a numeric value
 * @author Bradley
 *
 */

public class Coin 
{
	double value;
	String name;
	
	Coin(String coinName)
	{
		if(coinName.equalsIgnoreCase("PENNY"))
		{
			value = 0.01;
			name = "Penny";
		}
		if(coinName.equalsIgnoreCase("NICKEL"))
		{
			value = 0.05;
			name = "Nickel";
		}
		if(coinName.equalsIgnoreCase("DIME"))
		{
			value = 0.10;
			name = "Dime";
		}
		if(coinName.equalsIgnoreCase("QUARTER"))
		{
			value = 0.25;
			name = "Quarter";
		}
	}
}
