package arrays;

import java.util.Scanner;

public class ArrayBasic {
	public static void main(String[] args)
	{
		Scanner sc=  new Scanner(System.in);
		System.out.println("NO. of values");
		int n = sc.nextInt();
		int a[]= new int[n];
		for(int i=0; i<n;i++)
		{
			System.out.print(" ");
			a[i] = sc.nextInt();
		
		}
		for(int e =0;e<n;e++)
		{
		System.out.print(a[e]+ " ");
	}}

}
