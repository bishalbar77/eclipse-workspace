package lits;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayLists {
	
	public static void main(String args[])
	{
		// This all functions are similar for linkedList also
		ArrayList<String> fruits =new ArrayList<String>();                  //without generic
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Straw");
		System.out.println(fruits);
		System.out.println(fruits.get(1));
		System.out.println(fruits.set(2, "CHicken"));        //it will return the removed element
		fruits.remove(1);
//		fruits.clear();
		List<String> toRemove = new ArrayList<>();
		toRemove.add("Apple");
		toRemove.add("Mutton");
		fruits.removeAll(toRemove);
		
		System.out.println(fruits.size());
		System.out.println(fruits.contains("CHicken"));
		System.out.println(fruits.isEmpty());
		
		Object a[] = fruits.toArray();
		
		System.out.println(a);
		System.out.println(fruits);
		
		//String ke case me
		String v[] = new String[fruits.size()];
		fruits.toArray(v);
		
		for(String e: v)
		System.out.println("In String array:- "+e);
		
		
		
		
		
//		List<String> veggie = new LinkedList<String>();
//		veggie.add("Potato");
//		veggie.add("Totato");
//		veggie.add("Lotato");
		
//		fruits.addAll(veggie);
//		ArrayList<String> fruits =new ArrayList<String>();  // with generic
//		fruits.add("Apple");
		
//		System.out.println(veggie);
//		ArrayList<Integer> marks = new ArrayList<Integer>();
		
//		PAir<String, Integer> ob = new PAir();      //generic
		
	}

}
