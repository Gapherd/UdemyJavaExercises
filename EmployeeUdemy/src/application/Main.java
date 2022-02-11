package application;

import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee joao = new Employee();
		joao.name = "João da Silva";
		joao.grossSalary = 1000;
		joao.tax = 100;
		
		System.out.println(joao.name+"'s Salary: "+joao.netSalary());
		joao.increaseSalary(10);
		System.out.println(joao.name+"'s Salary: "+joao.netSalary());
		
		sc.close();

	}

}
