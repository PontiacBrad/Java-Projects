import java.util.Scanner;
/*
 * Bradley Gray
 * Version 2-18-15
 * Requirements: This program shall
 * 		1. accept inputs for hours and minutes of two military times
 * 		2. compare the two times
 * 		3. display which time comes first
 * Design: One class Time with variables for hour, minute, and time.
 * 			I used a constructor method for time and then a compare to method.
 */
public class Time 
{
	int hour;
	int minute;
	String time;
			
	//Instantiates a Time object with a specified hour and minute
	public Time(int hour, int minute)
	{
		this.hour = hour;
		this.minute = minute;
		this.time = this.hour + ":" + this.minute;
		if(minute == 0)
		{
			this.time = this.time + "0";
		}
	}
	//Compares two times chronologically
	public int compareTo(Time other)
	{
		if(this.hour < other.hour)
		{
			return -1;
		}
		else if(this.hour == other.hour)
		{
			if(this.minute < other.minute)
			{
				return -1;
			}
			else if(this.minute == other.minute)
			{
				return 0;
			}
			else
			{
				return 1;
			}
		}
		else 
		{
			return 1;
		}
	}		
	public static void main(String[] args)
	{
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the hour of the first time: ");
	int hour1 = in.nextInt();
	System.out.println("Enter the minutes of the first time: ");
	int minute1 = in.nextInt();
	System.out.println("Enter the hour of the second time: ");
	int hour2 = in.nextInt();
	System.out.println("Enter the minutes of the second time: ");
	int minute2 = in.nextInt();
	Time time1 = new Time(hour1, minute1);
	Time time2 = new Time(hour2, minute2);
	int result = time1.compareTo(time2);
	if(result == -1)
	{
		System.out.println(time1.time + " comes first.");
	}
	else if(result == 0)
	{
		System.out.println(time1.time + " is equal to " + time2.time);
	}
	else
	{
		System.out.println(time2.time + " comes first.");
	}
	}
}
/*
 * Test: the program accepts my inputs of 2 and 56 and 7 and 42. 
 * 		It outputs 2:56 comes first.   This is correct.
 */		