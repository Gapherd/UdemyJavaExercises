package entities;

public class NaturalPerson extends Person{
	
//ATTRIBUTES
	public double healthSpent;
	
//CONSTRUCTORS
	public NaturalPerson(String name, double annualIncome, double healthSpent) {
		super(name, annualIncome);
		this.healthSpent = healthSpent;
	}
	
//GETS & SETS
	public double getHealthSpent() {
		return healthSpent;
	}

	public void setHealthSpent(double healthSpent) {
		this.healthSpent = healthSpent;
	}

//METHODS
	@Override
	public double calcTax() {
		double tax;
		
		if(super.getAnnualIncome() < 2000) {
			tax = super.getAnnualIncome() * 0.15;
		} else {
			tax = super.getAnnualIncome() * 0.25;
		}
		
		tax = tax - (healthSpent * 0.5);
		
		return tax;
	}

}
