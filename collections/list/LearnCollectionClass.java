package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(5);
		list.add(82);
		list.add(12);
		list.add(562);
		list.add(55);
		list.add(77);
		list.add(7);
		System.out.println("min element = "+Collections.min(list));
		System.out.println("max element = "+Collections.max(list));
		System.out.println("frequency of element 12 = "+Collections.frequency(list, 12));
		
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println(list);
		
		// Custom class sorting
		List<StudentSet> student = new ArrayList<>();
		student.add(new StudentSet("Bar", 7));
		student.add(new StudentSet("Vicky", 77));
		student.add(new StudentSet("Woney", 17));
		
		// In order for this to work, StudentSet Class need to implement comparable
		Collections.sort(student);
		StudentSet s1 = new StudentSet("Himan", 77);
		StudentSet s2 = new StudentSet("Harpreet", 12);
		// s1 is this and s2 is that
		System.out.println(s1.compareTo(s2));
		
		Collections.sort(student);
		System.out.println(student);
	}

}
