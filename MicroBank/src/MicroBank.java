import java.util.Scanner;
/*
 * Bradley Gray
 * 
 * Version 2-11-15
 * 
 * Requirements: This program shall 
 * 		accept input for the deposit and interest rate
 * 		calculate balance when 
 * 			a deposit is made each day between $0.01 and $1.00
 * 			interest is compounded yearly between 1% and 3%
 * 			over a term of 30 years
 * 		perform calculations for four accounts
 * 
 * Design: Two classes. 
 * 				One to accept input for the bank accounts and produce output
 * 				another to run the calculations for the account
 */				
public class MicroBank 
{
	 public static void main(String[] args)
	{
	 	Scanner in = new Scanner(System.in);
	 	System.out.println("Please enter either deposit or withdraw and an amount for Bradley's account: (enter end to quit)");
	 	MicroBankCalculator account1 = new MicroBankCalculator();
	 	
	 	while(in.hasNext())
	 	{
		 	String command = in.next();
		 	
		 	if(command.equalsIgnoreCase("deposit"))
		 	{
			 	double p1 = in.nextDouble();	
			 	account1.deposit(p1);
			 	double amount1 = MicroBankCalculator.getBalance();	
			 	System.out.println("The balance for Bradley's account is " + amount1);
		 	}
		 	else if(command.equalsIgnoreCase("withdraw"))
		 	{
		 		double p1 = in.nextDouble();
		 		account1.withdraw(p1);
		 		double amount1 = MicroBankCalculator.getBalance();		
			 	System.out.println("The balance for Bradley's account is " + amount1);
		 	}
		 	else
		 	{
		 		break;
		 	}
	 	}	
	}
}
 /* Test: the program accepts my inputs and 
  * 	produces realistic output for each bank account
  * 
  */
