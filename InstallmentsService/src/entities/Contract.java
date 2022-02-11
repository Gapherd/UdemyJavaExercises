package entities;

import java.util.Calendar;
import java.util.Date;

import services.PaymentService;

public class Contract {
//ATTRIBUTES
	private int number;
	private Date date;
	private double totalValue;
	Installment installments[];
	
//CONSTRUCTOR
	public Contract(int number, Date date, double totalValue, int installNumber) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
		generateInstallments(installNumber);
	}
	
//METHODS
	private void generateInstallments(int installNumber) {
		installments = new Installment[installNumber];
		for(int i = 0; i < installNumber; i++) {
			installments[i] = new Installment();
		}
	}
	
	public String printInstallments() {
		String print = "";
		for(int i = 0; i < installments.length; i++) {
			print += installments[i].toString();
			print += "\n";
		}
		return print;
	}
	
//GETS & SETS
	public double getTotalValue() {
		return totalValue;
	}
	
	public Date getDate() {
		return date;
	}
	
	public Installment[] getInstallments() {
		return installments;
	}
}


