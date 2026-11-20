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


<h1>Exercise 6</h1>

<h3>Copilot's Response</h3>

Create a test class with the following methods:
```
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BillingApplicationTest {

	@Test
	public void testCalculateDiscountBelowOneThousand() {
		double totalAmount = 800.0;
		double expectedDiscount = 0.0;

		double actualDiscount =
			BillingApplication.calculateDiscount(totalAmount);

		assertEquals(expectedDiscount, actualDiscount, 0.001);
	}

	@Test
	public void testCalculateDiscountAtOneThousand() {
		double totalAmount = 1000.0;
		double expectedDiscount = 50.0;

		double actualDiscount =
			BillingApplication.calculateDiscount(totalAmount);

		assertEquals(expectedDiscount, actualDiscount, 0.001);
	}

	@Test
	public void testCalculateDiscountAtFourThousandNineHundredNineNine() {
		double totalAmount = 4999.0;
		double expectedDiscount = 249.95;

		double actualDiscount =
			BillingApplication.calculateDiscount(totalAmount);

		assertEquals(expectedDiscount, actualDiscount, 0.001);
	}

	@Test
	public void testCalculateDiscountAtFiveThousand() {
		double totalAmount = 5000.0;
		double expectedDiscount = 500.0;

		double actualDiscount =
			BillingApplication.calculateDiscount(totalAmount);

		assertEquals(expectedDiscount, actualDiscount, 0.001);
	}

	@Test
	public void testCalculateDiscountAboveFiveThousand() {
		double totalAmount = 7000.0;
		double expectedDiscount = 700.0;

		double actualDiscount =
			BillingApplication.calculateDiscount(totalAmount);

		assertEquals(expectedDiscount, actualDiscount, 0.001);
	}
}
```
Test Explanation

1. Below Rs. 1,000

	•  Input: 800.0
	•  Rule: No discount is applied.
	•  Expected: 0.0
	•  The assertion checks that the calculated discount is no more than 0.001 away from 0.0.

2. Exactly Rs. 1,000

	•  Input: 1000.0
	•  Rule: Apply a 5% discount.
	•  Calculation: 1000 × 5 ÷ 100 = 50
	•  Expected: 50.0
	•  The assertion confirms that the method returns the 5% discount amount.

3. Rs. 4,999

	•  Input: 4999.0
	•  Rule: Apply a 5% discount.
	•  Calculation: 4999 × 5 ÷ 100 = 249.95
	•  Expected: 249.95
	•  The assertion allows a decimal difference of 0.001.
4. Exactly Rs. 5,000

	•  Input: 5000.0
	•  Rule: Apply a 10% discount.
	•  Calculation: 5000 × 10 ÷ 100 = 500
	•  Expected: 500.0
	•  The assertion verifies the exact 5,000 boundary.

5. Above Rs. 5,000

	•  Input: 7000.0
	•  Rule: Apply a 10% discount.
	•  Calculation: 7000 × 10 ÷ 100 = 700
	•  Expected: 700.0
	•  The assertion verifies that amounts above the boundary receive the 10% discount.

assertEquals(expected, actual, 0.001) verifies that the actual result is very close to the expected result. The third argument is the allowed difference, called the delta

| Test	| Expected discount (₹) |	Pass / fail |	If failed: cause and fix |
| :--- | :---: | :---: | ---: |
| 800 |	0.00 | Pass |	|	
| 1,000	| 50.00	| Pass |  |
| 4,999	| 249.95 | Pass	|	|
| 5,000	| 500.00 | Pass	|	|
| 7,000 | 700.00 | Pass |	|	


<h1>Exercise 7</h1>

<h2>Part A</h2>
<h3>Copilot's Response</h3>

