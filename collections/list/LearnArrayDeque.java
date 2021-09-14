package collections.list;

import java.util.ArrayDeque;

public class LearnArrayDeque {

	public static void main(String[] args) {
		
		/*
		 * Unlike queue it can add and delete elements
		 * from both the side */
		
		ArrayDeque<Integer> ad = new ArrayDeque<>(); // default implement queue
		ad.offer(1);
		ad.offerFirst(2);
		ad.offerLast(3);
		ad.offer(4);
		ad.addFirst(5);
		System.out.println(ad);

		System.out.println(ad.peek());
		System.out.println(ad.peekFirst());
		System.out.println(ad.peekLast());

		System.out.println(ad.poll());
		System.out.println(ad.pollFirst());
		System.out.println(ad.pollLast());

		System.out.println(ad.pop());	// It also contains properties Stack
		ad.push(6);

		System.out.println(ad);

	}

}
