package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		//Client attributes
		String name;
		String email;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date birthDate;
		
		//Order atrributes
		String status;
		int items;
			//Product attributes
			String productName;
			double productPrice;
			//OrderItem attrbitues
			int quantity;
			
		
		System.out.println("Enter client data: ");
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();
			System.out.print("Birth date (DD/MM/YYYY): ");
			birthDate = sdf.parse(sc.next());
			sc.nextLine();
			System.out.println();
			Client client = new Client(name, email, birthDate);
			
		System.out.println("Enter order data: ");
			System.out.print("Status: ");
			status = sc.nextLine();
			System.out.print("How many items to this order? ");
			items = sc.nextInt();
			sc.nextLine();
			System.out.println();
			Order order = new Order(new Date(), OrderStatus.valueOf(status), client);
			for(int i = 1; i <= items; i++) {
				System.out.println("Enter #"+i+" item data: ");
					System.out.print("Product name: ");
					productName = sc.nextLine();
					System.out.print("Product price: ");
					productPrice = sc.nextDouble();
					Product product = new Product(productName, productPrice);
					
					System.out.print("Quantity: ");
					quantity = sc.nextInt();
					sc.nextLine();
					
					order.addItem(new OrderItem(quantity, productPrice, product));
			}
			System.out.println();
			
			System.out.println(order);
		
		sc.close();

	}

}
