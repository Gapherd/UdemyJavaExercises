package entities;

public abstract class Person {

//ATTRIBUTES
	private String name;
	private double annualIncome;
	
//CONSTRUCTORS
	public Person(String name, double annualIncome) {
		this.name = name;
		this.annualIncome = annualIncome;
	}
	
//GETS & SETS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	
//METHODS
	public abstract double calcTax();
	
}
