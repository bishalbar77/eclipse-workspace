package collections.list;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {

	public static void main(String[] args) {
//		PriorityQueue<Integer> pq = new PriorityQueue<>();  // default min heap
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // Working on max heap now 
		pq.offer(40);
		pq.offer(23);
		pq.offer(78);
		pq.offer(12);
		pq.offer(59);
		pq.offer(15);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.peek());
	}

}
