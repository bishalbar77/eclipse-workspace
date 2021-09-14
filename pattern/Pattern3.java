package pattern;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner B = new Scanner(System.in);
		System.out.println("Enter no. of lines");
		int n = B.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=n;j<i;j--)
			{
				System.out.print("  ");
			}
			for(int j=1;j>i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
