package com.assigment2;

public class LinkedList {
	private Node head;

	public LinkedList() {
		this.head = null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public boolean insert(int data) {
		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
			return true;
		}
		Node temp = head;

		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(newnode);
		return true;
	}

	public void display() {
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}

	public void middleEle() {
		if (head == null) {
			System.out.println("Stack is empty!");
			return;
		}

		Node temp = head;
		Node mid = head;
		int count = 1;
		while (temp.getNext() != null) {
			temp = temp.getNext();
			count++;
			if (count % 2 != 0) {
				mid = mid.getNext();
			}
		}
		if (count % 2 == 0) {
			System.out.println(mid.getData() + " " + mid.getNext().getData());
		} else {
			System.out.println(mid.getData());
		}
	}
}
