package com.bootcamp.demo;

public class Person {
	private String firstName;
	private String lastName;
	private String address;

	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public void getAddress(){
		return address;
	}
}
