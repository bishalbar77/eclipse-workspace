package interview;

import java.util.Scanner;

public class SalesRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		saleGroup(n);
	}

	private static void saleGroup(int n) {
		// TODO Auto-generated method stub
		if(n >= 30 && n<=50)
			System.out.println("D");
		else if(n >= 51 && n<=60)
			System.out.println("C");
		else if(n >= 61 && n<=80)
			System.out.println("B");
		else if(n >= 81 && n<=100)
			System.out.println("A");
		
	}

}