1. Possible Logical Errors

	•  Duplicate discount logic: calculateDiscount() and printBill() both determine the percentage. If business rules change, they can become inconsistent.
	•  Discount percentage is recalculated only for display: This could diverge from the returned discount. It is currently consistent but fragile.
	•  Class naming: The file is BillingApplication.java, so the class name is correct. Earlier BillingApplicationOriginal references only apply to a renamed file.
	•  `Scanner` resource: It is closed at the end, which is correct.

No calculation error is visible for the specified thresholds.

2. Incorrect Discount Calculations

The rules are implemented correctly:

	•  Below Rs. 1,000: 0%
	•  Rs. 1,000–4,999: 5%
	•  Rs. 5,000 or above: 10%

Example:
```
4999 × 5 / 100 = 249.95
5000 × 10 / 100 = 500.00
7000 × 10 / 100 = 700.00
```
The formula is mathematically correct. Potential precision is an issue because double represents decimal values approximately
```
double value = 0.1 + 0.2; // may produce 0.30000000000000004
```
This can produce tiny differences in billing or testing.

3. Potential Invalid User Inputs

The application does not validate:

	•  Negative product prices
	•  Negative or zero quantity
	•  Non-numeric price or quantity
	•  Extremely large quantities
	•  Decimal quantity input
	•  Empty customer or product names

Examples of bad input:

	•  Price -500
	•  Quantity -2
	•  Quantity abc
	•  Customer name containing only spaces
	•  Price equal to NaN or Infinity—possible through some Scanner input paths

Without validation, nextDouble() or nextInt() can throw InputMismatchException, or negative values can create an incorrect bill.
4. Security or Reliability Issues

For this console application:

	•  No validation: Invalid input can terminate the program.
	•  Plain console output: There is no data persistence or access control.
	•  No exception handling: Runtime errors are not handled user-friendly.
	•  Resource risk: Scanner.close() is only reached after successful input.
	•  Floating-point money: double may cause rounding inaccuracies.

In a real retail system, additionally consider:

	•  Unauthorized bill modification
	•  Audit logs
	•  Database transaction handling
	•  Concurrent inventory updates
	•  Secure stored customer data

These are less relevant for a small educational console program but become critical for a production retail system
5. Improvements Before Deployment

Critical Improvements

	1. Validate price and quantity:
	2. Price must be greater than zero.
	3. Quantity must be greater than zero.
	4. Validate input types: Check whether nextDouble() or nextInt() succeeded.
	5. Handle invalid input: Display an error instead of crashing.
	6. Avoid monetary calculations with `double`: Use BigDecimal, especially for real currency.
	7. Calculate the percentage once: Pass it to printBill() instead of repeating business rules.
	8. Define rounding behavior: Round currency to two decimal places consistently.

Optional Improvements

	•  Extract customer input and purchase input into separate methods.
	•  Add a loop to allow multiple products or bills.
	•  Add JUnit tests for boundary values and invalid inputs.
	•  Format and validate customer/product names.
	•  Add logging and persistent storage.
	•  Apply authentication and authorization for real-store use.


| Finding from Copilot | Critical or optional? | Do you agree? Why? |
| :--- | :---: | ---: |
| Validate user input for price and quantity | Critical | I agree, invalid input like strings for the quantity would crash the program. |
| Calculate the percentage once by passing it to printBill() instead of repeating business rules. | Critical  | No, I think this just helps visually and isn't critical to the program. |
| Add a loop to allow multiple products or bills | Optional | I do agree. It's not necessary, but it could be a great feature to add as it gives the program more flexibility.  |
| Format and validate customer/product names. | Optional | I do agree. It's not necessary, but it'd make the program output look cleaner and neater. |

<h2>Part B</h2>

<h3>Copilot's Response to Weak Prompt</h3>

Please specify what the billing code should calculate or include, such as:

	•  Item name and quantity
	•  Unit price and total
	•  Tax and discount
	•  Customer details
	•  Console or Swing output
	•  Any assignment-specific requirements or sample output

<h3>Copilot's Response to Strong Prompt</h3>

import java.util.Scanner;

