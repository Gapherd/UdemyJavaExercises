package application;

import java.util.Scanner;

import entities.Rectangle;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Rectangle rec = new Rectangle();
		
		System.out.println("Enter rectangle's width: ");
		rec.width = sc.nextDouble();
		
		System.out.println("Enter rectangle's height: ");
		rec.height = sc.nextDouble();
		
		System.out.println("Rectangle's area: "+rec.Area());
		System.out.println("Rectangle's perimeter: "+rec.Perimeter());
		System.out.println("Rectangle's diagonal: "+rec.Diagonal());
		
		sc.close();

	}

}
