package com.bridgelabz.programming.function;

import java.util.Scanner;

public class Distance {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		double s=Math.sqrt((x*x1)+(y*y1));
		System.out.print(s);
	}
}
	

	