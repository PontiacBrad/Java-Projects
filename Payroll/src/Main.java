/**
 * This program is a payroll program for the ACME Corporation.  
 * It allows you to keep track of employee information and hours. 
 * It can also print the payroll. 
 * @author Bradley Gray
 * 9-1-15
 */
public class Main 
{
	public static void main(String[] args)
	{
		EmployeeRecord.inputRecord();
		EmployeeRecord.inputHours();
		PayRoll.payCheck();
	}
}