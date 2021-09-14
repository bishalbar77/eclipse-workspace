package pmec_oops;

import java.util.Scanner;

public class Bitwise {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Bitwise & value:-"+(a&b));
		System.out.println("Bitwise | value:-"+(a|b));
		System.out.println("Bitwise ^ value:-"+(a^b));
		System.out.println("Bitwise ~ value:-"+(~a));
		System.out.println("Bitwise ~ value:-"+(a>>2));
		System.out.println("Bitwise ~ value:-"+(a<<2));
	}
}