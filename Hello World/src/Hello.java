import java.util.Scanner;

/**
 * The program shall display:
     a. my name
     b. my major
     c. my hobby
 * 
 * @author Lab Team (implementing textbook program: Horstmann)
 * @version 1-14-15
 */
public class Hello
{
    public static void main(String[] args)
    {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Enter your name: ");
    	String name = input.nextLine();
    	System.out.print("Enter your major: ");
    	String major = input.nextLine();
    	System.out.println("Enter your favorite hobby: ");
    	String hobby = input.nextLine();
        System.out.println(name);
        System.out.println(major);
        System.out.println(hobby);
    }
}
