package questions;

public class Q6 {

	public static void swapArithmetic(int a, int b) {
		// arithmetic method: use addition and subtraction to swap
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("a after swap: " + a + " b after swap: " + b);
	}
	
	public static void swapXor(int a, int b) {
		// xor method
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		System.out.println("a after swap: " + a + " b after swap: " + b);
	}
	
	public static void main(String[] args) {
		// test cases
		System.out.print("Arithmetic swap of a=20 and b=10: ");
		swapArithmetic(20, 10);
		System.out.print("Xor swap of a=20 and b=10: ");
		swapXor(20, 10);
		
		// test integer overflow
		System.out.print("Arithmetic swap integer overflow test ");
		swapArithmetic(Integer.MAX_VALUE, Integer.MAX_VALUE - 11111111);
		System.out.print("Xor swap integer overflow test ");
		swapXor(Integer.MAX_VALUE, Integer.MAX_VALUE - 11111111);
	}

}
