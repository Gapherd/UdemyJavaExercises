package entities;

import java.util.Date;

public class HourContract {

//ATTRIBUTEs
	private Date date;
	private double valuePerHour;
	private int hours;
	
//CONSTRUCTORS
	public HourContract(Date date, double valuePerHour, int hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

//GETS & SETS
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
	
//METHODS
	public double totalValue() {
		return valuePerHour * hours;
	}
	
}
