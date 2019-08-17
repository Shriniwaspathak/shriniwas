package com.bridgelab.programming.datastructure.balanced_parenthesis;

import java.util.Scanner;

public class BalancedParentheses {
	public static void main(String[] args) {
		Stack stack = new Stack();
		Scanner sc = new Scanner(System.in);
		System.out.print("enter expression");
		String expression = sc.next();
		char[] arr = expression.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[') {
				stack.push(arr[i]);

			}
			if (arr[i] == ')' || arr[i] == '}' || arr[i] == ']') {
				stack.pop();

			}

		}

	}

}
