package stringtest;

import java.util.Scanner;

public class StringBuffReverse {
	
	public static void main(String args[]) 
    { 
        Scanner sc = new Scanner(System.in);
        StringBuffer sbf = new StringBuffer(sc.nextLine()); 
        System.out.println("String buffer before reversing = " + sbf); 
        sbf.reverse(); 
        System.out.println("String buffer after reversing = " + sbf); 
    }
}
