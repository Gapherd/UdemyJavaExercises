package entities;

public class Account {
	
	private final int id;
	private String holderName;
	private double balance;
	private final double tax = 5;
	
	//CONSTRUCTORS
	public Account(int id, String holderName) {
		this.id = id;
		this.holderName = holderName;
	}
	
	public Account(int id, String holderName, double balance) {
		this.id = id;
		this.holderName = holderName;
		deposit(balance);
	}

	//GETS & SETS
	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	
	public int getId() {
		return id;
	}
	//METHODS
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + tax;
	}
	
	public String toString() {
		String data = "Account's ID: "+id+
					  ", Holder: "+holderName+
					  ", Balance: "+balance;
		return data;
	}
	

}