public class BillingApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept customer and purchase details
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        // Validate the entered values
        if (price < 0 || quantity <= 0) {
            System.out.println("Price cannot be negative and quantity must be greater than zero.");
            scanner.close();
            return;
        }

        // Calculate billing values
        double subtotal = calculateSubtotal(price, quantity);
        double discount = calculateDiscount(subtotal);
        double discountAmount = subtotal * discount;
        double finalAmount = subtotal - discountAmount;

        // Display the bill
        displayBill(customerName, subtotal, discount, discountAmount, finalAmount);

        scanner.close();
    }

    /**
     * Calculates the purchase subtotal.
     */
    public static double calculateSubtotal(double price, int quantity) {
        return price * quantity;
    }

    /**
     * Returns the applicable discount rate.
     * 
     * 0%  for purchases below ₹1,000
     * 5%  for purchases from ₹1,000 to below ₹5,000
     * 10% for purchases from ₹5,000 to below ₹10,000
     * 15% for purchases of ₹10,000 or more
     */
    public static double calculateDiscount(double subtotal) {
        if (subtotal >= 10000) {
            return 0.15;
        } else if (subtotal >= 5000) {
            return 0.10;
        } else if (subtotal >= 1000) {
            return 0.05;
        } else {
            return 0.00;
        }
    }

    /**
     * Displays the complete retail bill.
     */
    public static void displayBill(
            String customerName,
            double subtotal,
            double discount,
            double discountAmount,
            double finalAmount) {

        System.out.println("\n========== RETAIL STORE BILL ==========");
        System.out.println("Customer Name : " + customerName);
        System.out.printf("Subtotal      : ₹%.2f%n", subtotal);
        System.out.printf("Discount      : %.0f%%%n", discount * 100);
        System.out.printf("Discount Amount: ₹%.2f%n", discountAmount);
        System.out.printf("Final Amount  : ₹%.2f%n", finalAmount);
        System.out.println("=======================================");
        System.out.println("Thank you for shopping with us!");
    }
}
Sample Output
Enter customer name: Ananya
Enter product price: 250
Enter quantity: 10

========== RETAIL STORE BILL ==========
Customer Name : Ananya
Subtotal      : ₹2500.00
Discount      : 5%
Discount Amount: ₹125.00
Final Amount  : ₹2375.00
=======================================
Thank you for shopping with us!


<h3>Three Differences</h3>
1.  In the weak prompt, Copilot didn't know how to perform the task while it did in the strong prompt. This is T: Task
2.  In the weak prompt, Copilot had no idea on what constraints would be involved while it did with the strong prompt. C: Constraints
3.  In the weak prompt, Copilot didn't output any code or sample output, while it did with the strong prompt. O: Output


<h1>Final Challenge</h1>

<h3>My prompt</h3>
Act as an experienced Java developer. Develop an employee salary calculator application in Java using Java fundamentals (Scanner, methods, and if-else statements). Accept employee ID, employee name, and basic salary as input. Calculate HRA as 20% of basic salary, DA as 10% of basic salary, and gross salary as basic salary plus HRA plus DA. Deduct a professional tax of ₹200 only when gross salary is strictly greater than ₹20,000, then compute and display the employee's details, salary breakdown, and net salary. Provide complete, executable code with clear comments and sample output
<h3>Copilot's response/code</h3>
package week2.day2.assignment1;

import java.util.Scanner;

/**
 * Calculates an employee's gross and net salary.
 */
