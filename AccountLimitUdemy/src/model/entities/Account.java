package model.entities;

import model.exceptions.DomainExecption;

public class Account {
//ATTRIBUTES
	private int number;
	private String holder;
	private double balance;
	private double withdrawLimit;
	
//CONSTRUCTOR
	public Account(int number, String holder, double balance, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}	
	
//GETS & SETS
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getWithdrawLimit() {
		return withdrawLimit;
	}
	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
//METHODS
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdrawl(double amount) {
		if(amount > balance) {
			throw new DomainExecption("not enough balance");
		} else if(amount > withdrawLimit) {
			throw new DomainExecption("the amount exceeds withdraw limit");	
		}
		
		this.balance -= amount;
	}
	
}
