package application;

import java.util.Scanner;

import entities.Account;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean greaterLoop = true;
		Account ac1;
		
		while(greaterLoop) {
		
			int id;
			double amount = 0;
			String holderName;
			boolean loop = true;
			
			System.out.print("Enter account number: ");
			id = sc.nextInt();
			System.out.print("Enter account holder: ");
			sc.nextLine();
			holderName = sc.nextLine();
			do{
				System.out.print("Is there a initial deposit (y/n)? ");
				switch(sc.next()){
					case "y": 
						System.out.print("Enter initial deposit: ");
						amount = sc.nextDouble();
						loop = false;
						break;
					case "n": 
						loop = false;
						break;
					default:
						System.out.println("Invalid answer.");
						break;
				}
			}while(loop);
			loop = true;
			
			ac1 = new Account(id, holderName, amount);
			System.out.println("");
			System.out.println(ac1);
			System.out.println("");
			
			System.out.print("Enter a deposit: ");
			ac1.deposit(sc.nextDouble());
			
			System.out.println("");
			System.out.println(ac1);
			System.out.println("");
			
			System.out.print("Enter a withdraw: ");
			ac1.withdraw(sc.nextDouble());
			
			System.out.println("");
			System.out.println(ac1);
			System.out.println("");
			
			do{
				System.out.print("Enter a new account (y/n)? ");
				switch(sc.next()){
					case "y": 
						loop = false;
						break;
					case "n": 
						loop = false;
						greaterLoop = false;
						break;
					default:
						System.out.println("Invalid answer.");
						break;
				}
			}while(loop);
			loop = false;
			
		}
		
		sc.close();

	}

}
