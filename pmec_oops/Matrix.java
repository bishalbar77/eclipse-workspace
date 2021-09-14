package pmec_oops;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		matrix(num);
	}

	private static void matrix(int num) {
		// TODO Auto-generated method stub
		for (int i = 0; i < num; i++) 
		{
	         for (int j = 0; j < num; j++) 
	         { 
	            System.out.print(num + " ");
	         }
	         System.out.println();
	    }
		
	}

}
