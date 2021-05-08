package ETicaretProje.entities.concretes;

import ETicaretProje.entities.abstracts.Entity;

public class User implements Entity{
	
	private int id;
	private String name;
	private String lastName;
	private String email;
	private double password;
	
	public User() {
		
	}

	public User(int id, String name, String lastName, String email, double password) {
		
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getPassword() {
		return password;
	}

	public void setPassword(double password) {
		this.password = password;
	}
	
	
	
	

}
