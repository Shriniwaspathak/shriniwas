package com.bridgelab.programming.objectorientedprogram.expressiondemonstration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RejexPrograme {

	public static final String string = " Hello <<name>>, We have your full name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016. ";

	public static void main(String args[]) {
		Pattern pattern = Pattern.compile("");
		Matcher matcher = pattern.matcher(string);
		while (matcher.find()) {
			System.out.print(matcher.group());

		}
		Pattern replace=Pattern.compile(
				" Hello <<name>>, We have your full name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016. ");
		Matcher match=replace.matcher(string);
		System.out.println(match.replaceAll(
				" Hello <<pathak>>, We have your full name as <<Shriniwas Pathak>> in our system. your contact number is 91-9006221015. Please,let us know in case of any clarification Thank you BridgeLabz 06/07/2019. "));
	}

}
