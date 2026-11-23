package questions;

public class Q4 {

	public static void main(String[] args) {
		String age = "25";
		String salary = "45000.75";
		String active = "true";
		
		try {
			// convert age into Integer
			Integer convertedAge = Integer.valueOf(age);
	
			// convert salary into Double
			Double convertedSalary = Double.valueOf(salary);
		
			// convert active into Boolean
			Boolean convertedActive = Boolean.valueOf(active);
		
			// calculate salary after a 10% increment
			Double incrementedSalary = convertedSalary * 1.10;
		
			// print all values and their corresponding data types
			System.out.println("Age, Type: Integer, Value: " + convertedAge);
			System.out.println("Updated Salary, Type: Double, Value: " + incrementedSalary);
			System.out.println("Active, Type: Boolean, Value: " + convertedActive);
		
		} catch (NumberFormatException e) {
			System.out.println("Error: Invalid numeric format: " + e.getMessage());
		}
	}

}
