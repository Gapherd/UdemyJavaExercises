package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.LegalPerson;
import entities.NaturalPerson;
import entities.Person;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Person> taxPayers = new ArrayList();
		
		System.out.print("Enter the number tax payers: ");
		int numTaxPayers = sc.nextInt();
		
		for(int i = 1; i <= numTaxPayers; i++) {
			System.out.println("Tax payer "+i+" data: ");
				
			System.out.print("Legal or natural person? (l/n)? ");
				char personType;
				boolean loop = true;
				do {
					personType = sc.next().charAt(0);
									  sc.nextLine();
					if(personType == 'l' || personType == 'n') {
						loop = false;
					} else {
						System.out.println("Invalid type!");
					}
				}while(loop);
				
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();
			
			if(personType == 'l') {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				taxPayers.add(new LegalPerson(name, annualIncome, employees));
			} else {
				System.out.print("Health expenditures: ");
				double healthSpent = sc.nextDouble();
				taxPayers.add(new NaturalPerson(name, annualIncome, healthSpent));
			}	
		}
		System.out.println();
		
		double totalTax = 0;
		System.out.println("TAXES PAID:");
		for(Person p : taxPayers) {
			System.out.println(p.getName()+": $ "+String.format("%.2f", p.calcTax()));
			totalTax += p.calcTax();
		}
		System.out.println();
		
		System.out.println("TOTAL TAXES: $ "+String.format("%.2f", totalTax));
	}

}
