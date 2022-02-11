package entities;

public class Student {
	
	public double gradeOne;
	public double gradeTwo;
	public double gradeThree;
	
	public double finalGrade() {
		
		return gradeOne + gradeTwo + gradeThree;
		
	}

	public String testPass() {
		
		if(finalGrade() >= 60) {
			return "PASS";
		} else {
			return "FAILED";
		}
		
	}
	
	public double missingPoints() {
		
		double points = 60 - finalGrade();
		if(points >= 0) {
			return points;
		} else {
			return 0.00;
		}
		
	}
}
