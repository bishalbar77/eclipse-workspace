package collections.list;

import java.util.HashSet;
import java.util.Set;

public class CustomSetNonPrimitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<StudentSet> student = new HashSet<>();
		student.add(new StudentSet("Bishal", 07));
		student.add(new StudentSet("Barsha", 04));
		student.add(new StudentSet("Bar", 11));
		student.add(new StudentSet("Rachu", 11));
		System.out.println(student);
		
		StudentSet s1 = new StudentSet("Himan", 12);
		StudentSet s2 = new StudentSet("Harpreet", 12);
		System.out.print(s1.equals(s2));
	}

}
