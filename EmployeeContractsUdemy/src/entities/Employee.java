package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;

import entities.enums.EmployeeLevel;

public class Employee {
	
//ATTRIBUTES
	private String name;
	private EmployeeLevel level;
	private double baseSalary;
	//COMPOSITIONS
	private Department department;
	private List<HourContract> contracts = new ArrayList<HourContract>();
	
//CONSTRUCTORS
	public Employee(String name, EmployeeLevel level, double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	
//GETS & SETS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public EmployeeLevel getLevel() {
		return level;
	}
	public void setLevel(EmployeeLevel level) {
		this.level = level;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public List<HourContract> getContracts(){
		return contracts;
	}
	
//METHODS
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		double incomeTotal = baseSalary;
		Calendar calendar = Calendar.getInstance();
		
		for(HourContract c : contracts) {
			calendar.setTime(c.getDate());
			
			if(calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.MONTH) + 1 == month) {
				incomeTotal += c.totalValue();
			}
		}
		
		return incomeTotal;
	}
	

}
