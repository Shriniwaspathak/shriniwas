package com.bridgelab.algorithm;

public class VendingMachine {
	public static void countNote(int amount) {
		int[] notes = { 1000, 500, 100, 50, 10, 5, 2, 1 };
		int[] noteCounter = new int[8];
		for (int i = 0; i < 8; i++) {
			if (amount >= notes[i]) {
				noteCounter[i] = amount / notes[i];
				amount = amount - noteCounter[i] * notes[i];

			}
		}
		System.out.println("counting of notes");
		for (int i = 0; i < 8; i++) {
			if (noteCounter[i] != 0) {
				System.out.println(notes[i] + " " + noteCounter[i]);

			}
		}
	}

	public static void main(String args[]) {
		int amount = 563;
		countNote(amount);
	}
}