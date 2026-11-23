package questions;

public class Q13 {

	public static String reverse(String s) {
		StringBuilder output = new StringBuilder();
		StringBuilder curr = new StringBuilder();
		char prev = '\u0000';
		
		for (int i = 0; i < s.length(); ++i) {
			char c = s.charAt(i);
			
			// first index is automatically appended as it's 
			// always the start of a word (or a space)
			if (i == 0) {
				curr.append(c);
				prev = c;
				continue;
			}
			
			// two letters back to back are in the same word. Two spaces should be handled as a word too
			if ((c == ' ' && prev == ' ') || (c != ' ' && prev != ' ')) {
				curr.append(c);
			}
			else { /*
				a space and a word next to each other means the
				previous word should be appended at the start
				of the final answer and a new word started */
				output.insert(0, curr);
				curr.delete(0, curr.length());
				curr.append(c);
			}
			
			prev = c;
		}
		
		if (!output.isEmpty()) {
			output.insert(0, curr);
		}
		
		return output.toString();
	}
	
	public static void main(String[] args) {
		// test cases
		System.out.println("Testing \'Java is easy to learn\': " + reverse("Java is easy to learn"));
		System.out.println("Testing \'One  Two   Three\': " + reverse("One  Two   Three"));
		System.out.println("Testing \'    Let's do it   \': " + reverse("    Let's do it    "));
		System.out.println("Test trailing whitespace: " + reverse(reverse("    Woah   ")));
	}

}
