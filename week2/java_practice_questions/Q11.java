package questions;

public class Q11 {

	public static int longestSubstring(String s) {
		// handle edge cases (empty, null, one-char strings)
		if (s == "" || s == null) {
			return 0;
		}
		else if (s.length() == 1) {
			return 1;
		}
		
		// sliding window: left boundary, answer, boolean array to track seen chars
		int left = 0;
		int ans = 0;
		boolean[] seen = new boolean[128];
		
		// right boundary is how we iterate, each iteration is moving the right boundary
		for (int right = 0; right < s.length(); ++right) {
			char c = s.charAt(right);
			
			// while the dupe is still in the window, move left boundary
			while (seen[c]) {
				seen[s.charAt(left)] = false;
				++left;
			}
			
			seen[c] = true;
			
			if (right - left + 1 > ans) {
				ans = right - left + 1;
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		// test cases
		System.out.println("Answer for abcabcbb: " + longestSubstring("abcabccbb"));
		System.out.println("Answer for pwwkew: " + longestSubstring("pwwkew"));
	}

}
