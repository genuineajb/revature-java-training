<h1>Exercise 2</h1>>

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


<h1>Exercise 3</h1>

**Copilot Response**

Package and Imports
package week2.day2.assignment1;
What: Puts this class inside the week2.day2.assignment1 package.

Why: Helps organize Java classes and must match the source-folder structure.

Concept: Java package.

Example: package school.students;

import java.util.Scanner;
What: Imports the Scanner class from Java’s built-in libraries.

Why: Allows the program to receive keyboard input.

Concept: Import statement.

Class Declaration
public class BillingApplication {
What: Declares a public class named BillingApplication.

Why: Java program execution starts in a class, and a public class name must match the file name.

Concept: Class declaration.

Example: The file should be named BillingApplication.java.

Main Method
public static void main(String[] args) {
What: Defines the program’s entry point.

Why: Java starts execution from main().

Concept: Main method.

Example: public static void main(String[] args) is the standard Java application starting method.

Scanner and User Input
Scanner scanner = new Scanner(System.in);
What: Creates a Scanner object connected to the keyboard.

Why: Lets the program read customer and product information.

Concept: Object creation using new.

Example: System.in represents standard keyboard input.

System.out.print("Enter customer name: ");
What: Displays a message without moving to a new line.

Why: Prompts the user to enter their name.

Concept: Console output.

String customerName = scanner.nextLine();
What: Reads an entire line of text and stores it in customerName.

Why: Customer names can contain spaces.

Concept: String variable and Scanner.nextLine().

Example:

Java
String name = scanner.nextLine(); // User enters: Rahul Sharma
String productName = scanner.nextLine();
What: Reads the product name and stores it in a String.

Why: Product names can contain spaces.

Concept: String input.

Example: "Laptop" or "Wired Mouse".

double productPrice = scanner.nextDouble();
What: Reads a decimal number as the product price.

Why: Prices are often not whole numbers.

Concept: double data type and nextDouble().

Example:

Java
double price = scanner.nextDouble(); // 499.50
int quantity = scanner.nextInt();
What: Reads a whole number representing the quantity.

Why: Quantity is normally represented by a whole number.

Concept: int data type and nextInt().

Example:

Java
int quantity = 3;
Variables and Calculation
double totalAmount = productPrice * quantity;
What: Multiplies the price by the quantity and stores the result.

Why: Produces the complete purchase amount before discount.

Concept: Variables and arithmetic operator *.

Example:

Java
double price = 500.0;
int quantity = 3;
double totalAmount = price * quantity; // 1500.0
Discount Variable
double discountPercentage = 0.0;
What: Creates a variable with an initial discount of zero.

Why: Represents purchases that do not qualify for a discount.

Concept: Variable initialization.

Example: If the purchase is below Rs. 1,000, the program keeps this value as 0.0.

If-Else Conditions
if (totalAmount >= 5000) {
What: Checks whether the purchase amount is at least Rs. 5,000.

Why: This is the condition for the 10% discount.

Concept: if condition.

Example: Rs. 5,000 satisfies this condition because 5000 >= 5000 is true.

discountPercentage = 10.0;
What: Sets the discount percentage to 10%.

Why: Purchases of Rs. 5,000 or more receive the 10% discount.

Concept: Assignment operation.

else if (totalAmount >= 1000) {
What: Checks the next condition only if the if condition was false.

Why: Assigns a 5% discount to purchases from Rs. 1,000 to Rs. 4,999.

Concept: else if conditional branching.

Example:

Java
if (totalAmount >= 5000) {
    // 10% discount
} else if (totalAmount >= 1000) {
    // 5% discount
}
discountPercentage = 5.0;
What: Sets the discount percentage to 5%.

Why: Purchases between Rs. 1,000 and Rs. 4,999 receive 5%.

If neither condition is true, discountPercentage remains 0.0.

Discount Calculation
double discountAmount = totalAmount * discountPercentage / 100.0;
What: Calculates the discount amount in rupees.

Why: Dividing by 100.0 converts the percentage into a fraction.

Concept: Arithmetic operators and double calculations.

Example:

Plaintext
Total = 6000
Percentage = 10
Discount = 6000 * 10 / 100 = 600
double finalAmount = totalAmount - discountAmount;
What: Subtracts the discount from the original total.

Why: Produces the amount the customer must pay.

Concept: Arithmetic subtraction.

Example:

Plaintext
Final Amount = 6000 - 600 = 5400
Output Statements
System.out.println("\n========= SmartStore Bill =========");
What: Prints a bill heading and starts the next output on a new line.

Why: \n improves readability, and println() adds a final line break.

Concept: Console output and escape sequences.

System.out.println("Customer Name: " + customerName);
What: Combines text with the customer name and prints it.

Why: Shows the customer’s name on the bill.

Concept: String concatenation using +.

Example:

Java
String name = "Rahul";
System.out.println("Customer: " + name); // Customer: Rahul
System.out.println("Product Name: " + productName);
What: Combines and displays the product name.

System.out.printf("Total Amount: Rs. %.2f%n", totalAmount);
What: Formats totalAmount to exactly two decimal places.

Why: Currency values should be displayed consistently.

Concept: printf() formatting.

Example: 1500.0 appears as 1500.00.

System.out.printf("Discount Percentage: %.0f%%%n", discountPercentage);
What: Displays the percentage without decimal places and includes a % symbol.

Why: %% prints an actual percentage sign in formatted output.

Concept: printf() format specifiers.

Example: 10.0 appears as 10%.

System.out.printf("Discount Amount: Rs. %.2f%n", discountAmount);
What: Displays the discount amount with exactly two decimal places.

System.out.printf("Final Amount: Rs. %.2f%n", finalAmount);
What: Displays the final amount payable with exactly two decimal places.

Closing the Scanner
scanner.close();
What: Closes the Scanner and releases its resources.

Why: Good practice, especially for applications using external resources.

Concept: Resource cleanup.

}
What: The first } closes main(), and the final } closes BillingApplication.

Why: Java uses braces to define the boundaries of methods and classes.


**I then asked "Why is price stored as double and quantity as int?". Copilot's Response:**

Data Types: double vs. int
double productPrice: A product price can contain decimals, such as Rs. 499.99 or Rs. 50.50. double stores floating-point/decimal values.

int quantity: A quantity normally represents a whole number, such as 1, 3, or 10. int stores whole numbers and does not need to store fractions.

Example
Java
double productPrice = 499.50;
int quantity = 3;
Note: For money in real-world applications, BigDecimal is more precise. However, this assignment uses Java fundamentals, so double is appropriate.


**Code Understanding**

| Question	| Your answer |
| :--- | ---: |
| Which variables does the program use, and what data type is each? | scanner: Scanner, customerName: String, productName: String,<br> productPrice: double, quantity: int, totalAmount: double,<br> discountPercentage: double, discountAmount: double, finalAmount: double |	
| Which if-else conditions decide the discount? Write them out.	| double discountPercentage = 0.0;<br>if (totalAmount >= 5000) {<br>    discountPercentage = 10.0;<br>} else if (totalAmount >= 1000) {<br>    discountPercentage = 5.0;<br>} |
| How is the discount amount calculated? | The discount amount is calculated by multiplying the total amount by the discount percentage and dividing it by 100. |	
| How is the final amount calculated? | The final amount is calculated by subtracting the discount amount from the total amount. |	
| Which line would you change if the 10% threshold moved to ₹6,000? | I would change the if condition on Line 29 to if (totalAmount >= 6000) { |	


<h1>Exercise 4</h1>

<h3>Copilot Response</h3>

The original application is already structured clearly, but discount logic and output formatting are embedded in main(). Extracting them makes the program easier to read and maintain.
package week2.day2.assignment1;

import java.util.Scanner;

public class BillingApplicationOriginal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter customer name: ");
		String customerName = scanner.nextLine();

		System.out.print("Enter product name: ");
		String productName = scanner.nextLine();

		System.out.print("Enter product price: ");
		double productPrice = scanner.nextDouble();

		System.out.print("Enter quantity: ");
		int quantity = scanner.nextInt();

		double totalAmount = productPrice * quantity;
		double discountAmount = calculateDiscount(totalAmount);
		double finalAmount = totalAmount - discountAmount;

		print,
		Bill(
			customerName,
			productName,
			totalAmount	discountAmount,
			finalAmount
		);

		scanner.close();
	}

