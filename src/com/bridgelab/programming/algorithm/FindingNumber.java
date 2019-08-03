package com.bridgelab.programming.algorithm;

public class FindingNumber {
	public static void result(int l, int r) {
		int mid = (l + r) / 2;
		if (l == r) {
			System.out.print("Your choosen number is " + r);
			return;

		}
		System.out.println("write false for value between" + l + "and" + mid + "\n write true for value between"
				+ (mid + 1) + "and" + r);
		boolean ch = Input.inputBoolean();
		if (ch) {
			l = mid + 1;
			result(l, r);
		} else {
			r = mid;
			result(l, r);

		}
	}

	public static void main(String[] args) {
		result(0, Input.inputInteger() - 1);

	}

}
