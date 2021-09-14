package random;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number whose table you want to print : ");
		int num = sc.nextInt();
		table(num);

	}

	private static void table(int num) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" X "+i+" = "+(num*i));
		}
		
	}

}
