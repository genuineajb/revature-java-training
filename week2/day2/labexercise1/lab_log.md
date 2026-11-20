**Exercise 2**

| Requirement	Met? | (Yes / No) |	Where in the code? |
| :--- | :---: | ---: |
| Reads customer name, product, price, quantity	|	Yes | Lines 11-21 |
| Total = price × quantity	| Yes | Line 24 |
| 0% below ₹1,000	| Yes | Line 27 |
| 5% from ₹1,000 to ₹4,999 | Yes	|	Lines 31-32 |
| 10% at ₹5,000 and above		| Yes | Lines 29-30 |
| Shows discount %, discount amount and final amount	|	Yes | Lines 44-46 |
| Comments explain the discount logic		| Yes | spread throughout in steps |

_Copilot Output_

package week2.day2.assignment1;

import java.util.Scanner;

public class BillingApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Accept customer and purchase details
		System.out.print("Enter customer name: ");
		String customerName = scanner.nextLine();

		System.out.print("Enter product name: ");
		String productName = scanner.nextLine();

		System.out.print("Enter product price: ");
		double productPrice = scanner.nextDouble();

		System.out.print("Enter quantity: ");
		int quantity = scanner.nextInt();

		// Calculate the amount before discount
		double totalAmount = productPrice * quantity;

		// Determine the discount percentage
		double discountPercentage = 0.0;

		if (totalAmount >= 5000) {
			discountPercentage = 10.0;
		} else if (totalAmount >= 1000) {
			discountPercentage = 5.0;
		}

		// Calculate and subtract the discount
		double discountAmount = totalAmount * discountPercentage / 100.0;
		double finalAmount = totalAmount - discountAmount;

		// Display the billing details
		System.out.println("\n========= SmartStore Bill =========");
		System.out.println("Customer Name: " + customerName);
		System.out.println("Product Name: " + productName);
		System.out.printf("Total Amount: Rs. %.2f%n", totalAmount);
		System.out.printf("Discount Percentage: %.0f%%%n", discountPercentage);
		System.out.printf("Discount Amount: Rs. %.2f%n", discountAmount);
		System.out.printf("Final Amount: Rs. %.2f%n", finalAmount);

		scanner.close();
	}
}


**Exercise 3**

_Copilot Response_



_I then asked "Why is price stored as double and quantity as int?". Copilot's Response: _



_Code Understanding_

| Question	| Your answer |
| :--- | ---: |
| Which variables does the program use, and what data type is each? | scanner: Scanner, customerName: String, productName: String,<br> productPrice: double, quantity: int, totalAmount: double,<br> discountPercentage: double, discountAmount: double, finalAmount: double |	
| Which if-else conditions decide the discount? Write them out.	| double discountPercentage = 0.0;<br>if (totalAmount >= 5000) {<br>    discountPercentage = 10.0;<br>} else if (totalAmount >= 1000) {<br>    discountPercentage = 5.0;<br>} |
| How is the discount amount calculated? | The discount amount is calculated by multiplying the total amount by the discount percentage and dividing it by 100. |	
| How is the final amount calculated? | The final amount is calculated by subtracting the discount amount from the total amount. |	
| Which line would you change if the 10% threshold moved to ₹6,000? | I would change the if condition on Line 29 to if (totalAmount >= 6000) { |	
