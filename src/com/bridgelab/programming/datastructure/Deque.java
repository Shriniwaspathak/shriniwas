package com.bridgelab.programming.datastructure;

import java.util.Scanner;

public class Deque {
	char deque[] = new char[5];
	int size;
	int front;
	int rear;

	public void enqueue(char data) {
		deque[rear] = data;
		rear++;
		size++;
	}

	public boolean isEmpty() {
		return front <= 0;
	}

	public int size() {
		return rear;
	}

	public int removefront() {
		char data = deque[front];
		front++;
		size--;
		return data;
	}

	public int removeRear() {
		char data = deque[rear];
		rear++;
		size--;
		return data;
	}

	public boolean result() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String name = sc.next();
		char[] name1 = name.toCharArray();

		int length = name1.length;
		for (int i = 0; i < length; i++) {
			if (name1[i] == name1[length - 1 - i]) {
				return true;

			}

		}
		return false;

	}

}
