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
		String sentence = animal1;
		sentence = sentence.toUpperCase();
		System.out.println(sentence);
		int l = sentence.length();
		System.out.println("length = " + l);
		System.out.print("Enter another animal: ");
		String animal2 = input.nextLine();
		sentence = animal1.concat(" ").concat(animal2);
		sentence = sentence.toUpperCase();
		System.out.println(sentence);
		l = sentence.length();
		System.out.println("length = " + l);
		System.out.print("Enter an article: ");
		String article = input.nextLine();
		sentence = article.concat(" ").concat(animal1).concat(" ").concat(article).concat(" ").concat(animal2);
		sentence = sentence.toUpperCase();
		System.out.println(sentence);
		l = sentence.length();
		System.out.println("length = " + l);
		System.out.print("Enter a verb: ");
		String action = input.nextLine();
		sentence = article.concat(" ").concat(animal1).concat(" ").concat(action).concat(" ").concat(article).concat(" ").concat(animal2);
		sentence = sentence.toUpperCase();
		System.out.println(sentence);
		l = sentence.length();
		System.out.println("length = " + l);
	}
}
