package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int employeeNum;
		int id;
		boolean loop = true;
		List<Employee> employeeList = new ArrayList();
		
		System.out.print("Enter employees number: ");
		employeeNum = sc.nextInt();
		
		for(int i=1; i<=employeeNum; i++) {
			
			double salary; String name;
			do {
				System.out.print("Enter employee "+i+" id: ");
				id = sc.nextInt();
				sc.nextLine();
				if(!(hasId(employeeList, id))) {
					System.out.println("Id already used!");	
				} else {
					loop = false;
				}
			}while(loop);
			loop = true;
			
			System.out.print("Enter employee "+i+" name: ");
			name = sc.nextLine();
			
			System.out.print("Enter employee "+i+" salary: ");
			salary = sc.nextDouble();
			
			employeeList.add(new Employee(id, name, salary));
				
		}
		
		do {
			double increase;
			System.out.print("Enter an id to receive a salary increase: ");
			id = sc.nextInt();
			if(hasId(employeeList, id)) {
				for(int i = 1; i <= employeeList.size(); i++) {
					if(employeeList.get(i).getId() == id) {
						System.out.print("Enter increase percentage: ");
						employeeList.get(i).salaryIncrease(sc.nextDouble());
						loop = false;
						break;
					}
				}
			} else {
				System.out.println("Invalid Id!");
			}
		}while(loop);
		
		for(Employee x : employeeList) {
			System.out.println(x);
		}
		
		sc.close();
		
		
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		List<Employee> result = list.stream().filter(x -> x.getId() == id).collect(Collectors.toList());
		if(result.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}
	
	

}
