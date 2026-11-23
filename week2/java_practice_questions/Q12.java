package questions;

public class Q12 {

	public static String compress(String s) {
		// one length strings are trivial
		if (s.length() == 1) {
			return s + "1";
		}
		
		// hold is the current repeating char
		StringBuilder output = new StringBuilder();
		char hold = s.charAt(0);
		int count = 0;
		
		for (int i = 0; i < s.length(); ++i) {
			char curr = s.charAt(i);
			
			// once chain of repeating chars stops, append it and its count
			// to the output
			if (curr != hold) {
				output.append(hold + String.valueOf(count));
				count = 1;
				hold = curr;
			}
			else {
				count += 1;
			}
		}
		
		output.append(hold + String.valueOf(count));
		
		return output.toString();
	}
	
	
	public static void main(String[] args) {
		// test cases
		System.out.println("Compressing aaabbccccd: " + compress("aaabbccccd"));
		System.out.println("Compressing abc: " + compress("abc"));
	}

}
