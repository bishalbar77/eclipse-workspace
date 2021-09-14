package collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class LearnArrayList {

	public static void main(String[] args) {
		// Time complexity of remove and add is O(n)
		//One way of creation
		ArrayList<String> students = new ArrayList<>();
		students.add("Bar");
		students.add("Jerry");
		
		//2nd way of creation
		List<String> teachers = new ArrayList<>();
		teachers.add("Jane");
		teachers.add("John");
		teachers.add(1, "Mary"); // add at a particular index
		teachers.addAll(students); // add a list to another list
		teachers.get(2);
		teachers.remove(2); // remove at particular index
		teachers.remove(String.valueOf("Mary")); // remove a particular value
		teachers.set(0, "Bishal");
		System.out.println(teachers.contains("Bar"));
		System.out.println(teachers.size());
		
		System.out.println(teachers); // By default invokes teachers.toString
		
		//Iterator in collection
		Iterator<String> it = teachers.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
