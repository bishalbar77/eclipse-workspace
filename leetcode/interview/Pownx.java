package leetcode.interview;

import java.util.Scanner;

public class Pownx {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		int n = sc.nextInt();
		System.out.println(myPow(x, n));
	}
	    public static double myPow(double x, int n) {
	        double ans = 1;
	        long num = n;
	        if(n < 0) {
	                num = -1 * num;
	        } 
	        while(num > 0) {
	                if(num%2 ==0) {
	                        x = x * x;
	                        num = num / 2;
	                } else {
	                        ans = ans * x;
	                        num = num-1;
	                }
	        }
	        if(n < 0) {
	                return 1.0/(double)ans;
	        } else {
	                return ans;
	        }
	    }
}
