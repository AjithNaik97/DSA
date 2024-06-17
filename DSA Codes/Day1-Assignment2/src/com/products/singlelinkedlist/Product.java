package com.products.singlelinkedlist;

public class Product {
	private int id;
	private String name;
	private int qty;
	private double price;
	
	public Product(int id, String name, int qty, double price) {
		super();
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", qty=" + qty + ", price=" + price + "]";
	}
	
	
	

}
