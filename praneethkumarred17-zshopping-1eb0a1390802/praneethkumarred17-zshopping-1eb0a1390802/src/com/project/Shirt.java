package com.project;

public class Shirt extends Clothing{

	
	String size;
	
	
	@Override
	public void buy() {
		System.out.println(getQuantity());
		this.setQuantity(this.getQuantity()-1);
		System.out.println(this.getQuantity());
		
		
		
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Shirt(int id, int quantity, String name, String category, double price, String genderClothing,
			String typeofClothing, String size) {
		super(id, quantity, name, category, price, genderClothing, typeofClothing);
		this.size = size;
	}

	@Override
	public void update() {
		
		
		// TODO Auto-generated method stub
		System.out.println("shirt is updated");
	}

	@Override
	public void returnProduct() {
		// TODO Auto-generated method stub
		System.out.println("shirt is retured");
	}

}
