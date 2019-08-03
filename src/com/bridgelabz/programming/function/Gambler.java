package com.bridgelabz.programming.function;

import java.util.Scanner;

public class Gambler {
	public static double gen() {
		double d = Math.random();
		return d;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stake;
		int goal;
		int time;
		System.out.print("enter the number");
		stake = sc.nextInt();
		goal = sc.nextInt();
		time = sc.nextInt();
		sc.close();
		int win = 0;
		int loss = 0;
		for (int i = 0; i <= time; i++) {
			if (stake > 0 && stake < goal) {
				double r = gen();
				if (r < 0.5) 
				{
					stake++;
					if(stake==goal)
					win++;

				} else 
				{
					stake--;
					loss++;

				}

			}
		}
		System.out.println(win);
		System.out.println((win * 100.0) / time);
		System.out.println((loss * 100.0) / time);
	}

}
