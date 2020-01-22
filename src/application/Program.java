package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employess: ");
		int x = in.nextInt();
		for (int i = 1; i <= x ; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)");
			char yN = in.next().charAt(0);
			System.out.print("Name: ");
			in.nextLine();
			String name = in.nextLine();
			System.out.print("Hours:");
			int hours = in.nextInt();
			System.out.println("Value per hour: ");
			double valuePerHours = in.nextDouble();
			if (yN == 'y') {
				System.out.print("Addition charge: ");
				double additionalCharge = in.nextDouble();
				Employee emp = new OutsourceEmployee(name, hours, valuePerHours, additionalCharge);
				list.add(emp);
			}else {
				Employee emp = new Employee(name, hours, valuePerHours);
				list.add(emp);
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS");
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		in.close();
	}
}
