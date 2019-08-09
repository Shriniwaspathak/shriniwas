package com.bridgelab.programming.oops.addressbook;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelab.programming.algorithm.Input;

public class AddressImplement
{
	List<AdressBook> addressObject;
	public void add() throws JsonParseException, JsonMappingException, IOException {
		
		  System.out.println("welcome to AddressBook  :");
		  AddressChanging change = new AddressChanging();
          Scanner sc=new Scanner (System.in);
		   addressObject = change.readFromJson();
	    	AdressBook addressBook = new AdressBook();

			System.out.println("Enter your First Name :");
			String firstname = Input.inputString();
			addressBook.setFirst_name(firstname);
			
			System.out.println("Enter your Last Name :");
			String lastname = Input.inputString();
			addressBook.setLast_name(lastname);
			
			System.out.println("Enter your Address :");
			String address = Input.inputString();
			addressBook.setAddress(address);
			
			System.out.println("Enter your city Name :");
			String town = Input.inputString();
			addressBook.setCity(town);
			
			System.out.println("Enter your State Name :");
			String statename = Input.inputString();
			addressBook.setState(statename);
			
			System.out.println("Enter your zip code :");
			int pincode = Input.inputInteger();
			addressBook.setZipcode(pincode);
			
			System.out.println("Enter your phone number  :");
			long phonenumber =sc.nextLong();
			addressBook.setPhone_number(phonenumber);
			
		     addressObject.add(addressBook);
		   change.addToJson(addressObject);
		
	}
	public void edit(long phone_number) throws JsonParseException, JsonMappingException, IOException {
		AddressChanging change=new AddressChanging();
		//AdressBook addressbook=new AdressBook();
			 Scanner sc=new Scanner(System.in);
			 addressObject=change.readFromJson();
		for(AdressBook book:addressObject) {
			if(book.getPhone_number()==phone_number) {
				
			
				System.out.println("Enter your Address :");
				String address = Input.inputString();

				System.out.println("Enter your city Name :");
				String town = Input.inputString();

				System.out.println("Enter your State Name :");
				String statename = Input.inputString();

				System.out.println("Enter your zip code :");
				int pincode = Input.inputInteger();
			

				AdressBook book1 = new AdressBook();
				
				book1.setAddress(address);
				book1.setCity(town);
				book1.setState(statename);
				book1.setZipcode(pincode);
				
			}
			
		}change.addToJson(addressObject);
		
	}
	
	
	public static void main(String[] arg) throws JsonGenerationException, JsonMappingException, IOException {
            Scanner sc=new Scanner(System.in);
		  System.out.println("welcome to AddressBook  :");
		  AddressImplement addimp=new AddressImplement();
		  System.out.print("choose ::1 for Add \n choose::2 for edit ");
		  int choose=Input.inputInteger();
		  switch(choose) {
		  case 1:
			  System.out.println("you have chose add");
			  addimp.add();
			  break;
		  case 2:
			  System.out.println("you have chose edit");
			  System.out.println("Enter phone number");
			  long phone_number=sc.nextLong();
			  addimp.edit(phone_number)  ;
			  break;
		  }
		 
}
}
