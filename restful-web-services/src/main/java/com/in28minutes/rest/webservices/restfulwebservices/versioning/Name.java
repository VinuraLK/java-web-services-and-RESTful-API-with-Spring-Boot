package com.in28minutes.rest.webservices.restfulwebservices.versioning;

public class Name {
	
	private String firstName;
	private String lastname;
	
	public Name() {
	}
	
	public Name(String firstName, String lastname) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastname() {
		return lastname;
	}
	
	
}
