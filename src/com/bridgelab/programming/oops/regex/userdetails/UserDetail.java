package com.bridgelab.programming.oops.regex.userdetails;

public class UserDetail {
	
	String firstName;
	String fullName;
	String mobileNumber;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "UserDetail [firstName=" + firstName + ", fullName=" + fullName + ", mobileNumber=" + mobileNumber + "]";
	}
    	

}
