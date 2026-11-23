package questions;

public class Q2 {

	public static void main(String[] args) {
		int a = 10;
		double b = 3.5;
		
		// Explicit casting (narrowing from double to int)
		int result = (int) (a + b);
		System.out.println(result);
		
		// implicit casting (a is widened to a double)
		double result2 = a + b;
		System.out.println(result2);
	
		char ch = 'A';
		
		// implicit casting (ch is widened to an int)
		int value = ch + 5;
		System.out.println(value);
		
		// explicit casting (value is explicitly cast (narrowed) to a char)
		System.out.println((char) value);
	}

}
