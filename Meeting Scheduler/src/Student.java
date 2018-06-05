import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

/**
 * @author Bradley
 *This class constructs a student object and stores them in an array list.
 */
public class Student 
{
	private String studentName;
	private String advisorName;
	private static ArrayList<Student> studentList = new ArrayList<Student>();
	private static ArrayList<Student> unscheduledStudents = new ArrayList<Student>();
	private ArrayList<Integer> studentTimeSlots;
	
	Student(String sfn, String sln, String afn, String aln, int t1, int t2, int t3, int t4)
	{
		setStudentName(sfn, sln);
		setAdvisorName(afn, aln);
		studentTimeSlots = new ArrayList<Integer>();
		studentTimeSlots.add(t1);
		studentTimeSlots.add(t2);
		studentTimeSlots.add(t3);
		studentTimeSlots.add(t4);
	}
	/**
	 * This method reads input from a file and stores it in a student object.
	 * @throws FileNotFoundException
	 */
	static void setStudentInfo() throws FileNotFoundException
	{
		String firstName;
		String lastName;
		String aFirstName;
		String aLastName;
		int t1;
		int t2;
		int t3;
		int t4;
		File studentInput = new File("CSCI2010_Lab8_Student_Data.txt");
		Scanner input = new Scanner(studentInput);
		input.nextLine();
		
		do
		{
			firstName = input.next();
			
			if(firstName.equals(Main.getEndOfData()))
			{
				break;
			}
			lastName = input.next();
			aFirstName = input.next();
			aLastName = input.next();
			t1 = input.nextInt();
			t2 = input.nextInt();
			t3 = input.nextInt();
			t4 = input.nextInt();
			Student student = new Student(firstName, lastName, aFirstName, aLastName, t1, t2, t3, t4);
			studentList.add(student);
		}
		while(true);
	}
	/**
	 * This method prints the list of unscheduled students.
	 */
	static void printUnscheduledStudents()
	{
		Main.output.println("These students were not scheduled: ");
		
		for(int i = 0; i < unscheduledStudents.size(); i++)
		{
			Main.output.println(unscheduledStudents.get(i).studentName);
		}
		Main.output.println();
	}
	/**
	 * This method returns the student's name.
	 * @return The student's name.
	 */
	public String getStudentName() 
	{
		return studentName;
	}
	/**
	 * This method sets the student's name.
	 * @param studentFirstName This is the sudent's first name from the input.
	 * @param studentLastName This is the student's last name from the input.
	 */
	public void setStudentName(String studentFirstName, String studentLastName) 
	{
		this.studentName = studentFirstName + " " + studentLastName;
	}
	/**
	 * This method gets the student's advisor's name.
	 * @return the advisor's name.
	 */
	public String getAdvisorName() 
	{
		return advisorName;
	}
	/**
	 * This method sets the student's advisor's name.
	 * @param advisorFirstName This is the student's advisor's first name from the input.
	 * @param advisorLastName This is the student's advisor's last name from the input.
	 */
	public void setAdvisorName(String advisorFirstName, String advisorLastName) 
	{
		this.advisorName = advisorFirstName + " " + advisorLastName;
	}
	/**
	 * This method gets the list of students.
	 * @return the array listof students.
	 */
	public static ArrayList<Student> getStudentList() 
	{
		return studentList;
	}
	/**
	 * This method returns the list of unscheduled students.
	 * @return The array list of unscheduled students.
	 */
	public static ArrayList<Student> getUnscheduledStudents() 
	{
		return unscheduledStudents;
	}
	/**
	 * This method gets the list of the student's times.
	 * @return The array list of the student's times.
	 */
	public ArrayList<Integer> getStudentTimeSlots() 
	{
		return studentTimeSlots;
	}
}
