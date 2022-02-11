package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int lines, columns;
		int num, numOcc;

		System.out.print("Enter number of lines: ");
		lines = sc.nextInt();
		System.out.print("Enter number of columns: ");
		columns = sc.nextInt();
		
		int matriz[][] = new int[lines][columns];
		
		for(int l = 0; l < lines; l++) {
			for(int c = 0; c < columns; c++) {
				matriz[l][c] = sc.nextInt();
			}
		}
		
		System.out.print("Enter a number: ");
		num = sc.nextInt();
		for(int l = 0; l < lines; l++) {
			for(int c = 0; c < columns; c++) {
				if(matriz[l][c] == num) {
					System.out.println("Position: "+l+","+c);
					if(c > 0) {
						System.out.println("Left: "+matriz[l][c-1]);
					}
					if(c < matriz[0].length-1) {
						System.out.println("Right: "+matriz[l][c+1]);
					}
					if(l < matriz.length-1) { 
						System.out.println("Down: "+matriz[l+1][c]);
					}
					if(l > 0) {
						System.out.println("Up: "+matriz[l-1][c]);
					}
				}
			}
		}
		
		
		sc.close();
	}

}
