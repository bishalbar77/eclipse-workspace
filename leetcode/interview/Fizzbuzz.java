package leetcode.interview;

import java.util.Scanner;

public class Fizzbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int str = sc.nextInt();
		String[] list = new String[str];
		list = fizzBuzz(str);
		for(String i : list) {
			System.out.println(i);
		}
	}

	private static String[] fizzBuzz(int str) {
		// TODO Auto-generated method stub
		String[] list = new String[str];
		for(int i=1;i<=str;i++) {
			if(i%3==0 && i%5==0) {
				list[i-1] = "FizzBuzz";
			} else if(i%3==0) {
				list[i-1] = "Fizz";
			} else if(i%5==0) {
				list[i-1] = "Buzz";
			} else {
				list[i-1] = Integer.toString(i);
			}
		}
		return list;
	}

}
