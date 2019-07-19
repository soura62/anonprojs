package project;

import java.util.Scanner;

public class ShoppingMain {
	static Scanner sc = new Scanner(System.in);
	static int choice;
	public static final String MASTER_KEY = "master";

	public static void main(String[] args) {

		System.out.println(":::::::::::::::::::::Z-Shopping::::::::::::::::::::::::");
		System.out.println("\nWelcome to Z Shopping, an easy shopping solution for Z-Generation and all");

	IntroPage();
	}
	
	
	private static void IntroPage() {
		
		while(true) {
		
		System.out.println("\nPlease enter the type of user");
		System.out.println("1.Customer");
		System.out.println("2.Employee");
		
		choice = Integer.parseInt(sc.next());

		switch (choice) {
		case 1:
			chooseCategory();
			break;
		case 2:
			checkEmployee();
			break;
		case 3:
		     return;	
		default:
			System.out.println("\nPlease enter correct input\n");
			break;

		}
		
		}

	}

	private static void chooseCategory() {
		System.out.println("\nPlease choose your category");
		System.out.println("1.Clothes");
		System.out.println("2.Electronics");

		choice = Integer.parseInt(sc.next());

		switch (choice) {
		case 1:
			chooseClothes();
			break;
		case 2:
			chooseElectronics();
			break;

		default:
			break;

		}

	}

	private static void chooseElectronics() {

		
		
		
		
		
		
	}

	private static void chooseClothes() {

		
		
		
		
		
		
	}

	private static void checkEmployee() {
		String key;
		System.out.println("\nPlease enter the master key\n");
		key = sc.next();
		if (key.equals(MASTER_KEY)) {
			System.out.println("Credentials are right ! Welcome Employee");
		} else {
			System.out.println("Please enter correct credentials");
			checkEmployee();
		}

	}

}
