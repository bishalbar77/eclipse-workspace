package hackerrank;

import java.util.Scanner;

public class Birthday {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] choco = new int[n];
		int temp = 0, count=0;
		boolean found = false;
		for(int i = 0 ; i < n ; i++)
		{
			choco[i] = sc.nextInt();
		}
		sc.nextLine();
		String ThirdLine = sc.nextLine();
		String[] tokens = ThirdLine.split(" ");
		int day = Integer.parseInt(tokens[0]);
		int month = Integer.parseInt(tokens[1]);
		if(n==1)
		{
			found = true;
			count++;
		}
		for(int i=0;i<n-1;i++)
		{
				temp=choco[i]+choco[i+1];
			if(temp==day)
			{	
				found = true;
				count++;
			}
		}
		if(found)
		System.out.println(count);
		else
			System.out.println(0);
	}
}
