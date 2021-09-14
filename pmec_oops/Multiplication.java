package pmec_oops;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Display table upto: ");
		int n=0;
		double d = sc.nextDouble();
		float f = sc.nextFloat();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=10;j++)
			{
//				System.out.println(i+" X "+j+" = "+(i*j));
			}
			System.out.println();
		}
		System.out.println(d);
		System.out.println(f);

	}

}
