package entities;

public class LegalPerson extends Person {
	
//ATTRIBUTES
	private int employees;
	
//CONSTRUCTORS
	public LegalPerson(String name, double annualIncome, int employees) {
		super(name, annualIncome);
		this.employees = employees;
	}
	
//GETS & SETS
	public int getEmployees() {
		return employees;
	}
	public void setEmployees(int employees) {
		this.employees = employees;
	}

//METHODS
	@Override
	public double calcTax() {
		double tax;
		
		if(employees <= 10) {
			tax = super.getAnnualIncome() * 0.16;
		} else {
			tax = super.getAnnualIncome() * 0.14;
		}
		
		return tax;
	}

}
