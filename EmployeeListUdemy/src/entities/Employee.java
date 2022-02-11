package entities;

public class Employee {
	//VARIABLES
	private int id;
	private String name;
	private double salary;
	
	//CONSTRUCTORS
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	//GETS & SETS
	public int getId() {
		return id;
	}

	//METHODS
	public String toString() {
		return "Id: "+id+", "+
			   "Name: "+name+", "+
			   "Salary: "+salary;
	}
	
	public void salaryIncrease(double increase) {
		increase = increase/100;
		salary = salary + (salary*increase);
	}
}
