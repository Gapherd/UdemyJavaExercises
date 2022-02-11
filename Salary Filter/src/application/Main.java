package application;

import java.util.List;
import java.util.Scanner;

import entities.Worker;
import services.WorkerReader;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		WorkerReader workersFile;
		List<Worker> filteredWorkers;
		
		System.out.print("Enter full file path: ");
		workersFile = new WorkerReader(sc.nextLine());
		
		Double salary;
		System.out.print("Enter salary: ");
		salary = sc.nextDouble();
		System.out.println("Email of people whose salary is more than "+String.format("%.2f", salary)+":");
			filteredWorkers = workersFile.getWorkers().stream()
				.filter(x -> x.getSalary() > salary)
				.sorted((x1, x2) -> x1.getName().toUpperCase().compareTo(x2.getName().toUpperCase()))
				.toList();
				for(Worker worker : filteredWorkers) {
					System.out.println(worker.getEmail());
				}
			
		double sum = 0;
		System.out.print("Sum of salary of people whose name starts with 'M': ");
			filteredWorkers = workersFile.getWorkers().stream()
					.filter(x -> x.getName().toUpperCase().charAt(0) == 'M')
					.toList();
			for(Worker worker : filteredWorkers) {
				sum += worker.getSalary();
			}
			System.out.print(String.format("%.2f", sum));
		
		sc.close();
		
	}

}
