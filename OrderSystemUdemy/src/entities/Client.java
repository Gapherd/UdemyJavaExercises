package entities;

import java.util.Date;

public class Client {
	
//ATTRIBUTES
	private String name;
	private String email;
	private Date birthDate;
	
//CONSTRUCTORS
	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}
	
//GETS & SETS
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
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

//METHODS
	public String toString() {
		return name + " " + birthDate + " - " + email;
	}
	
}
