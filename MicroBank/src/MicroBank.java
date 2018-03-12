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
		 	
		 	System.out.println("Enter the deposit amount for Bradley's account:");
		 	double p1 = in.nextDouble();
		 	System.out.println("Enter the interest rate for Bradley's account:");
		 	double r1 = in.nextDouble();
		 	
		 	MicroBankCalculator account1 = new MicroBankCalculator(p1, r1);
		 	double amount1 = MicroBankCalculator.getBalance();
		 	
		 	System.out.println("Enter the deposit amount for Johnathan's account:");
		 	p1 = in.nextDouble();
		 	System.out.println("Enter the interest rate for Johnathan's account:");
		 	r1 = in.nextDouble();
		 	
		 	MicroBankCalculator account2 = new MicroBankCalculator(p1, r1);
		 	double amount2 = MicroBankCalculator.getBalance();
		 	
			System.out.println("Enter the deposit amount for Lou's account:");
		 	p1 = in.nextDouble();
		 	System.out.println("Enter the interest rate for Lou's account:");
		 	r1 = in.nextDouble();
		 	
		 	MicroBankCalculator account3 = new MicroBankCalculator(p1, r1);
		 	double amount3 = MicroBankCalculator.getBalance();
		 	
			System.out.println("Enter the deposit amount for Mr. Grey's account:");
		 	p1 = in.nextDouble();
		 	System.out.println("Enter the interest rate for Mr. Grey's account:");
		 	r1 = in.nextDouble();
		 	
		 	MicroBankCalculator account4 = new MicroBankCalculator(p1, r1);
		 	double amount4 = MicroBankCalculator.getBalance();
		 	
			System.out.println("Bradley's Account: " + amount1);
			System.out.println("Johnathan's Account: " + amount2);
			System.out.println("Lou's Account: " + amount3);
			System.out.println("Mr. Grey's Account: " + amount4);
			
		}
	
		}
 /* Test: the program accepts my inputs and 
  * 	produces realistic output for each bank account
  * 
  */
