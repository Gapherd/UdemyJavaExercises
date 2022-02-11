package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {
//ATTRIBUTES
	private Date dueDate;
	private Double amount;
	
	
//CONSTRUCTORS
	public Installment() {
	}
	
	public Installment(Date dueDate, Double amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}
	
//METHODS
	@Override
	public String toString() {
		String print = "";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		print += sdf.format(dueDate);
		print += " "+String.format("%.2f", amount);
		return print;
	}
	
//GETS & SETS
	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
}
