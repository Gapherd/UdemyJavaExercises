package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
//ATRIBUTES
	private Date manufactureDate;
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

//CONSTRUCTORS
	public UsedProduct(String name, double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
//GETS & SETS
	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
//METHODS
	@Override
	public String priceTag() {
		return super.getName() + " (used) $ " + super.getPrice() + " (Manufacture date: " + sdf.format(manufactureDate) + ")";
	}

}
