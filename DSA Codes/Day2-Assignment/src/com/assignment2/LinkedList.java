package com.assignment2;

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

	public void merge(LinkedList l2) {
		if (head == null) {
			head = l2.head;
			return;
		}
		Node temp1 = head;
		Node trace = head;
		Node temp2 = l2.head;

		while (l2.head!= null) {
			l2.head = l2.head.getNext();
			trace = trace.getNext();
			temp1.setNext(temp2);
			temp2.setNext(trace);
			temp1 = temp1.getNext().getNext();
			temp2 = l2.head;
			if (trace.getNext() == null) {
				trace.setNext(l2.head);
				return;
			}
		}
	}
}
