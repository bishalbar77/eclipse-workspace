package pmec_oops;

import java.util.Scanner;

public class Scan {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a>b && a>c)
			System.out.println("Through scanner class, greatest number is a = "+a);
		else if(b>c)
			System.out.println("Through scanner class, greatest number b= "+b);
		else
			System.out.println("Through scanner class, greatest number is c= "+c);
	}
}
