
public class Conversion 
{
	public static void main(String[] args)
	{
		String value1 = "12345";
		String value2 = "12.345";
		String value3 = "87654";
		String value4 = "321";
		String value5 = "-28";
		String value6 = "6";
		String value7 = "true";
		String value8 = "-45.237";
		Integer a = Integer.valueOf(value1);
		Double b = Double.valueOf(value2);
		Long c = Long.valueOf(value3);
		Short d = Short.valueOf(value4);
		Byte e = Byte.valueOf(value5);
		char f = value6.charAt(0);
		Boolean g = Boolean.valueOf(value7);
		Float h = Float.valueOf(value8);
		System.out.println("integer = " + a);
		System.out.println("double = " + b);
		System.out.println("long = " + c);
		System.out.println("short = " + d);
		System.out.println("byte = " + e);
		System.out.println("char = " + f);
		System.out.println("boolean = " + g);
		System.out.println("float = " + h);
	}
}