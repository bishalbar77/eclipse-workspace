package leetcode.aprilchallenge;

import java.util.Scanner;

public class LongestValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(validParentheses(str));
	}

	private static int validParentheses(String str) {
		// TODO Auto-generated method stub
		int start, end;
		int count=0;
		for(int i=1; i<str.length();i++) {
			start = str.charAt(i-1);
			for(int j=i;j<str.length();j++) {
				
			}
			end = str.charAt(i);
			if(start==40 && end==41) {
				count++;
			}
		}
			
		return count;
	}

}
