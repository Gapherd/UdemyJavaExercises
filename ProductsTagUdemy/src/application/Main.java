package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		int numProducts;
		List<Product> productList = new ArrayList();
		
		System.out.print("Enter the number of products: ");
		numProducts = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= numProducts; i++) {
			boolean loop = true;
			System.out.println("Product #"+(i)+" data:");
			do {
				System.out.print("Common, used or imported (c/u/i)? ");
					String prodType = sc.nextLine();
				System.out.print("Name: ");
					String name = sc.nextLine();
				System.out.print("Price: ");
					double price = sc.nextDouble();
								   sc.nextLine();
				switch(prodType){
					case "c":
						productList.add(new Product(name, price));
						loop = false;
						break;
					case "u":
						System.out.print("Manufacture date (DD/MM/YYYY): ");
						SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
						Date date = sdf.parse(sc.next());
									sc.nextLine();
						productList.add(new UsedProduct(name, price, date));
						loop = false;
						break;
					case "i":
						System.out.print("Custom fee: ");
						double customFee = sc.nextDouble();
										   sc.nextLine();
						productList.add(new ImportedProduct(name, price, customFee));
						loop = false;
						break;
					default:
						System.out.println("Invalid product type!");
						break;
				}	
			}while(loop);
		}
		
		System.out.println("PRICE TAGS:");
		for(Product product : productList) {
			System.out.println(product.priceTag());
		}
		
	}

}
