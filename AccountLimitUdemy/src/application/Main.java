package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainExecption;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
			int number = sc.nextInt();
						 sc.nextLine();
		System.out.print("Holder: ");
			String holder = sc.nextLine();
		System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
		Account ac = new Account(number, holder, balance, withdrawLimit);
		System.out.println();
		
		do {
			try {
				System.out.print("Enter amount for withdraw: ");
					ac.withdrawl(sc.nextDouble());
				break;
			} catch(DomainExecption e) {
				System.out.println("Withdraw error: "+e.getMessage());
				System.out.println();
			}
		}while(true);
		
		System.out.println("New balance: "+String.format("%.2f", ac.getBalance()));
		
	}

}
