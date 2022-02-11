package entities;

public class Worker {
	
	private static int id = 0;
	private String name;
	private String email;
	private double salary;
	
	public Worker(String name, String email, String salary) {
		this.name = name;
		this.email = email;
		this.salary = Double.parseDouble(salary);
		
		id++;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
