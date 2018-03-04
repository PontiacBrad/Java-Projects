/**
 * This program explores the String class and its methods
 * @author Bradley
 *
 */
public class ConcatPlus 
{
	public static void main(String[] args)
	{
		String animal1 = "quick brown fox";
		String animal2 = "lazy dog";
		String article = "the ";
		String action = " jumps over ";
		String sentence = article.concat(animal1).concat(action).concat(animal2);
		sentence = sentence.toUpperCase();
		int l = sentence.length();
		System.out.println(sentence);
		System.out.println("length = " + l);
	}
}
