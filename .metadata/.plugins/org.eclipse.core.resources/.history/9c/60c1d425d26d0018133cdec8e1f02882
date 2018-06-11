/*
 * Author: Bradley Gray with methods from Horstmann text
*1-28-15
*Requirements: This program shall
*	1. create a bank account
*	2. deposit $1000
*	3. withdraw a total of $900
*	4. display the remaining balance and expected outcome
*Design: One class with several methods from the text with 
*		 one main method implementing them. 
*/
public class BankAccountTester
{
	private double balance;
	
	//Instantiates a Bank Account Tester with a default balance of 0
	public BankAccountTester()
	{
		balance = 0;
	}
	//Instantiates a Bank Account Tester with an amout equal to intitalBalance
	public BankAccountTester(double initialBalance)
	{
		double initaialBalance = 0;
		balance = initaialBalance;
	}
	//Deposits the specified amount into the bank account
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
	//Withdraws the requested amount from the bank account
	public void withdraw(double amount)
	{
		balance = balance - amount;
	}
	//Returns the current balance of the bank account
	public double getBalance()
	{
		return balance;
	}
	public static void main(String[] args)
	{
		BankAccountTester myAccount = new BankAccountTester(0);
		myAccount.deposit(1000);
		myAccount.withdraw(500);
		myAccount.withdraw(400);
		System.out.print("The balance is ");
		System.out.println(myAccount.getBalance());
		System.out.println("The expected amount is 100");
	}
	}
/*
 *Test: The program outputs 100.  
 *		That is equal to the expected amount. 
 */
	