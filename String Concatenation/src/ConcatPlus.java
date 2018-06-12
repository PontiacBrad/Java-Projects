import java.util.Scanner;
/**
 * This program explores the String class and its methods
 * @author Bradley
 *
 */
public class ConcatPlus 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an animal: ");
		String animal1 = input.nextLine();
		System.out.print("Enter another animal: ");
		String animal2 = input.nextLine();
		System.out.print("Enter an article: ");
		String article = input.nextLine();
		System.out.print("Enter a verb: ");
		String action = input.nextLine();
		String sentence = article.concat(" ").concat(animal1).concat(" ").concat(action).concat(" ").concat(article).concat(" ").concat(animal2);
		sentence = sentence.toUpperCase();
		int l = sentence.length();
		System.out.println(sentence);
		System.out.println("length = " + l);
	}
}
