package application;

import java.util.Scanner;

import entities.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Double dollarPrice;
		Double dollars;
		
		System.out.print("What's the dollar price? ");
		dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars? ");
		dollars = sc.nextDouble();
		
		System.out.printf("Amount to be paid: %.2f", CurrencyConverter.convert(dollarPrice, dollars));

		sc.close();
	}

}
