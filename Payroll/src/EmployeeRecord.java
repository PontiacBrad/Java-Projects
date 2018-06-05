import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class constructs two different employee records. 
 * @author Bradley Gray
 */
public class EmployeeRecord
{
	int employeeID;
	String employeeName;
	String taxID;
	double payWage;
	int workWeek;
	double hoursWorked;
	static Scanner in = new Scanner(System.in);
	static int counter = 0;
	static ArrayList<EmployeeRecord> record = new ArrayList<EmployeeRecord>();
	static ArrayList<EmployeeRecord> workHours = new ArrayList<EmployeeRecord>();
	static String leadingSpaces = "";
	/**
	 * This constructs an record with an employee's long term information
	 * @param name This is the employee's first and last name.
	 * @param iD This is their tax ID number.
	 * @param wage This is their hourly page wage.
	 */
	EmployeeRecord(String name, String iD, double wage)
	{
		counter++;
		employeeID = counter;
		employeeName = name;
		taxID = iD;
		payWage = wage;
	}
	/**
	 * This constructs a record with an employee's short term information.
	 * @param iD This is the Employee's given ID number from the long term record.
	 * @param week This is the week of the pay cycle.
	 * @param hours This is how many hours worked per week.
	 */
	EmployeeRecord(int iD, int week, double hours)
	{
		employeeID = iD;
		workWeek = week;
		hoursWorked = hours;
	}
	/**
	 * This method allows you to add to the long term employeeRecord and print it out.
	 */
	static void inputRecord()
	{
		System.out.println("Welcome! ACME PayRoll Program has been initiated!");
		System.out.println("Enter the employee name, tax ID, and hourly wage. 0 to quit.");
		
		do
		{
			String name;
			String input = in.next();
			
			if(!input.equals("0"))
			{
				name = input + " " + in.next();
			}
			else
			{
				break;
			}
			String taxID = in.next();
			Double wage = in.nextDouble();
			EmployeeRecord one = new EmployeeRecord(name, taxID, wage);
			record.add(one);
		}
		while(in.hasNext());
		System.out.println("Employee ID |   Employee Name |  Tax ID | Wage");
		
		for(int i = 0; i < record.size(); i++)
		{
			System.out.printf("%7s %03d | %15s | %7s | %5.2f %n", leadingSpaces, record.get(i).employeeID, record.get(i).employeeName, record.get(i).taxID, record.get(i).payWage);
		}
	}
	/**
	 * This allows you to add the week and hours to the short term record.
	 */
	static void inputHours()
	{
		System.out.println("Please enter the employee number, work week 1 or 2, and the hours worked. 0 to quit.");
		
		do
		{
			int iD;
			int input = in.nextInt();
			
			if(input != 0)
			{
				iD = input;
			}
			else
			{
				break;
			}
			int week = in.nextInt();
			Double hours = in.nextDouble();
			EmployeeRecord one = new EmployeeRecord(iD, week, hours);
			workHours.add(one);
		}
		while(in.hasNext());
	}
}
