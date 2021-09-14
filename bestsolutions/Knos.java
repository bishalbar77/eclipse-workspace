package bestsolutions;

import java.util.Scanner;

public class Knos {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int div=0, count=1;
		div = sc.nextInt();
		int n[]= new int[div];
		for(int i=0;i<div;i++)
		{
			n[i]=sc.nextInt();
		}
		for(int i=0;i<div;i++)
		{
			if(i != div-1)
			{
				if(n[i]==0 & n[i+1]!=0)
				{
					count++;
				}
				else if(n[i]==0 & n[i+1]==0)
				{
					count++;
					i++;
				}
			}
			else
			{
				if(n[i]==0)
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
