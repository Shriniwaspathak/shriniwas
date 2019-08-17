package com.bridgelab.programming.datastructure.palindrome_checker;

public class PalindromeCheaker {
	public static void main(String args[]) {
		Deque dq = new Deque();
		boolean result = dq.result();
		if (result == true)
			System.out.print("string is palindrome:");
		else
			System.out.print("string is not palindrome:");

	}

}
