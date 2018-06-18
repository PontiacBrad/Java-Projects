import java.util.Scanner;
/**
 * @author Bradley
 *This program tests the incrementing features of Java
 */
public class IncrementDemo 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer x: ");
		int x = input.nextInt();
		System.out.print("Enter a negative integer y: ");
		int y = input.nextInt();
		int z =Integer.MAX_VALUE;
		int k = Integer.MIN_VALUE;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		System.out.println("k = " + k);
		x++;
		y++;
		z++;
		k++;
		System.out.println("x++ = " + x);
		System.out.println("y++ = " + y);
		System.out.println("z++ = " + z);
		System.out.println("k++ = " + k);
	}
}
