import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * @author Bradley
 *This class constructs a meeting object and stores them in an array list.
 */
public class Meeting
{
	private String studentName;
	private String advisorName;
	private String officeLocation;
	private int time;
	private static ArrayList<Meeting> scheduledMeetings = new ArrayList<Meeting>();
	
	Meeting(String sName, String aName, String office, int t)
	{
		studentName = sName;
		advisorName = aName;
		officeLocation = office;
		time = t;
	}
	/**
	 * This method sets up a meeting between the student and the advisor.
	 */
	public static void setMeeting()
	{
		int time;
		int meetingTime = 0;
		String advisorName;
		Advisor studentAdvisor;
		Student currentStudent;
		
		for(int i = 0; i < Student.getStudentList().size(); i++)
		{
			currentStudent = Student.getStudentList().get(i);
			
			for(int j = 0; j < 4; j++)
			{
				time = currentStudent.getStudentTimeSlots().get(j);
				advisorName = currentStudent.getAdvisorName();
				studentAdvisor = Advisor.getAdvisor(advisorName);
				meetingTime = studentAdvisor.checkAdvisorTimes(time);
				
				if(meetingTime != 0)
				{
					Meeting meeting = new Meeting(currentStudent.getStudentName(), advisorName, studentAdvisor.getOfficeLocation(), meetingTime);
					scheduledMeetings.add(meeting);
					break;
				}
			}
			if(meetingTime == 0)
			{
				Student.getUnscheduledStudents().add(currentStudent);
			}
		}
	}
	/**
	 * This method print out the meeting schedule for each advisor.
	 * @throws FileNotFoundException
	 */
	public static void printMeetingSchedule()  throws FileNotFoundException
	{
		Advisor currentAdvisor;
		String advisorName;
		String studentAdvisor;
		Meeting currentMeeting;
		
		for(int i = 0; i < Advisor.getAdvisorList().size(); i++)
		{
			currentAdvisor = Advisor.getAdvisorList().get(i);
			advisorName = currentAdvisor.getAdvisorName();
			Main.output.println("Advisor: " + advisorName);
			Main.output.printf("%-20s %-10s %-10s %n", "Student Name", "Location", "Time");
			
			for(int j = 0; j < scheduledMeetings.size(); j++)
			{
				currentMeeting = scheduledMeetings.get(j);
				studentAdvisor = currentMeeting.advisorName;
				
				if(advisorName.equals(studentAdvisor))
				{
					Main.output.printf("%-20s %-10s October %-2d at %2d:%02d%n", currentMeeting.studentName, currentMeeting.officeLocation, currentMeeting.getMeetingDay(), currentMeeting.getMeetingHour(), currentMeeting.getMeetingMinute());
				}
			}
			Main.output.println();
		}
	}
	/**
	 * This gets the day of the meeting.
	 * @return The day.
	 */
	private int getMeetingDay()
	{
		int day = (time / 10000) % 100;
		return day;
	}
	/**
	 * This gets the hour of the meeting.
	 * @return The hour.
	 */
	private int getMeetingHour()
	{
		int hour = (time / 100) % 100;
		return hour;
	}
	/**
	 * This gets the minutes of the meeting.
	 * @return The minutes.
	 */
	private int getMeetingMinute()
	{
		int minute = time % 100;
		return minute;
	}
}
