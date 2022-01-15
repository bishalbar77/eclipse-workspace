package arrays;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int array[] = new int[5];
//		array[4] = 10;
//		System.out.println(array[4]);
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(50);
		arr.add(74);
		arr.add(85);
		arr.add(90);
		arr.add(100);
//		System.out.println(arr);
		
		ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>();
		array.add(arr);
		array.add(arr);
//		System.out.println(array);
		
		ArrayList<ArrayList<ArrayList<Integer>>> array3d = new ArrayList<ArrayList<ArrayList<Integer>>>();
		array3d.add(array);
		System.out.println(array3d);
		
	}

}
