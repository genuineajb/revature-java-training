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

<h3>Copilot's explanation</h3>

<h3>Refactoring</h3>

<h3>Test scenarios</h3>

<h3>One weakness/error in the AI solution</h3>

| # |	Basic (₹) |	HRA (₹) |	DA (₹) |	Gross (₹) |	Tax (₹) |	Expected net (₹) |	Actual net (₹) |	Pass? |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | ---: |
| 1 |	10,000 | 2000 | 1000 | 13000 | 0 | 13000 |  |  |							
| 2 |	15,000 | 3000 | 1500 | 19500 | 0 | 19500 |  |  |							
| 3 |	16,000 | 3200 | 1600 | 20800 | 200 | 20600 |  |  |							
| 4 |	50,000 | 10000 | 5000 | 65000 | 200 | 64800 |  |  |							
| 5 |	15384.62 | 3076.92 | 1538.46 | 20000 | 0 | 20000 |  |  |							
