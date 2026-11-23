package questions;

public class Q3 {
	
	public static void counter(String s) {
		int vowels = 0;
		int consonants = 0;
		
		for (int i = 0; i < s.length(); ++i) {
			if ("aeiouAEIOU".indexOf(s.charAt(i)) != -1) {
				vowels += 1;
			}
			else if (s.charAt(i) != ' '){
				consonants += 1;
			}
		}
		
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
	}
	
	
	public static void main(String[] args) {
		// test cases
		counter("Programming");
		counter("Test Number Two");
	}

}
