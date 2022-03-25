package com.AddressBook_Workshop;

public class Contacts {

	public String firstName;
	public String lastName;
	public String address;
	public String city;
	public String state;
	public String zip;
	public String phnno;
	public String emailId;

	// Used Parameterized Constructor

	public Contacts(String firstName, String lastName, String address, String city, String state, String zip,
			String phno, String emailId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phnno = phno;
		this.emailId = emailId;
	}

	// used getters and setters to set and get values.

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhNo() {
		return phnno;
	}

	public void setPhNo(String phno) {
		this.phnno = phno;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "AddressBook [ FirstName : " + firstName + ", LastName : " + lastName + ", Address : " + address
				+ ", City : " + city + ", State : " + state + ", Zip : " + zip + ", PhoneNumber : " + phnno
				+ ", Email : " + emailId + " ]";
	}

}
