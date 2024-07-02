package com.search.linkedlist;

public class LinkedList {
	private Node head;
	
	public LinkedList() {
		this.head=null;
	}
	
	public boolean insert(int data) {
		Node newNode=new Node(data);
		
		if(head==null) {
			head=newNode;
			return true;
		}
		
		Node temp = head;
		while(temp.getNext()!=null) {
			temp=temp.getNext();
		}
		temp.setNext(newNode);
		return true;
	}
	
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
		System.out.println();
	}
	
	public boolean binarySearch(int data) {
		
	}
	
	
}
