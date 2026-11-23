package questions;

public class BonusChallenge {

	public static String longestPalinSubstr(String s) {
		int maxLen = 0;
		int start = 0;
		
		for (int i = 0; i < s.length(); ++i) {
			
			// runs twice, once for odd length palindromes, and once for even.
			for (int j = 0; j < 2; ++j) {
				int low = i;
				int high = i + j;
				
				// expand substring with the char at index i at its center
				while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
					int currLen = high - low + 1;
					if (currLen > maxLen) {
						start = low;
						maxLen = currLen;
					}
					--low;
					++high;
				}
			}
		}
		
		return s.substring(start, start + maxLen);
	}
	
	public static void main(String[] args) {
		// test
		System.out.println("Testing on babad: " + longestPalinSubstr("babad"));
	}

}
