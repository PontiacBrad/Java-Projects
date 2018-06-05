import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * @author Bradley Gray
 *Lab 8
 *11-15-15
 *This is the main class that calls the main method.
 */
public class Main
{
	private static String endOfData = "$";
	public static PrintWriter output;
	
	public static void main(String[] args) throws FileNotFoundException
	{
		output = new PrintWriter("Output.txt");
		Student.setStudentInfo();
		Advisor.setAdvisorInfo();
		Meeting.setMeeting();
		Meeting.printMeetingSchedule();
		Student.printUnscheduledStudents();
		Advisor.printAdvisorsWithUnscheduledStudents();
		output.close();
	}
	/**
	 * This gets the string that denotes the end of the data file.
	 * @return endOfData variable.
	 */
	public static String getEndOfData()
	{
		return endOfData;
	}
}
