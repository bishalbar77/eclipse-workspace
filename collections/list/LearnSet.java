package collections.list;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* No duplicates elements are allowed in set 
		 * Insertion Order not maintained in HashSet
		 * Time complexity of CRUD O(1) */
		
		Set<Integer> set = new HashSet<>();
		set.add(11);
		set.add(23);
		set.add(32);
		set.add(64);
		set.add(43);
		set.add(52);
		set.add(43);	// 1st duplicate
		set.add(52);	// 2nd duplicate
		System.out.println(set);
		System.out.println(set.contains(32)); // Check if value exists
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		set.clear();
		System.out.println(set);
		
		
		/* Insertion Order maintained in LinkedHashSet
		 * Time complexity of CRUD O(1) */
		
		Set<Integer> linkedSet = new LinkedHashSet<>();
		linkedSet.add(11);
		linkedSet.add(23);
		linkedSet.add(32);
		linkedSet.add(64);
		linkedSet.add(43);
		linkedSet.add(52);
		linkedSet.add(43);	// 1st duplicate
		linkedSet.add(52);	// 2nd duplicate
		System.out.println(linkedSet);
		System.out.println(linkedSet.contains(32)); // Check if value exists
		System.out.println(linkedSet.isEmpty());
		System.out.println(linkedSet.size());
		linkedSet.clear();
		System.out.println(linkedSet);
		
		/* By default the set is sorted in TreeSet
		 * Time complexity of CRUD O(log n) */
		
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(11);
		treeSet.add(23);
		treeSet.add(32);
		treeSet.add(64);
		treeSet.add(43);
		treeSet.add(52);
		treeSet.add(43);	// 1st duplicate
		treeSet.add(52);	// 2nd duplicate
		System.out.println(treeSet);
		System.out.println(treeSet.contains(32)); // Check if value exists
		System.out.println(treeSet.isEmpty());
		System.out.println(treeSet.size());
		treeSet.clear();
		System.out.println(treeSet);
		
	}

}
