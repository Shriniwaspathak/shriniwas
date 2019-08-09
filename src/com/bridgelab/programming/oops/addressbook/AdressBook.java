package com.bridgelab.programming.oops.addressbook;

public class AdressBook {
    public 	String first_name;
	public String last_name;
	public String Address;
	public String city;
	public String state;
	public int zipcode;
	public long phone_number;
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
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
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}
	@Override
	public String toString() {
		return "AdressBook [first_name=" + first_name + ", last_name=" + last_name + ", Address=" + Address + ", city="
				+ city + ", state=" + state + ", zipcode=" + zipcode + ", phone_number=" + phone_number + "]";
	}
	

}
