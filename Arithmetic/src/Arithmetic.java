import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args)
	{
		System.out.println("Integer Arithmetic");
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an interger: ");
		int x = in.nextInt();
		System.out.print("Enter another Integer: ");
		int y = in.nextInt();
		System.out.print("Addition: ");
		int integerA = x + y;
		System.out.println(integerA);
		System.out.print("Subraction: ");
		int integerB = x - y;
		System.out.println(integerB);
		System.out.print("Multiplication: ");
		int integerC = x * y;
		System.out.println(integerC);
		System.out.print("Division: ");
		int integerH = x / y;
		System.out.println(integerH);
		System.out.print("Remainder: ");
		int integerI = x % y;
		System.out.println(integerI);
		System.out.print("Average: ");
		int integerD = integerA/ 2;
		System.out.println(integerD);
		System.out.print("Distance: ");
		int integerE = Math.abs(integerB);
		System.out.println(integerE);
		System.out.print("Max: ");
		int integerF = Math.max(x , y);
		System.out.println(integerF);
		System.out.print("Min: ");
		int integerG = Math.min(x , y);
		System.out.println(integerG);
		System.out.print("Square Root of ");
		System.out.print(x);
		System.out.print(": ");
		int integerJ = (int) Math.sqrt(x);
		System.out.println(integerJ);
		System.out.print("Square Root of ");
		System.out.print(y);
		System.out.print(": ");
		int integerK = (int) Math.sqrt(y);
		System.out.println(integerK);
	}
}