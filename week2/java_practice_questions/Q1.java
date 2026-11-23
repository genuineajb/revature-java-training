package questions;

public class Q1 {
	
	public static int reverse(int x) {
		int ans = 0;
		
		while (x != 0) {
			// get remainder and quotient each time number is divided by 10
			int remainder = x % 10;
			x /= 10;
			
			// handle integer overflow
			if (ans > Integer.MAX_VALUE / 10 || 
					(ans == Integer.MAX_VALUE && remainder > 7)) {
				return 0;
			}
			else if (ans < Integer.MIN_VALUE / 10 ||
					(ans == Integer.MIN_VALUE && remainder < -8)) {
				return 0;
			}
			else {
				// add a zero after current answer and then add remainder
				// this simulates the reversal of the number
				ans = ans * 10 + remainder;
			}
		}
		
		return ans;
	}
	
	
	public static void main(String[] args) {
		// run test cases
		System.out.println(reverse(12345));
		System.out.println(reverse(908));
		System.out.println(reverse(-12345));
		System.out.println(reverse(-908));
	}

}