	/**
	 * Calculates the discount amount in rupees.
	 */
	public static double calculateDiscount(double totalAmount) {
		double discountPercentage = 0.0;

		// Existing SmartStore discount rules
		if (totalAmount >= 5000) {
			discountPercentage = 10.0;
		} else if (totalAmount >= 1000) {
			discountPercentage = 5.0;
		}

		return totalAmount * discountPercentage / 100.0;
	}

	/**
	 * Prints the billing details in the existing bill format.
	 */
	public static void printBill(
			String customerName,
			String productName,
			double totalAmount,
			double discountAmount,
			double finalAmount) {

		double discountPercentage = 0.0;

		if (totalAmount >= 5000) {
			discountPercentage = 10.0;
		} else if (totalAmount >= 1000) {
			discountPercentage = 5.0;
		}

		System.out.println("\n========= SmartStore Bill =========");
		System.out.println("Customer Name: " + customerName);
		System.out.println("Product Name: " + productName);
		System.out.printf("Total Amount: Rs. %.2f%n", totalAmount);
		System.out.printf("Discount Percentage: %.0f%%%n", discountPercentage);
		System.out.printf("Discount Amount: Rs. %.2f%n", discountAmount);
		System.out.printf("Final Amount: Rs. %.2f%n", finalAmount);
	}
}
What changed
calculateDiscount() now contains all discount calculations and returns the rupee discount.

