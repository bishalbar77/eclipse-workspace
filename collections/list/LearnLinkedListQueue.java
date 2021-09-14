package collections.list;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(12);
		queue.offer(54);
		queue.offer(22);
		queue.offer(82);				   // To add an element return false if operation fails
		queue.add(77);					   // Same as offer to add but return exception
		System.out.println(queue);
		System.out.println(queue.poll());  // To remove from front return false if operation fails
		System.out.println(queue.remove());// Same as poll to remove but return exception but with value
		System.out.println(queue.peek());  // To check the front
		System.out.println(queue.element());  // To check the front
		System.out.println(queue);
	}

}
