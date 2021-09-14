package hackerrank;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		 	Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String b="";
	        for(int i = A.length() - 1; i >= 0; i--)
	        {
	            b = b + A.charAt(i);
	        }
	        if(A.equalsIgnoreCase(b)) {
	            System.out.print("Yes");
	        } else {
	            System.out.print("No");
	        }

	}

}
