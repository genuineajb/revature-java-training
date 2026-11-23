package questions;

public class Q5 {
	public static String isAnagram(String s1, String s2) {
		// ignore spaces
		String trimmed_s1 = s1.trim();
		String trimmed_s2 = s2.trim();
		
		// 2 strings of unequal length cannot be anagrams
		if (s1.length() != s2.length()) {
			return "Not Anagram";
		}
		
		// frequency array for each char
		int[] freq = new int[256];
		
		char[] s1chars = trimmed_s1.toCharArray();
		char[] s2chars = trimmed_s2.toCharArray();
		
		for (int i = 0; i < trimmed_s1.length(); ++i) {
			// add frequency for each char in s1
			// decrement for each char in s2
			freq[s1chars[i]]++;
			freq[s2chars[i]]--;
		}
		
		// 2 strings are anagrams if each count is 0
		// as the incrementing and decrementing cancel out
		for (int count : freq) {
			if (count != 0) {
				return "Not Anagram";
			}
		}
		
		return "Anagram";
	}
	
	
	public static void main(String[] args) {
		// test cases
		System.out.println(isAnagram("listen", "silent"));
		System.out.println(isAnagram("hello", "world"));
	}

}
