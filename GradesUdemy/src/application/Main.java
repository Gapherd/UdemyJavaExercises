package application;

import entities.Student;

public class Main {

	public static void main(String[] args) {
		
		Student maria = new Student();
		
		maria.gradeOne = 30.0;
		maria.gradeTwo = 34.0;
		maria.gradeThree = 35.0;
		
		System.out.println("Maria's final grade: "+maria.finalGrade());
		System.out.println(maria.testPass());
		System.out.println("Missing points: "+maria.missingPoints());
		
		Student joao = new Student();
		
		joao.gradeOne = 15.0;
		joao.gradeTwo = 22.0;
		joao.gradeThree = 7.0;
		
		System.out.println("Joao's final grade: "+joao.finalGrade());
		System.out.println(joao.testPass());
		System.out.println("Missing points: "+joao.missingPoints());

	}

}
