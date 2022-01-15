package leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isHappy(19));
	}
	public static boolean isHappy(int n) {
		Set<Integer> visited = new HashSet<>();
		while(visited.add(n)) {
			if(n == 1) return true;
			n = sqaureSum(n);
		}
		return false;
        
    }
	
	public static int sqaureSum(int n) {
		int sum = 0;
		while(n > 0) {
			int last = n % 10;
			sum += (last * last);
			n = n/10;
		}
		return sum;
	}
}
