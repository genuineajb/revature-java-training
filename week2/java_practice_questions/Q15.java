package questions;

public class Q15 {
	
	public static void main(String[] args) {
		int id = 101;
		String name = "Rahul";
		String salary = "60000";
		String percentage = "20";
		boolean status = true;
		
		// use wrappers to store id and active status
		Integer employeeId = Integer.valueOf(id);
		Boolean activeStatus = Boolean.valueOf(status);
		
		double basicSalary = 0.0;
		double bonusPercentage = 0.0;
		
		try {
			// convert and handle errors of salary and percentage input
			basicSalary = Double.parseDouble(salary);
			bonusPercentage = Double.parseDouble(percentage);
			if (basicSalary < 0.0 || bonusPercentage < 0.0) {
				throw new IllegalArgumentException("Salary and bonus percentage must be positive.");
			}
		} catch (NumberFormatException e) {
			System.out.println("Invalid salary or bonus input: " + e.getMessage());
			
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid ");
		}
		
		// calculate bonus and final salary
		double bonusAmount = (double) (bonusPercentage / 100) * basicSalary;
		double finalSalary = basicSalary + bonusAmount;
		
		// see if final salary is above 75000
		boolean salaryAbove = false;
		if (finalSalary > 75000.0) {
			salaryAbove = true;
		}
		
		// convert name to uppercase
		String upperName = name.substring(0, 1).toUpperCase() + name.substring(1);
		
		// demonstrate difference between object reference and creating a new object
		StringBuilder reverseBuilder = new StringBuilder(upperName);
		StringBuilder reverseBuilder2 = reverseBuilder;
		
		// reverse the employee name
		String reversedName = reverseBuilder.reverse().toString();
		
		System.out.println("Same object referenced should yield equality: " + (reverseBuilder == reverseBuilder2));
		System.out.println("New object created, should yield false: " + (reverseBuilder == new StringBuilder(name)));
		
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Employee Name: " + name);
		System.out.println("Basic Salary: " + basicSalary);
		System.out.println("Bonus: " + bonusAmount);
		System.out.println("Final Salary: " + finalSalary);
		System.out.println("Active: " + activeStatus);
		System.out.println("Reversed Name: " + reversedName);
		
		if (salaryAbove) {
			System.out.println("Salary above 75000: Yes");
		} else {
			System.out.println("Salary above 75000: No");
		}
		
	}

}
