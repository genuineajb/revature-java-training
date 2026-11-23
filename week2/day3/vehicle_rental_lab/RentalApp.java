package week2.day3.vehiclerental;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class RentalApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of vehicles: ");
		int numVehicles = sc.nextInt();
		sc.nextLine();
		
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		
		for (int i = 0; i < numVehicles; ++i) {
			boolean flag = false;
			int type = 0;
			while (!flag) {
				System.out.println("Enter type (1-Car, 2-Bike): ");
				type = sc.nextInt();
				if (type == 1 || type == 2) {
					flag = true;
				}
			}
			sc.nextLine();
			
			System.out.println("Enter Vehicle Number: ");
			String vehicleNumber = sc.nextLine();
			
			System.out.println("Enter Model: ");
			String model = sc.nextLine();
			
			System.out.println("Enter Rate per day: ");
			int rate = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Days: ");
			int days = sc.nextInt();
			sc.nextLine();
			
			int insurance = 0;
			if (type == 1) {
				System.out.println("Enter Insurance per Day: ");
				insurance = sc.nextInt();
				sc.nextLine();
			}
			
			if (type == 1) {
				Car c = new Car(vehicleNumber, model, rate, days, insurance);
				vehicles.add(c);
			} else {
				Bike b = new Bike(vehicleNumber, model, rate, days);
				vehicles.add(b);
			}
		}
		
		System.out.println("--- Rental Details ---");
		double totalRent = 0.0;
		
		for (int i = 0; i < vehicles.size(); ++i) {
			totalRent += vehicles.get(i).calculateRent();
			
			// Runtime polymorphism used here. Depending on the type
			// of the vehicle, either Car.displayDetails() or Bike.displayDetails()
			// will be called.
			vehicles.get(i).displayDetails();
		}
		
		System.out.println("Total Rent Collected: " + totalRent);
		
		sc.close();
	}

}
