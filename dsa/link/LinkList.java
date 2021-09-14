package dsa.link;

import java.util.*;


public class LinkList {
	public static void main(String[] args)
	{
		List<Integer> a = new LinkedList<>();
		List<Integer> b = new ArrayList<>();
//		a.add(12);
//		a.add(54);
//		a.add(75);
//		a.addAll(a);
//		a.toArray();
//		a.set(2, 77);
//		System.out.println(a.get(3));
//		System.out.println(a.size());
//		System.out.println(a);
		TimeComplex(a);
		TimeComplex(b);
		
	}
	static void TimeComplex(List<Integer> list)
	{
		long start = System.currentTimeMillis();
		for(int i =0; i<100000; i++)
		{
			list.add(0, i);
		}
		long end = System.currentTimeMillis();
		System.out.println(list.getClass().getName()+ "--->" +(end-start));
	}

}
