package com.bridgelab.programming.functional;

import java.util.Scanner;

public class LeapYear {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter any year");
		int year = sc.nextInt();
		boolean flag = false;
		if (year % 400 == 0) {
			flag = true;
		} else if (year % 100 == 0) {
			flag = false;
		} else if (year % 4 == 0) {
			flag = true;
		} else {
			flag = false;

		}
		if (flag) {
			System.out.print(year + "Year is leap year");
		} else {
			System.out.print(year + "Year is not leap year");
		}

	}

}
