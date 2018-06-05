import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

/**
 * @author Bradley
 * This class constructs an advisor object and stores them in an array list.
 */
public class Advisor 
{
	private String advisorName;
	private String officeLocation;
	private static ArrayList<Advisor> advisorList = new ArrayList<Advisor>();
	private ArrayList<Integer> advisorTimeSlots;
	
	Advisor(String afn, String aln, String ol, int t1, int t2, int t3, int t4)
	{
		setAdvisorName(afn, aln);
		setOfficeLocation(ol);
		advisorTimeSlots = new ArrayList<Integer>();
		advisorTimeSlots.add(t1 * 100);
		advisorTimeSlots.add(t1 * 100 + 15);
		advisorTimeSlots.add(t1 * 100 + 30);
		advisorTimeSlots.add(t1 * 100 + 45);
		advisorTimeSlots.add(t2 * 100);
		advisorTimeSlots.add(t2 * 100 + 15);
		advisorTimeSlots.add(t2 * 100 + 30);
		advisorTimeSlots.add(t2 * 100 + 45);
		advisorTimeSlots.add(t3 * 100);
		advisorTimeSlots.add(t3 * 100 + 15);
		advisorTimeSlots.add(t3 * 100 + 30);
		advisorTimeSlots.add(t3 * 100 + 45);
		advisorTimeSlots.add(t4 * 100);
		advisorTimeSlots.add(t4 * 100 + 15);
		advisorTimeSlots.add(t4 * 100 + 30);
		advisorTimeSlots.add(t4 * 100 + 45);
	}
	/**
	 * This method reads input from a file and creates advisors based on the input.
	 * @throws FileNotFoundException
	 */
	public static void setAdvisorInfo() throws FileNotFoundException
	{
		String firstName;
		String lastName;
		String officeLocation;
		int t1;
		int t2;
		int t3;
		int t4;
		File AdvisorInput = new File("CSCI2010_Lab8_Advisor_Data.txt");
		Scanner input = new Scanner(AdvisorInput);
		input.nextLine();
		
		do
		{
			firstName = input.next();
			
			if(firstName.equals(Main.getEndOfData()))
			{
				break;
			}
			lastName = input.next();
			officeLocation = input.next();
			t1 = input.nextInt();
			t2 = input.nextInt();
			t3 = input.nextInt();
			t4 = input.nextInt();
			Advisor advisor= new Advisor(firstName, lastName, officeLocation, t1, t2, t3, t4);
			advisorList.add(advisor);
		}
		while(true);
		input.close();
	}
	/**
	 * This method finds the students advisor from a list of advisors.
	 * @param name This is the name of the student's advisor.
	 * @return This returns the record of the student's advisor.
	 */
	public static Advisor getAdvisor(String name)
	{
		for(int i = 0; i < advisorList.size(); i++)
		{
			Advisor currentAdvisor = advisorList.get(i);
			
			if(name.equals(currentAdvisor.advisorName))
			{
				return currentAdvisor;
			}
		}
		return null;
	}
	/**
	 * This method compares the students's times with the advisor's times.
	 * @param time This is the student's time.
	 * @return If a student's time matches an advisor's then it returns the time, otherwise it returns 0.
	 */
	public int checkAdvisorTimes(int time)
	{
		int currentTime;
		
		for(int i = 0; i < advisorTimeSlots.size(); i++)
		{
			currentTime = advisorTimeSlots.get(i);
			
			if(time == currentTime)
			{
				advisorTimeSlots.remove(i);
				return currentTime;
			}
		}
		return 0;
	}
	/**
	 * This method prints the list of advisors who have unscheduled students.
	 */
	public static void printAdvisorsWithUnscheduledStudents()
	{
		Main.output.println("These advisors have unscheduled students: ");
		
		for(int i = 0; i < Student.getUnscheduledStudents().size(); i++)
		{
			Main.output.println(Student.getUnscheduledStudents().get(i).getAdvisorName());
		}
		Main.output.println();
	}
	/**
	 * This gets the name of an advisor.
	 * @return The name of the advisor.
	 */
	public String getAdvisorName() 
	{
		return advisorName;
	}
	/**
	 * This sets the advisor's name.
	 * @param advisorFirstName The advisor's first name from the input.
	 * @param advisorLastName The advisor's last name from the input.
	 */
	public void setAdvisorName(String advisorFirstName, String advisorLastName) 
	{
		this.advisorName = advisorFirstName + " " + advisorLastName;
	}
	/**
	 * This gets the advisor's office location.
	 * @return The office location.
	 */
	public String getOfficeLocation() 
	{
		return officeLocation;
	}
	/**
	 * This sets the advisor's office location.
	 * @param officeLocation The office location from the input.
	 */
	public void setOfficeLocation(String officeLocation) 
	{
		this.officeLocation = officeLocation;
	}
	/**
	 * This gets the list of advisors.
	 * @return The array list of advisors.
	 */
	public static ArrayList<Advisor> getAdvisorList() 
	{
		return advisorList;
	}
}

