package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.Employee;
import entities.HourContract;
import entities.enums.EmployeeLevel;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		//Employee attributes
		String name;
		String level;
		double baseSalary;
		
		//Contracts attributes
		int contracts;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date;
		double valuePerHour;
		int hours;
		
		//Income attributes
		String monthAndYear;
		int month;
		int year;
		
		System.out.print("Enter department's name: ");
		Department department = new Department(sc.nextLine());
		System.out.println();
		
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Level: ");
		level = sc.nextLine();
		System.out.print("Base salary: ");
		baseSalary = sc.nextDouble();
		System.out.println();
		
		Employee employee = new Employee(name, EmployeeLevel.valueOf(level), baseSalary, department);
		
		System.out.print("How many contracts to this worker? ");
		contracts = sc.nextInt();
		for(int i=1; i <= contracts; i++) {
			System.out.println("Enter contract #"+i+" data:");
			System.out.print("Date (DD/MM/YY): ");
			date = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			valuePerHour = sc.nextDouble();
			System.out.print("Duration: ");
			hours = sc.nextInt();
			
			employee.addContract(new HourContract(date, valuePerHour, hours));
		}
		System.out.println();
		
		System.out.print("Enter month and year to canculate income(MM/YY): ");
		monthAndYear = sc.next();
		month = Integer.parseInt(monthAndYear.substring(0, 2));
		year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: "+employee.getName());
		System.out.println("Department: "+employee.getDepartment().getName());
		System.out.println("Income for "+monthAndYear+": " + String.format("%.2f", employee.income(year, month)));
		sc.close();
		
	}
	
}
