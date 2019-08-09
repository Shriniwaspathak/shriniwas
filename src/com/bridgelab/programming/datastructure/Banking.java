package com.bridgelab.programming.datastructure;

import java.util.Scanner;

public class Banking {
	//Queue queue = new Queue();

	public static void main(String arg[]) {
		Queue queue = new Queue();
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a person in queue");

		int[] person = new int[5];
		for (int i = 0; i < person.length; i++) {
			person[i] = sc.nextInt();
			queue.enqueue(person[i]);
		}
		for (int j = 0; j < person.length; j++) {
			System.out.println("choose 1: for deposite \n choose 2 :for widrowal");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("enter amount for deposite");
				int money = sc.nextInt();
				queue.deposite(money);
                System.out.println();
                queue.dequeue();
                queue.show();
	              break;
			case 2:
				System.out.println("enter amount for widrowal");
				int money2 = sc.nextInt();
				queue.widrowal(money2);
				  System.out.println();
				  queue.dequeue();
				break;
				
			}
		}

	}

}
