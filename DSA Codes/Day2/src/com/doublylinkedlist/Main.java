package com.doublylinkedlist;

public class Main {

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insert(10);
		dll.insert(20);
		dll.insert(60);

		dll.display();

		dll.insert(30, 2);
		System.out.println();
		dll.display();
	}
}
