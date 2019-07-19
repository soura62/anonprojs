package training.day4.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollEx07 {
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put("Harry", 3000);
		map.put("Sid", 3000);
		map.put("Hari", 4000);
		System.out.println(map.get("Harry"));
		Set entrySet = map.entrySet();
		Iterator itr = entrySet.iterator();
		
		while(itr.hasNext()) {
			Map.Entry temp = (Entry) itr.next();
			System.out.println("Key is "+temp.getKey()+", value is"+temp.getValue());
		}
	}
}
