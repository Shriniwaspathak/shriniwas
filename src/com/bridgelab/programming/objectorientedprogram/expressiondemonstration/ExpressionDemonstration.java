package com.bridgelab.programming.objectorientedprogram.expressiondemonstration;
import java.util.regex.*;  
public class ExpressionDemonstration {
	public static void main (String args[]) {
		String content=" Hello Rishu, We have your full name as shriniwas in our system. your contact number is 91-9006221015. Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016. ";
	    String pattern=(".*Rishu.*"+".*3456789.*");
	  
	    boolean isMatch = Pattern.matches(pattern, content);
	    System.out.print("show answer " + isMatch);
	    
	}

}
