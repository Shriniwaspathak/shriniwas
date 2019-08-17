package com.bridgelab.algorithm;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter  day" + " ");
		int date = sc.nextInt();
		System.out.print("enter month" + " ");
		int month = sc.nextInt();
		System.out.print("enter year" + " ");
		int year = sc.nextInt();
		dayOfWeek(date, month, year);
	}

	public static int dayOfWeek(int date, int month, int year) {

		year = year - (14 - month) / 12;
		int x = year + year / 4 - year / 100 + year / 400;
		month = month + 12 * ((14 - month) / 12) - 2;
		date = (date + x + 31 * month / 12) % 7;
		System.out.println("day is" + date);
		String day;
		switch (date) {
		case 0:
			day = "sunday";
			break;
		case 1:
			day = "monday";
			break;
		case 2:
			day = "tuesday";
			break;
		case 3:
			day = "wednesday";
			break;
		case 4:
			day = "thrusday";
			break;
		case 5:
			day = "friday";
			break;
		case 6:
			day = "saturday";
			break;
		default:
			day = "not found";
		}
		System.out.println(day);
		return date;
	}

}
