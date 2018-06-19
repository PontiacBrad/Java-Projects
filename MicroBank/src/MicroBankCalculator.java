/**
 * 
 * @author Bradley
 *This class performs calculations on a bank account
 */
public class MicroBankCalculator 
{

	private static double balance;
//This method calculates a bank account total after 30 years with a daily deposit of p1 and an interest rate of r1
	public MicroBankCalculator()
	{
		setBalance(0);
	}
//This method returns the balance of the bank account
	public static double getBalance() {
		return balance;
	}
//This method sets the balance if the bank account to the new balance
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static void withdraw(double amount)
	{
		balance = balance - amount;
	}
	public static void deposit(double amount)
	{
		balance = balance + amount;
	}
}
