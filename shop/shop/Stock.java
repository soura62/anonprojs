package project.shop;

public class Stock {
	public static int sc=0;
	public static int pc=0;
	void createShirt(Product [] p,double price, BrandName brandName, Color color) {
		p[0][0][sc++]=new Shirt(price,brandName,color);
	}
	public static void main(String[] args) {
		Product [][][] p=new Product[3][3][3];
	    p[0][0]=new Clothing[2];
	}

}
