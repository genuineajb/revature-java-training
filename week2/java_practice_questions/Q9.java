package questions;

public class Q9 {
	
	public static String findNonRepeatedChar(String s) {
		// handle edge cases (empty string, null, 1 char strings)
		if (s == null || s.isEmpty()) {
			return "No non-repeated character";
		}
		else if (s.length() == 1) {
			return String.valueOf(s.charAt(0));
		}
		
		StringBuilder checked = new StringBuilder();
		
		for (int i = 0; i < s.length(); ++i) {
			char c = s.charAt(i);
			
			// if c was already checked, skip it
			if (checked.indexOf(String.valueOf(c)) != -1) {
				continue;
			}
			
			// count frequency of c in s. If count = 1, it's the answer
			int cFrequency = 0;
			for (int j = 0; j < s.length(); ++j) {
				if (s.charAt(j) == c) {
					++cFrequency;
				}
			}
			
			if (cFrequency == 1) {
				return String.valueOf(c);
			}
			
			// if it is repeated, append it to the checked characters
			checked.append(c);
		}
		
		return "No non-repeated character";
	}
	
	public static void main(String[] args) {
		// test cases
		System.out.println(findNonRepeatedChar("swiss"));
		System.out.println(findNonRepeatedChar("aabbcc"));
		System.out.println(findNonRepeatedChar(null));
		System.out.println(findNonRepeatedChar("a"));
		System.out.println(findNonRepeatedChar(""));
		
	}

}