printBill() contains all bill-display statements.

main() now acts mainly as a coordinator: input, calculation, and method calls.

Variable names such as discountAmount clearly describe their purpose.

This improves readability and makes each responsibility easier to test or modify. However, the current printBill() duplicates discount-percentage rules. A stronger beginner-friendly design would pass the percentage separately:
```
public static void printBill(
		String customerName,
		String productName,
		double totalAmount,
		double discountPercentage,
		double discountAmount,
		double finalAmount)
```
Then main() could calculate the percentage without duplicating the rules, while calculateDiscount() remains a single-purpose method

**Before:**<br>
Enter customer name: Rahul<br>
Enter product name: Laptop Bag<br>
Enter product price: 1200<br>
Enter quantity: 5<br>

========= SmartStore Bill =========<br>
Customer Name: Rahul<br>
Product Name: Laptop Bag<br>
Total Amount: Rs. 6000.00<br>
Discount Percentage: 10%<br>
Discount Amount: Rs. 600.00<br>
Final Amount: Rs. 5400.00<br>


**After:**<br>
Enter customer name: Rahul<br>
Enter product name: Laptop Bag<br>
Enter product price: 1200<br>
Enter quantity: 5<br>

========= SmartStore Bill =========<br>
Customer Name: Rahul<br>
Product Name: Laptop Bag<br>
Total Amount: Rs. 6000.00<br>
Discount Percentage: 10%<br>
Discount Amount: Rs. 600.00<br>
Final Amount: Rs. 5400.00<br>

**Refactoring review**
| Question | Your answer |
| :--- | ---: |
| Which new methods were created, and what does each do? | calculateDiscount() calculates the discount amount in rupees.<br>printBill() prints the billing details in the required format. |
| What parameters and return type does calculateDiscount have? | It has double totalAmount as a parameter and and a double return type. |
| Did any discount threshold or comparison (<, >=) change? | No, none changed. |
| Is the before output identical to the after output? | Yes, character for character. |
| Which change improves readability the most, and why? | The addition of calculateDiscount improves readability because it visually spreads the code out into smaller, more readable batches. |


<h1>Exercise 5</h1>

