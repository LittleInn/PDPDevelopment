package com.pdp.reflection.development.deepcopy;

public class Employee extends User{
	private double salary;
	private int rate;
	protected String place;
	public String position;
	private Address address;
	public Employee( String name, String email, String personalNumber,
			double salary, String place, String position, Integer rate) {
		super(name, email, personalNumber);
		this.salary = salary;
		this.place = place;
		this.position = position;
		this.rate=rate;
	}
	public Employee(String name, String email, String personalNumber,
			double salary, String place, String position, Address address) {
		super(name, email, personalNumber);
		this.salary = salary;
		this.place = place;
		this.position = position;
		this.address=address;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Integer getRate() {
		return rate;
	}
	public void setRate(Integer rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", place=" + place
				+ ", position=" + position + ", address=" + address
				+ ", email=" + email + ", personalNumber=" + personalNumber
				+ "]";
	}
	
}
