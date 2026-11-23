package week2.day3.vehiclerental;

public class Bike extends Vehicle{
	
	// inheritance: Bike is a subclass of Vehicle
	public Bike(String vehicleNumber, String model, int ratePerDay, int days) {
		super(vehicleNumber, model, ratePerDay, days);
	}

	// Polymorphism: overriding superclass Vehicle's calculateRent
	@Override
	public double calculateRent() {
		// TODO Auto-generated method stub
		return 0.90 * ratePerDay * days;
	}

	// Polymorphism: overriding superclass Vehicle's displayDetails
	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Bike | " + vehicleNumber + " | " + model + " | Days: " + days + " | Rent: " + calculateRent());
	}
	
	
}