<h3>Copilot's Response</h3>

| Scenario | Test input | Expected discount % | Discount amount | Final amount | |---|---:|---:|---:|---:| | Below Rs. 1,000 | Price Rs. 500, Quantity 1 | 0% | Rs. 0.00 | Rs. 500.00 | | Exactly Rs. 1,000 | Price Rs. 1,000, Quantity 1 | 5% | Rs. 50.00 | Rs. 950.00 | | Rs. 4,999 | Price Rs. 4,999, Quantity 1 | 5% | Rs. 249.95 | Rs. 4,749.05 | | Exactly Rs. 5,000 | Price Rs. 500, Quantity 10 | 10% | Rs. 500.00 | Rs. 4,500.00 | | Above Rs. 5,000 | Price Rs. 600, Quantity 10 | 10% | Rs. 600.00 | Rs. 5,400.00 | | Quantity greater than one | Price Rs. 250, Quantity 4 | 0% | Rs. 0.00 | Rs. 1,000.00 | | Quantity greater than one, 5% tier | Price Rs. 500, Quantity 3 | 5% | Rs. 75.00 | Rs. 1,425.00 |

Calculation formula: discount amount = total amount × discount percentage ÷ 100

The quantity-greater-than-one row with Rs. 250 × 4 equals exactly Rs. 1,000, so it also belongs to the 5% discount tier rather than the no-discount tier. This is an important quantity boundary test.

Additional edge cases

	•  Zero price: Rs. 0.00 × quantity; expect 0% discount and Rs. 0.00 final amount.
	•  Zero quantity: Any positive price × quantity 0; expect Rs. 0.00 purchase and no discount.
	•  Negative price or quantity: Not expected by the business rules. The application does not currently validate them, so such inputs should be rejected or the requirements should define the expected behavior.
	•  Decimal price: 499.95 × 2 = 999.90 should receive no discount.
	•  Just below 5% to 10% boundary: 4999.99 should receive 5% discount.
	•  Just above 5,000: 5000.01 should receive 10% discount.
	•  Large quantity: Verify that multiplication produces the correct total without overflow for valid int quantities.

Expected for decimal boundary test: Rs. 499.95 × 2 = Rs. 999.90, 0% discount, and Rs. 999.90 final amount.


**Test execution sheet**
| #	| Price (₹) |	Qty	| Total (₹) |	Expected discount |	Expected discount amount (₹) |	Expected final (₹) |	Actual final (₹) |	Pass? |
| :--- | :---: | :---: | :---: | :---: | :---: | :---: | :---: | ---: |
| 1	| 800 |	1 | 800	| 0%	| 0.00 |	800.00	| 800.00 | Yes |
| 2	| 1000 | 1 |	1,000 |	5%	| 50.00 |	950.00 | 950.00 | Yes |	
| 3	| 4999	| 1	| 4,999	| 5% | 249.95 |	4,749.05 |	4,749.05 | Yes |	
| 4	| 5000	| 1	| 5,000	| 10% |	500.00 |	4,500.00 |	4,500.00 | Yes |
| 5	| 7000	| 1	| 7,000	| 10% |	700.00 |	6,300.00 |	6,300.00 | Yes |
| 6	| 1200	| 5	| 6,000	| 10% |	600.00 |	5,400.00 |	5,400.00 | Yes |
| 7	| 999.99 |	1 |	999.99 | 0% |	0.00 |	999.99 | 999.99 | Yes |
| 8 |	250	| 4 |	1,000	| 5% |	50.00 |	950.00 | 950.00 | Yes |

| Edge case | What happens now? | What should happen? |
| :--- | :---: | ---: |
| Total of ₹4,999.50 (between the 5% and 10% bands) | A 5% discount is applied. | A 5% discount should be applied. Correct! | 
| Quantity 0 | Final amount is 0. | Final amount should be 0. Correct! |
| Negative price or quantity | Final amount is negative. | Final amount should be 0. |
| Text instead of a number for price | An exception is thrown. | An exception should be thrown, but there should be an error message. |
