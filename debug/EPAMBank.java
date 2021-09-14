package debug;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class EPAMBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int p = scn.nextInt();
		int num[] = new int[n];
		int result = 0;
		for(int i = 0 ; i < n; i++) {
			num[i] = scn.nextInt();
			addNum(num[i]);
		}
		for(int i = 0 ; i < n; i++) {
			result += num[i];
		}
		
		System.out.println(result);
	}
	private static PriorityQueue<Integer> small = new PriorityQueue<>(Collections.reverseOrder());
	private static PriorityQueue<Integer> large = new PriorityQueue<>();
	private static boolean even = true;

	public double findMedian() {
	    if (even)
	        return (small.peek() + large.peek()) / 2.0;
	    else
	        return small.peek();
	}

	public static void addNum(int num) {
	    if (even) {
	        large.offer(num);
	        small.offer(large.poll());
	    } else {
	        small.offer(num);
	        large.offer(small.poll());
	    }
	    even = !even;
	}

}
