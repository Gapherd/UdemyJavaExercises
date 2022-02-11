package entities;


public class ImportedProduct extends Product {
	
//ATTRIBUTES
	private double customsFee;

	
//CONSTRUCTORS
	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	
//GETS & SETS
	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}
	
//METHODS
	public double totalPrice() {
		return super.getPrice() + customsFee;
	}
	
	@Override
	public String priceTag() {
		return super.getName() + " $ " + totalPrice() + " (Customs fee: $ " + customsFee + ")";
	}
}


