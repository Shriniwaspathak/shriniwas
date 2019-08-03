package com.bridgelab.programming.datastructure.primearray;

//import java.util.Scanner;

public class PrimeArray {
	public static boolean prime(int n) {
		int flag = 0;
		int num = 0;
		for (int i = 1; i <= n; i++) {

			if (n % i == 0) {
				flag++;
			}
		}
		if (flag == 2) {
			return true;
		}
return false;
	}

	public static void main(String[] args) {

		int arr[][] = new int[10][100];
		int num = 0;
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j < 100; j++) {
				if (prime(num)) {
					arr[i][j] = num;
					System.out.print(num + ", ");
				}
				num++;
			}
			System.out.println();
		}

	}
}
