package com.bridgelab.programming.oops.regex.details;

import java.util.Scanner;

import com.bridgelab.algorithm.Input;
import com.bridgelab.programming.oops.regex.implementation.DetailImplementation;
import com.bridgelab.programming.oops.regex.userdetails.UserDetail;

public class Regex  {
	public static void main(String []args) {
		UserDetail user=new UserDetail();
		DetailImplementation detail=new DetailImplementation();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Name");
		String First_Name=Input.inputString();
		
		System.out.println("Enter full Name");
		String full_Name=Input.inputString();
		
		System.out.println("Enter Mobile_Number");
		long Mobile_Number=sc.nextLong();
	}

}
