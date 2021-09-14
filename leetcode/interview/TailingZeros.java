package leetcode.interview;

import java.util.Scanner;

public class TailingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(trailingZeroes(n));
	}

	private static int trailingZeroes(int n) {
		// TODO Auto-generated method stub
		int count=0;
		/* The number of zeros of a factorial depend upon 
		 * the number of 5 multiple
		 * 10! = 3628800  -- 2 multiple of 5
		 * 13! = 6227020800  -- 2 multiple of 5
		 * 8!  = 40320    -- 1 multiple of 5
		 * Time complexity - log n base 5*/
		while(n > 0) {
			n/=5;
			count +=n;
		}
		return count;
	}

}
