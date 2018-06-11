public class Divide 
{
	public static void math(int max, int div)
	{
		for(int i = 1; i <= max; i++)
		{
			int remainder = i % div;
			
			if(remainder == 0)
			{
				System.out.println(i);
			}
		}
	}
}