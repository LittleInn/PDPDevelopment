package com.pdp.reflection.development.deepcopy;

public class User{
	private String name;
	protected String email;
	public String personalNumber;
	public User(String name, String email, String personalNumber) {
		this.name = name;
		this.email = email;
		this.personalNumber = personalNumber;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", personalNumber="
				+ personalNumber + "]";
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
	public String getPersonalNumber() {
		return personalNumber;
	}
	public void setPersonalNumber(String personalNumber) {
		this.personalNumber = personalNumber;
	}
	
}
