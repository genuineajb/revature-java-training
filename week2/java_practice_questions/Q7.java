package questions;

public class Q7 {

	static void modify(int x) {
		x = 100;
	}
	
	static void reassignArray(int[] arr) {
		arr = new int[] {100, 20, 30};
	}
	
	public static void main(String[] args) {
		
		int a = 10;
		int[] numbers = {10, 20, 30};
		
		modify(a);
		reassignArray(numbers);
		
		System.out.println(a);
		System.out.println(numbers[0]);
	}
}
