package week2.day3.vehiclerental;

public class Vehicle {
	
	protected String vehicleNumber;
	protected String model;
	protected int ratePerDay;
	protected int days;
	
	public Vehicle(String vehicleNumber, String model, int ratePerDay, int days) {
		this.vehicleNumber = vehicleNumber;
		this.model = model;
		this.ratePerDay = ratePerDay;
		this.days = days;
	}
	
	public double calculateRent() {
		return ratePerDay * days;
	}
	
	public void displayDetails() {
		System.out.println("Vehicle | " + vehicleNumber + " | " + model + " | Days: " + days + " | Rent: " + calculateRent());
	}
}
