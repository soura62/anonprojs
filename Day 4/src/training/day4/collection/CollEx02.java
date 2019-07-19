package training.day4.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollEx02 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list1 = new ArrayList<String>();
	list.add("Hello");
	list.add("Mayur");
	list.add("Sai");
	System.out.println("After Adding ->Size:"+ list.size());
	for(String temp : list) {
		System.out.println(temp);
	}
	System.out.println("------------------------");
	Iterator<String> itr = list.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("-----------------------");
	
	for(int i=0; i<2; i++) {
		list1.add(list.get(i));
	}
	
	for(String temp : list1) {
		System.out.println(temp); }

	

	}
}
