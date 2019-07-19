package com.project;

public abstract class Product {

    private int id;
	
	private int quantity;
	private String name;
	private String category;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public Product(int id, int quantity, String name, String category, double price) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.name = name;
		this.category = category;
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	double price;

	public abstract void buy();

	public abstract void update();

	public abstract void returnProduct();

}
