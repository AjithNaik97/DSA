package com.singlyll;

import java.util.Stack;

public class LinkedList {
	private Node head;

	public Node getHead() {
		return head;
	}

	// default constructor to set the head as null for an empty list.
	public LinkedList() {
		head = null;
	}

	// inserting data at the end
	public boolean insert(int data) {

		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}

		// inserting first element if the head is null
		if (head == null) {
			head = newNode;
			return true;
		}

		Node temp = head;
		// validation - no duplicate element
		if (head.getData() == data) {
			return false;
		}

		while (temp.getNext() != null) {
			temp = temp.getNext();
			if (temp.getData() == data) {
				return false;
			}
		}

		temp.setNext(newNode);
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

	// inserting element at particular position
	public boolean insert(int data, int position) {
		if (position <= 0 || (head == null && position > 1)) {
			return false;
		}

		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}

		if (position == 1) {
			newNode.setNext(head);
			head = newNode;
			return true;
		}

		// locate previous node
		Node prev = head;
		for (int i = 1; i < position - 1; i++) {
			prev = prev.getNext();
			if (prev == null) {
				return false;
			}
		}

		newNode.setNext(prev.getNext());
		prev.setNext(newNode);

		return true;
	}

	public boolean deleteByVal(int data) {
		if (head == null) {
			return false;
		}

		if (head.getData() == data) {
			head = head.getNext();
			return true;
		}

		Node prev = head;
		Node del = head;

		while (del.getData() != data) {
			prev = del;
			del = del.getNext();
			if (del == null) {
				return false;
			}
		}
		prev.setNext(del.getNext());
		return true;
	}

	public boolean deleteByPosition(int position) {
		if (position <= 0 || head == null && position > 1) {
			return false;
		}

		if (position == 1) {
			if (head == null) {
				return false;
			}
			head = head.getNext();
			return true;
		}

		Node del = head;
		Node prev = head;
		for (int i = 1; i < position - 1; i++) {
			prev = prev.getNext();
			if (prev == null) {
				return false;
			}
		}
		del = prev.getNext();
		prev.setNext(del.getNext());
		return true;
	}

	public void displayReverse() {
		Stack<Node> stack = new Stack();
		Node temp = head;
		while (temp != null) {
			stack.push(temp);
			temp = temp.getNext();
		}
		while (!stack.isEmpty()) {
			System.out.print(stack.pop().getData() + " ");
		}
		System.out.println();
	}

	public void displayReverseRecursion(Node temp) {
		if (temp == null) {
			return;
		}
		temp = temp.getNext();
		displayReverseRecursion(temp);
		System.out.println(temp.getNext() + " ");
	}

	public void reverse() {
		if (head == null || head.getNext() == null) {
			return;
		}

		Node n1 = head;
		Node n2 = head.getNext();
		while (n2 != null) {
			Node n3 = n2.getNext();
			n2.setNext(n1);
			n1 = n2;
			n2 = n3;
		}
		head.setNext(null);
		head = n1;
	}

	public void bubbleSort() {
		if (head == null) {
			return;
		}
		int count = 0;
		Node temp = head;
		while (temp != null) {
			temp = temp.getNext();
			count++;
		}
		for (int i = 0; i < count - 1; i++) {
			Node curr = head;
			while (curr.getNext() != null) {
				if (curr.getData() > curr.getNext().getData()) {
					int swap = curr.getData();
					curr.setData(curr.getNext().getData());
					curr.getNext().setData(swap);
				}
				curr = curr.getNext();
			}
		}
	}
	
	public boolean maxEle() {
		if(head==null) {
			return false;
		}
		
		int max=head.getData();
		Node temp=head.getNext();
		while(temp!=null) {
			if(max<temp.getData()) {
				max=temp.getData();
			}
			temp=temp.getNext();
		}
		System.out.println("Max Element: "+max);
		return true;
		
	}
}
