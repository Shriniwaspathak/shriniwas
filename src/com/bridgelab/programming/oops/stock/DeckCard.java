package com.bridgelab.programming.oops.stock;

import java.util.ArrayList;
import java.util.Random;

public class DeckCard {
	public static void main(String args[]) {
		Random random = new Random();
		String suit[] = { "club", "diamond", "heart", "spades" };
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

		String[] player1 = new String[9];
		String[] player2 = new String[9];
		String[] player3 = new String[9];
		String[] player4 = new String[9];

		String[] totalcard = new String[52];
		int k = 0;
		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < rank.length; j++) {

				totalcard[k] = suit[i] + " " + rank[j];
				k++;
			}
		}
		int i = 0;
		int generate = 0;
		ArrayList<Integer> number = new ArrayList<>();
		while (i < 9) {

			do {
				generate = random.nextInt(52);
			} while (number.contains(generate));
			player1[i] = totalcard[generate];
			number.add(generate);

			do {
				generate = random.nextInt(52);
			} while (number.contains(generate));
			player2[i] = totalcard[generate];
			number.add(generate);

			do {
				generate = random.nextInt(52);
			} while (number.contains(generate));
			player3[i] = totalcard[generate];
			number.add(generate);

			do {
				generate = random.nextInt(52);
			} while (number.contains(generate));
			player4[i] = totalcard[generate];
			number.add(generate);

			i++;
		}
		System.out.println();
		System.out.println("for player1");
		System.out.println();
		for (int j = 0; j < 9; j++) {
			
			System.out.println(player1[j]);
		}
		System.out.println();
		System.out.println("for player2");
		System.out.println();
		for (int j = 0; j < 9; j++) {
			System.out.println(player2[j]);
		}
		System.out.println();
		System.out.println("for player3");
		System.out.println();
		for (int j = 0; j < 9; j++) {
			System.out.println(player3[j]);
		}
		System.out.println();
		System.out.println("for player4");
		System.out.println();
		for (int j = 0; j < 9; j++) {
			System.out.println(player4[j]);
		}
	}

}
