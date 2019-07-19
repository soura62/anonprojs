package project.shop;

public class Shirt extends Clothing {
	public Shirt(double price, BrandName brandName, Color color) {
		super(price);
		this.brandName = brandName;
		this.color = color;
	}
	BrandName brandName;
	Color color;
	
	
	

}
