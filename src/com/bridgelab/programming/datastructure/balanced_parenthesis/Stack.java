package com.bridgelab.programming.datastructure.balanced_parenthesis;

public class Stack {
	char[] stack = new char[20];
	int top = 0;

	public void push(char data) {
		stack[top] = data;
		top++;

	}

	public int pop() {
		char data;
		top--;
		data = stack[top];
		stack[top] = 0;
		return data;

	}

	public int peek() {
		char data;
		data = stack[top];
		return data;

	}

	public void show() {
		for (int i = 0; i <= top - 1; i++) {
			System.out.println(stack[i] + " ");
		}
	}

	public boolean isEmpty() {
		return top <= 0;

	}

	public int size() {
		return top;
	}

	static boolean isMatching(char character1, char character2) {
		if (character1 == '(' && character2 == ')')
			return true;
		else if (character1 == '{' && character2 == '}')
			return true;
		else if (character1 == '[' && character2 == ']')
			return true;
		else
			return false;
	}

}
