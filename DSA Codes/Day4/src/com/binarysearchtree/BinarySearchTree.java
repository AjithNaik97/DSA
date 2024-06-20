package com.binarysearchtree;

import java.util.Stack;

public class BinarySearchTree {
	private Node root;

	public BinarySearchTree() {
		root = null;
	}

	public boolean insert(int data) {
		Node newNode = new Node(data);
		if (root == null) {
			root = newNode;
			return true;
		}

		Node temp = root;

		while (true) {
			if (data == root.getData()) {
				return false;
			}

			if (data < temp.getData()) {
				// insert to left
				// check if temp has left child or not
				if (temp.getLeft() == null) {
					// temp does not have a left child, so newnode will become left child of temp
					// node
					temp.setLeft(newNode);
					return true;
				}
				// if temp has a left child, then shift temp to it's left and continue
				temp = temp.getLeft();
			} else {
				// insert to right
				// check if temp has a right child
				if (temp.getRight() == null) {
					// temp does not have a right child, so newnode becomes the right child of temp
					// node
					temp.setRight(newNode);
					return true;
				}
				// temp has a right child, so shift to the right of temp and continue
				temp = temp.getRight();
			}
		}
	}

	public void preOrder() {
		System.out.println("Preorder : ");

		Node temp = root;
		Stack<Node> stack = new Stack<Node>();

		while (temp != null || !stack.isEmpty()) {
			while (temp != null) {
				System.out.println(temp.getData() + " ");
				stack.push(temp);
				temp = temp.getLeft();
			}
			temp = stack.pop().getRight();
		}
		System.out.println();
	}

	public void inOrder() {
		Node temp = root;
		Stack<Node> stack = new Stack<Node>();
		System.out.println("InOrder: ");
		while (temp != null || !stack.isEmpty()) {
			while (temp != null) {
				stack.push(temp);
				temp = temp.getLeft();
			}
			temp = stack.pop();
			System.out.println(temp.getData() + " ");
			temp = temp.getRight();
		}
		System.out.println();
	}

	public void postOrder() {

		System.out.println("Post Order : ");
		class Pair {
			Node node;
			char flag;

			public Pair(Node node, char flag) {
				this.node = node;
				this.flag = flag;
			}
		}
		Stack<Pair> stack = new Stack<>();
		Node temp = root;

		while (temp != null || !stack.isEmpty()) {
			while (temp != null) {
				stack.push(new Pair(temp, 'L'));
				temp = temp.getLeft();
			}
			Pair pair = stack.pop();
			if (pair.flag == 'L') {
				temp = pair.node.getRight();
				pair.flag = 'R';
				stack.push(pair);
			} else {
				System.out.println(pair.node.getData() + " ");
			}

		}
		System.out.println();
	}
}
