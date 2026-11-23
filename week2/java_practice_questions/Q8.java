package questions;

public class Q8 {

	static String removeDupes(String s) {
		// handle null and empty strings
		if (s == null || s.isEmpty()) {
			return s;
		}
		
		StringBuilder ans = new StringBuilder();
		
		for (int i = 0; i < s.length(); ++i) {
			char c = s.charAt(i);
			boolean dupeExists = false;
			
			// loop through the answer string and see if c is already there
			for (int j = 0; j < ans.length(); ++j) {
				if (ans.charAt(j) == c) {
					dupeExists = true;
					break;
				}
			}
			
			// if there's no dupe, append it to the answer
			if (!dupeExists) {
				ans.append(c);
			}
		}
		
		return ans.toString();
	}
	
	public static void main(String[] args) {
		// test cases
		System.out.println(removeDupes("programming"));
		System.out.println(removeDupes(""));
		System.out.println(removeDupes("ggggggggggggaaaaaaaaaa"));
		System.out.println(removeDupes(null));
	}

}
