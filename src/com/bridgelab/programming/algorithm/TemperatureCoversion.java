package com.bridgelab.programming.algorithm;

import java.util.Scanner;

public class TemperatureCoversion {

	public static void main(String args[]) {
		double c, f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Temperature");
		int temp = sc.nextInt();

		switch (temp) {
		case 1:
			System.out.println("Enter fahrenhiet tempreture");
			f = sc.nextDouble();
			c = (f - 32) + 5 / 9;
			System.out.println("tempreture in celsius =" + c);
			break;
		case 2:
			System.out.println("enter celsius tempreture ");
			c = sc.nextDouble();
			f = ((9 * c) / 5) + 32;
			System.out.println("tempreture in fahrenhiet =" + f);
			break;

		}
	}
}
