package training.day2;

import java.util.Arrays;

public class NameSort {
	public static void main(String[] args) {
		String[] names = {"Praneeth", "Himanshu", "Anurag", "Udit", "Saurajit"};
		for(String temp : names) {
			System.out.println(temp);
		}
		Arrays.sort(names);
		System.out.println("---------------------------------");
		for(String temp : names) {
			System.out.println(temp);
		}
	}
}
