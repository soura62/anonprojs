package project.shop;

public class Pant extends Clothing {

	public Pant(double price, String size, double price2, BrandName brandName, Color color) {
		super(price);
		this.size = size;
		price = price2;
		this.brandName = brandName;
		this.color = color;
	}
	String size;
	double price;
	BrandName brandName;
	Color color;
}
