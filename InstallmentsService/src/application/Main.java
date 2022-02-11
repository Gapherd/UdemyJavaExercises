package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Contract;
import services.ContractService;
import services.PaypalService;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");;
		
		System.out.println("Enter contract data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = new Date();
		date = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		double contractValue = sc.nextDouble();
		System.out.print("Enter number of installments: ");
		int installNum = sc.nextInt();
		
		Contract con = new Contract(number, date, contractValue, installNum);
		ContractService cs = new ContractService(new PaypalService());
		cs.processContract(con, con.getInstallments().length);
		
		System.out.println("Installments: ");
		System.out.println(con.printInstallments());
		sc.close();
	}

}
