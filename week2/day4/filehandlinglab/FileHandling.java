package week2.day4.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileHandling {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(0, "Alice", "HR", 60000);
		Employee e2 = new Employee(1, "Bob", "Marketing", 72000);
		Employee e3 = new Employee(2, "Christina", "Management", 100000);
		Employee e4 = new Employee(3, "Derek", "Sales", 92000);
		Employee e5 = new Employee(4, "Evelyn", "Recruiting", 80000);
		
		Employee readEmp = null;
		
		Employee[] empArray = {e1, e2, e3, e4, e5};
		
		try (FileOutputStream fos = new FileOutputStream("employees.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				FileInputStream fis = new FileInputStream("employees.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			for (int i = 0; i < empArray.length; ++i) {
				oos.writeObject(empArray[i]);
				
				readEmp = (Employee) ois.readObject();
				System.out.println(readEmp);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
