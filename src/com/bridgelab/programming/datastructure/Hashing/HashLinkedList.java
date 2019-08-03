package com.bridgelab.programming.datastructure.Hashing;

class Hash {
	int data;
	Hash next;
}

public class HashLinkedList {
	private Hash head;
	Hash next;
	private int size = 0;

	public void add(int n) {
		Hash node = new Hash();
		if (head == null) {
			node.data = n;
			head = node;
		} else {
			Hash temp = head;
			while (temp.next != null) {
				temp = temp.next;

			}
			temp.next = node;
			node.data = n;
			size++;
		}
	}

	public void remove(int n) {
		Hash node = head;
		Hash prev = null;
		if (head.data == n) {
			head = head.next;
			size--;
		} else {
			while (node.data != n) {
				prev = node;
				node = node.next;
			}
			node = node.next;
			prev.next = node;
			node = null;
			size--;
		}
	}

	public void show() {
		Hash temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public void search(int n) {
		Hash temp = head;
		while (temp != null) {
			if (temp.data == n) {
				System.out.print("found");
				break;
			}
			temp = temp.next;
		}
	}

	public void isEmpty() {
		Hash temp = head;
		if (head == null) {
			System.out.print("list is empty");

		} else {
			System.out.print("list is not empty");
		}
	}

	public void removeAtLast(int n) {
		Hash temp = head;
		Hash prev = null;
		while (temp.next != null) {
			prev = temp;
			temp = temp.next;
		}
		System.out.print("something");
		prev.next = null;
		size--;

	}

	public void sort() {
		Hash current = head;
		Hash index = null;
		int temp;
		if (head == null) {
			return;
		} else {
			while (current != null) {
				index = index.next;
				while (index != null) {
					if (current.data > index.data) {
						temp = current.data;
						current.data = index.data;
						index.data = temp;
					}
					index = index.next;

				}
				current = current.next;
			}
		}
	}

}
