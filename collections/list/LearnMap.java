package collections.list;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {

	public static void main(String[] args) {

		/* HashMap are not sorted by default
		 * Insertion Order not maintained in HashMap
		 * Time complexity of CRUD O(1)  */
		
		Map<String, Integer> map = new HashMap<>();
		map.put("Bar", 7);
		map.put("Bishal", 2);
		map.put("Rachana", 3);
		map.put("Rachana", 3);
		map.put("Rachana", 3);
		map.put("Sai", 3);
		map.putIfAbsent("Barry", 77);
		
		if(!map.containsKey("Bar")) {
			map.put("Bar", 7);
		}
		System.out.println(map);
		
		for(Map.Entry<String, Integer> e: map.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			System.out.println(e);
			System.out.println();
		}
		
		for(String i: map.keySet()) {
			System.out.println(i);
		}
		
		for(Integer i: map.values()) {
			System.out.println(i);
		}
		System.out.println(map.containsKey("Bar"));
		System.out.println(map.containsValue(7));
		map.clear();
		System.out.println(map);
		
		
		/* Tree Map are sorted by default
		 * Time complexity of CRUD O(log n)  */
		System.out.println();
		System.out.println("---------TreeMap-----------");
		System.out.println();
		
		Map<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("Bar", 7);
		treeMap.put("Aishal", 2);
		treeMap.put("Cachana", 3);
		treeMap.put("Arachana", 3);
		treeMap.put("Rachana", 3);
		treeMap.put("Sai", 3);
		treeMap.putIfAbsent("Barry", 77);
		
		if(!treeMap.containsKey("Bar")) {
			treeMap.put("Bar", 7);
		}
		System.out.println(treeMap);
		
	}

}