public class SalaryCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee ID: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine(); // Clear the newline character

        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter basic salary: ₹");
        double basicSalary = scanner.nextDouble();

        // Calculate salary components
        double hra = calculateHRA(basicSalary);
        double da = calculateDA(basicSalary);
        double grossSalary = calculateGrossSalary(basicSalary, hra, da);

        // Apply professional tax only when gross salary is strictly above ₹20,000
        double professionalTax = calculateProfessionalTax(grossSalary);
        double netSalary = grossSalary - professionalTax;

        // Display employee and salary details
        displaySalaryDetails(
                employeeId,
                employeeName,
                basicSalary,
                hra,
                da,
                grossSalary,
                professionalTax,
                netSalary
        );

        scanner.close();
    }

    /**
     * Calculates HRA at 20% of basic salary.
     */
    public static double calculateHRA(double basicSalary) {
        return basicSalary * 0.20;
    }

    /**
     * Calculates DA at 10% of basic salary.
     */
    public static double calculateDA(double basicSalary) {
        return basicSalary * 0.10;
    }

    /**
     * Calculates gross salary.
     */
    public static double calculateGrossSalary(
            double basicSalary,
            double hra,
            double da) {
        return basicSalary + hra + da;
    }

    /**
     * Deducts ₹200 professional tax only if gross salary exceeds ₹20,000.
     */
    public static double calculateProfessionalTax(double grossSalary) {
        if (grossSalary > 20000) {
            return 200.0;
        } else {
            return 0.0;
        }
    }

    /**
     * Displays the employee details and salary breakdown.
     */
    public static void displaySalaryDetails(
            int employeeId,
            String employeeName,
            double basicSalary,
            double hra,
            double da,
            double grossSalary,
            double professionalTax,
            double netSalary) {

        System.out.println("\n----- Employee Salary Details -----");
        System.out.println("Employee ID      : " + employeeId);
        System.out.println("Employee Name    : " + employeeName);

        System.out.println("\n----- Salary Breakdown -----");
        System.out.printf("Basic Salary     : ₹%.2f%n", basicSalary);
        System.out.printf("HRA (20%%)        : ₹%.2f%n", hra);
        System.out.printf("DA (10%%)         : ₹%.2f%n", da);
        System.out.printf("Gross Salary     : ₹%.2f%n", grossSalary);
        System.out.printf("Professional Tax : ₹%.2f%n", professionalTax);
        System.out.printf("Net Salary       : ₹%.2f%n", netSalary);
    }
}
Sample input and output when gross salary is above ₹20,000:
Enter employee ID: 101
Enter employee name: Rahul Sharma
Enter basic salary: ₹18000

----- Employee Salary Details -----
Employee ID      : 101
Employee Name    : Rahul Sharma

----- Salary Breakdown -----
Basic Salary     : ₹18000.00
HRA (20%)        : ₹3600.00
DA (10%)         : ₹1800.00
Gross Salary     : ₹23400.00
Professional Tax : ₹200.00
Net Salary       : ₹23200.00
Sample output at the ₹20,000 boundary:
Enter employee ID: 102
Enter employee name: Priya Singh
Enter basic salary: ₹15000

Gross Salary     : ₹19500.00
Professional Tax : ₹0.00
Net Salary       : ₹19500.00

<h3>Copilot's explanation</h3>

