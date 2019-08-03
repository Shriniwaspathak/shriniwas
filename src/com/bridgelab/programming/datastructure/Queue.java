package com.bridgelab.programming.datastructure;

public class Queue {
	int queue[] = new int[10];
	int size;
	int front;
	int rear;

	public void enqueue(int data) {
		queue[rear] = data;
		rear++;
		size++;
	}

	public void show() {
		for (int i = 0; i < size; i++) {
			System.out.println(queue[front + i] + " ");
		}

	}

	public int dequeue() {
		int data = queue[front];
		front++;
		size--;
		return data;
	}

	public boolean isEmpty() {
		return front <= 0;
	}

	public int size() {
		return rear;
	}

	public void deposite(int amount) {
		int balance = 10000;
		int bankbalance = balance + amount;
		System.out.print(bankbalance + " ");

	}

	public void widrowal(int amount) {
		int balance = 10000;
		int bankbalance = balance - amount;
		System.out.print(bankbalance + " ");
	}

}
