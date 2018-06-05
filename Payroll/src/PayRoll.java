import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

/**
 * This class allows you to create the payroll.
 * @author Bradley Gray
 */
public class PayRoll 
{
	/**
	 * This method calculates the total hours worked and then prints out the payroll based on hours for each employee.
	 */
	static void payCheck()
	{
		Calendar rightNow = new GregorianCalendar();
		SimpleDateFormat date = new SimpleDateFormat("MM-dd-yyyy");
		String leadingSpaces = "";
		System.out.println("ACME payroll for " + date.format(rightNow.getTime())); 
		System.out.println("Employee ID |   Employee Name |  Hours Worked | Total Pay");
		
		for(int i = 0; i < EmployeeRecord.record.size(); i++)
		{
			double hours = 0;
			double pay = 0;
			
			for(int j = 0; j < EmployeeRecord.workHours.size(); j++)
			{
				if(EmployeeRecord.workHours.get(j).employeeID == EmployeeRecord.record.get(i).employeeID )
				{
					hours = hours + EmployeeRecord.workHours.get(j).hoursWorked;
					
					if(EmployeeRecord.workHours.get(j).hoursWorked > 40)
					{
						pay = pay + (40 * EmployeeRecord.record.get(i).payWage) + ((EmployeeRecord.workHours.get(j).hoursWorked - 40) * (EmployeeRecord.record.get(i).payWage * 1.5));
					}
					else
					{
						pay = pay + (EmployeeRecord.workHours.get(j).hoursWorked * EmployeeRecord.record.get(i).payWage);
					}
				}
			}
			System.out.printf("%7s %03d | %15s | %13.2f | %9.2f %n", leadingSpaces, EmployeeRecord.record.get(i).employeeID, EmployeeRecord.record.get(i).employeeName, hours, pay);
		}
		System.out.println("ACME payroll program finalized.");
	}
}