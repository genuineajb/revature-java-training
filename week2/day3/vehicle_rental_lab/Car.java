package week2.day3.vehiclerental;

// inheritance: Car is a subclass of Vehicle
public class Car extends Vehicle{
	
	private int dailyInsurance;
	
	public Car(String vehicleNumber, String model, int ratePerDay, int days, int dailyInsurance) {
		super(vehicleNumber, model, ratePerDay, days);
		this.dailyInsurance = dailyInsurance;
	}

	// Polymorphism: overriding superclass Vehicle's calculateRent
	@Override
	public double calculateRent() {
		// TODO Auto-generated method stub
		return (ratePerDay * days) + (days * dailyInsurance);
	}

	// Polymorphism: overriding superclass Vehicle's displayDetails
	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Car | " + vehicleNumber + " | " + model + " | Days: " + days + " | Rent: " + calculateRent());
	}
	
	
}
