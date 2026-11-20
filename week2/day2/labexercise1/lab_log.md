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
