package application;

import java.util.Scanner;

import entities.Student;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		boolean loop = true;
		int students;
		Student[] rents = new Student[9];
		
		do {
			System.out.print("Enter the number of students: ");
			students = sc.nextInt();
			if(students > 0 && students <= 10){
				loop = false;
			} else {
				System.out.println("Invalid number!");
			}
			
		}while(loop);
	
			
		for(int i = 0; i < students; i++) {
			loop = true;
			int room;
			do {
				System.out.print("Student "+(i+1)+" room: ");
				room = sc.nextInt();
				if(rents[room] == null) {
					loop = false;
				} else {
					System.out.println("Room already ocuppied!");
				}
			}while(loop);
			sc.nextLine();
			rents[room] = new Student();
			rents[room].room = room;
			
			System.out.print("Enter student's name: ");
			rents[room].name = sc.nextLine();
			System.out.print("Enter student's email: ");
			rents[room].email = sc.nextLine();
		}
		
		for(Object obj : rents) {
			if(obj != null) {
				System.out.println(obj);
			}
		}

		sc.close();
	}

}