. Package, Import, and ClassJavapackage week2.day2.assignment1;
Purpose: Places the class inside the week2.day2.assignment1 package.Why required: Helps organize classes and prevents name conflicts.Concept: Java package.Example: The package must match the folder structure: src/week2/day2/assignment1/.Javaimport java.util.Scanner;
Purpose: Makes the Scanner class available in this program.Why required: Scanner reads employee details entered through the keyboard.Concept: Import statement.Example: Scanner input = new Scanner(System.in);Javapublic class SalaryCalculator {
Purpose: Declares the public SalaryCalculator class.Why required: In Eclipse, a Java file should normally have a public class with the same name as the file.Concept: Class declaration.Example: The file name is SalaryCalculator.java, so the class is named SalaryCalculator.Javapublic static void main(String[] args) {
Purpose: Starts the Java program.Why required: Java looks for this method to begin execution.Concept: main() method.Example:Javapublic static void main(String[] args) {
    System.out.println("Program started");
}
2. Scanner and Employee InputJavaScanner scanner = new Scanner(System.in);
Purpose: Creates a Scanner object for reading keyboard input.Why required: It receives employee ID, name, and salary.Concept: Object creation and the java.util.Scanner class.Example:JavaScanner scanner = new Scanner(System.in);
Here, System.in means standard input, usually the keyboard.JavaSystem.out.print("Enter employee ID: ");
Purpose: Displays a prompt without moving to the next line.Why required: It tells the user what value to enter.Concept: Console output using System.out.print().Example: System.out.print("Enter age: ");Javaint employeeId = scanner.nextInt();
Purpose: Reads an integer employee ID and stores it in employeeId.Why required: Employee IDs are commonly whole numbers.Concept: Scanner method and integer variable.Data type: int stores whole numbers.Example: If the user enters 101, employeeId contains 101.Javascanner.nextLine();
Purpose: Clears the newline left after nextInt().Why required: Otherwise, the next nextLine() call may read the remaining newline instead of the employee name.Concept: Input buffer handling.Example:Javaint id = scanner.nextInt();
scanner.nextLine();
String name = scanner.nextLine();
JavaSystem.out.print("Enter employee name: ");
Purpose: Prompts the user to enter the employee's name.Why required: The name must be collected from the user.Concept: Console output.JavaString employeeName = scanner.nextLine();
Purpose: Reads the complete name, including spaces.Why required: Employee names may contain first and last names.Concept: String data type and Scanner.nextLine().Example: "Rahul Sharma" is stored in employeeName.Javadouble basicSalary = scanner.nextDouble();
Purpose: Reads the basic salary entered by the user.Why required: Salary may contain decimal values.Concept: double data type and Scanner input.Data type: double stores decimal numbers.Example: 18000.50 is stored in basicSalary.3. Arithmetic Calculation VariablesJavadouble hra = calculateHRA(basicSalary);
Purpose: Calls the calculateHRA() method and stores its returned value.Why required: HRA is 20% of the basic salary.Calculation: HRA = basicSalary × 20 / 100Concept: Method call and assignment.Example: For ₹18,000, the result is ₹3,600.Javadouble da = calculateDA(basicSalary);
Purpose: Calls the calculateDA() method and stores the result.Why required: DA is 10% of the basic salary.Calculation: DA = basicSalary × 10 / 100Concept: Method call and variable assignment.Example: For ₹18,000, the result is ₹1,800.Javadouble grossSalary =
        calculateGrossSalary(basicSalary, hra, da);
Purpose: Calculates and stores the gross salary.Why required: Gross salary is the salary before professional tax is deducted.Calculation: grossSalary = basicSalary + HRA + DAConcept: Method call, arguments, and return values.Example: 18,000 + 3,600 + 1,800 = 23,400.Javadouble professionalTax =
        calculateProfessionalTax(grossSalary);
Purpose: Determines the professional tax using the gross salary.Why required: Tax is ₹200 only when gross salary is strictly greater than ₹20,000.Concept: Method call and conditional logic.Example: ₹23,400 produces a tax of ₹200, while ₹20,000 produces ₹0.Javadouble netSalary = grossSalary - professionalTax;
Purpose: Calculates the salary available after professional tax.Why required: Net salary is the employee's take-home salary.Calculation: netSalary = grossSalary - professionalTaxConcept: Arithmetic subtraction.Example: 23,400 - 200 = 23,200.4. Salary Calculation MethodsJavapublic static double calculateHRA(double basicSalary) {
Purpose: Declares a method that returns the HRA as a double.Why required: It separates the HRA calculation into reusable code.Concept: Static method, parameter, and return type.Example parameter: basicSalary = 18000.Javareturn basicSalary * 0.20;
Purpose: Calculates 20% and sends the result back to main().Why required: 0.20 represents 20 divided by 100.Concept: Arithmetic and return statement.Example: 18000 × 0.20 = 3600.The same structure applies to DA:Javapublic static double calculateDA(double basicSalary) {
    return basicSalary * 0.10;
}
Purpose: Calculates 10% of basic salary.Example: 18000 × 0.10 = 1800.Javapublic static double calculateGrossSalary(
        double basicSalary,
        double hra,
        double da) {
Purpose: Declares a method accepting three salary components.Why required: It calculates the gross salary using separate, readable values.Concept: Multiple method parameters.Javareturn basicSalary + hra + da;
Purpose: Adds all components and returns the gross salary.Concept: Addition and return statement.Example: 18000 + 3600 + 1800 = 23400.5. If-Else Tax ConditionJavapublic static double calculateProfessionalTax(double grossSalary) {
Purpose: Declares the method that decides whether professional tax applies.Why required: Tax depends on the gross salary.Concept: Method parameter and return value.Javaif (grossSalary > 20000) {
Purpose: Checks whether gross salary is strictly greater than ₹20,000.Why required: Exactly ₹20,000 must not receive the tax.Concept: if statement and the > comparison operator.Example:₹23,400 > ₹20,000 is true₹20,000 > ₹20,000 is falseJavareturn 200.0;
Purpose: Returns ₹200 as the professional tax.Why required: This value is used to reduce the gross salary.Concept: return statement.Java} else {
Purpose: Specifies what to do when the if condition is false.Why required: Employees not exceeding ₹20,000 pay no professional tax.Concept: else statement.Javareturn 0.0;
Purpose: Returns zero tax for a gross salary of ₹20,000 or less.Concept: Numeric return value.Java}
Purpose: Ends the if-else block.For example:JavagrossSalary = 19500;
professionalTax = calculateProfessionalTax(grossSalary); // 0.0
JavagrossSalary = 23400;
professionalTax = calculateProfessionalTax(grossSalary); // 200.0
6. Displaying Employee and Salary DetailsJavadisplaySalaryDetails(
        employeeId,
        employeeName,
        basicSalary,
        hra,
        da,
        grossSalary,
        professionalTax,
        netSalary
);
Purpose: Sends all calculated values to a display method.Why required: Keeps output formatting separate from calculations.Concept: Method call with multiple arguments.Simple example: It is similar to giving several items as a list:JavaprintDetails(employeeName, basicSalary);
Javapublic static void displaySalaryDetails(
        int employeeId,
        String employeeName,
        double basicSalary,
        double hra,
        double da,
        double grossSalary,
        double professionalTax,
        double netSalary) {
Purpose: Declares a method that displays employee and salary details.Why required: It provides a reusable and organized output section.Concept: void method and multiple parameters.Note: void means the method does not return a value.JavaSystem.out.println("\n----- Employee Salary Details -----");
Purpose: Prints a heading and starts with a blank line.Why required: It makes the output easier to read.Concept: println() and escape character \n.Escape character: \n creates a new line.JavaSystem.out.println("Employee ID      : " + employeeId);
Purpose: Displays the employee ID.Why required: It presents the employee's identifying detail.Concept: String concatenation using +.Example: If employeeId is 101, the output is:PlaintextEmployee ID      : 101
JavaSystem.out.println("Employee Name    : " + employeeName);
Purpose: Displays the employee name.Concept: String concatenation.Example: "Employee Name    : Rahul Sharma".JavaSystem.out.printf("Basic Salary     : ₹%.2f%n", basicSalary);
Purpose: Displays basic salary with exactly two decimal places.Why required: Monetary values should usually be shown to two decimal places.Concept: printf() and format specifiers.Format details:%.2f = display a floating-point number with two decimal places.%n = platform-independent new line.₹ = rupee symbol.The remaining printf() statements follow the same pattern:JavaSystem.out.printf("HRA (20%%)        : ₹%.2f%n", hra);
%% prints one literal % character.%.2f prints hra with two decimal places.JavaSystem.out.printf("DA (10%%)         : ₹%.2f%n", da);
Prints DA and a literal percentage sign.JavaSystem.out.printf("Gross Salary     : ₹%.2f%n", grossSalary);
System.out.printf("Professional Tax : ₹%.2f%n", professionalTax);
System.out.printf("Net Salary       : ₹%.2f%n", netSalary);
These print the gross salary, professional tax, and final net salary.7. Closing the ScannerJavascanner.close();
Purpose: Releases the Scanner resources.Why required: It is good resource-management practice.Concept: Closing an I/O resource.Example: After the scanner is no longer needed, call close().Key Java Concepts SummaryConceptWhere it is usedPackagepackage week2.day2.assignment1;Importimport java.util.Scanner;Classpublic class SalaryCalculatorMethodmain(), calculateHRA(), calculateDA()ScannerKeyboard inputintEmployee IDStringEmployee namedoubleSalary and salary componentsArithmetic operators+, -, *Comparison operator>if-elseProfessional tax decisionString concatenationCombining text and valuesprintf()Two-decimal monetary outputvoidDisplay method that returns nothingBoundary ExampleIf basic salary is exactly ₹15,384.61538:HRA = ₹3,076.92DA = ₹1,538.46Gross salary = ₹20,000.00Because the gross salary is not strictly greater than ₹20,000, professional tax is ₹0, not ₹200.

<h3>Refactoring</h3>
Move tax and all salary calculations into clearly named methods.
	•  Keep the original console prompts and exact output format unchanged.
	•  Remove the gross-salary method parameters when those components can be returned by dedicated methods.

A good refactored version would be:
package week2.day2.assignment1;

import java.util.Scanner;

public class SalaryCalculatorOriginal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee ID: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter basic salary: ₹");
        double basicSalary = scanner.nextDouble();

        double houseRentAllowance =
                calculateHouseRentAllowance(basicSalary);

        double dearnessAllowance =
                calculateDearnessAllowance(basicSalary);

        double grossSalary =
                calculateGrossSalary(
                        basicSalary,
                        houseRentAllowance,
                        dearnessAllowance);

        double professionalTax =
                calculateProfessionalTax(grossSalary);

        double netSalary =
                calculateNetSalary(grossSalary, professionalTax);

        displaySalaryDetails(
                employeeId,
                employeeName,
                basicSalary,
                houseRentAllowance,
                dearnessAllowance,
                grossSalary,
                professionalTax,
                netSalary);

        scanner.close();
    }

    public static double calculateHouseRentAllowance(double basicSalary) {
        return basicSalary * 20 / 100;
    }

    public static double calculateDearnessAllowance(double basicSalary) {
        return basicSalary * 10 / 100;
    }

    public static double calculateGrossSalary(
            double basicSalary,
            double houseRentAllowance,
            double dearnessAllowance) {
        return basicSalary
                + houseRentAllowance
                + dearnessAllowance;
    }

    public static double calculateProfessionalTax(double grossSalary) {
        if (grossSalary > 20000) {
            return 200.0;
        }

        return 0.0;
    }

    public static double calculateNetSalary(
            double grossSalary,
            double professionalTax) {
        return grossSalary - professionalTax;
    }

    public static void displaySalaryDetails(
            int employeeId,
            String employeeName,
            double basicSalary,
            double houseRentAllowance,
            double dearnessAllowance,
            double grossSalary,
            double professionalTax,
            double netSalary) {

        System.out.println("\n----- Employee Salary Details -----");
        System.out.println("Employee ID      : " + employeeId);
        System.out.println("Employee Name    : " + employeeName);

        System.out.println("\n----- Salary Breakdown -----");
        System.out.printf(
                "Basic Salary     : ₹%.2f%n",
                basicSalary);

        System.out.printf(
                "HRA (20%%)        : ₹%.2f%n",
                houseRentAllowance);

        System.out.printf(
                "DA (10%%)         : ₹%.2f%n",
                dearnessAllowance);

        System.out.printf(
                "Gross Salary     : ₹%.2f%n",
                grossSalary);

        System.out.printf(
                "Professional Tax : ₹%.2f%n",
                professionalTax);

        System.out.printf(
                "Net Salary       : ₹%.2f%n",
                netSalary);
    }
}
Explanation of the Changes

	•  Renamed hra to houseRentAllowance and da to dearnessAllowance.
	•  This makes it clear that the variables contain rupee amounts rather than percentages.
	•  Each method is also named after the salary value it calculates.
	•  Renamed calculateHRA() to calculateHouseRentAllowance().
	•  The expanded name communicates the calculation's purpose more clearly.
	•  The method still calculates 20% of the basic salary and returns that amount in rupees.
	•  Renamed calculateDA() to calculateDearnessAllowance().
	•  It now clearly calculates the DA rupee amount rather than a percentage.
	•  Added calculateNetSalary().
	•  This keeps net-salary arithmetic outside main().
	•  main() now coordinates input, calculations, and output instead of containing all the formulas.
	•  Used early tax logic:
if (grossSalary > 20000) {
    return 200.0;
}

return 0.0;
•  This removes the unnecessary else block.
	•  It preserves the rule that tax applies only when gross salary is strictly greater than ₹20,000.
	•  Improved method and line formatting.
	•  Long method calls and signatures are easier to read.
	•  Each method has a single responsibility.
	•  Kept the original business rules:
	•  HRA remains 20% of basic salary.
	•  DA remains 10% of basic salary.
	•  Gross salary remains basic salary plus HRA and DA.
	•  Professional tax remains ₹200 only above ₹20,000.
	•  Net salary remains gross salary minus tax.
	•  Kept the original output format.
	•  Prompts, headings, labels, rupee symbols, and two-decimal formatting remain unchanged.
	•  No advanced Java concepts were introduced.
	•  The solution continues to use the same fundamentals: classes, objects, methods, variables, arithmetic, and if.

<h3>Test scenarios</h3>
| Basic Salary (₹) | HRA: 20% (₹) | DA: 10% (₹) | Gross Salary (₹) | Professional Tax (₹) | Net Salary (₹) | |---:|---:|---:|---:|---:|---:| | 10,000.00 | 2,000.00 | 1,000.00 | 13,000.00 | 0.00 | 13,000.00 | | 15,000.00 | 3,000.00 | 1,500.00 | 19,500.00 | 0.00 | 19,500.00 | | 16,000.00 | 3,200.00 | 1,600.00 | 20,800.00 | 200.00 | 20,600.00 | | 50,000.00 | 10,000.00 | 5,000.00 | 65,000.00 | 200.00 | 64,800.00 | | 15,384.62 | 3,076.92 | 1,538.46 | 20,000.00 | 0.00 | 20,000.00 |

<h3>One weakness/error in the AI solution</h3>
One weakness of the AI solution is that rounding errors cause incorrect output when 15384.62 is inputted. The expected outcome is right on the 20000
boundary, but the program yields 19800. This is because in its calculations, the gross income comes out to 20000.06 instead of 20000.00. this means it 
falls below the 20000 boundary and 200 is taken out of it due to taxes.

| # |	Basic (₹) |	HRA (₹) |	DA (₹) |	Gross (₹) |	Tax (₹) |	Expected net (₹) |	Actual net (₹) |	Pass? |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | ---: |
| 1 |	10,000 | 2000 | 1000 | 13000 | 0 | 13000 | 13000 | Yes |							
| 2 |	15,000 | 3000 | 1500 | 19500 | 0 | 19500 | 19500 | Yes |							
| 3 |	16,000 | 3200 | 1600 | 20800 | 200 | 20600 | 20600 | Yes |							
| 4 |	50,000 | 10000 | 5000 | 65000 | 200 | 64800 | 64800 | Yes |							
| 5 |	15384.62 | 3076.92 | 1538.46 | 20000 | 0 | 20000 | 19800 | No |							
