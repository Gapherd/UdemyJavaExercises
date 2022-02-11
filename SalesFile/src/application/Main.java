package application;

import java.util.Scanner;

import entities.SalesReader;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the gross sales file path: ");
		String strPath = sc.next();
		
		SalesReader grossSale = new SalesReader(strPath);
		
		sc.close();
				
	}
	
}

/*
String path = "C:\\TempJava\\in.txt";

try (BufferedReader br = new BufferedReader(new FileReader(path))) {
	String line = br.readLine();
	
	while(line != null) {
		System.out.println(line);
		line = br.readLine();
	}
} catch(IOException e) {
	System.out.println("Error: " + e.getMessage());
} 
*/