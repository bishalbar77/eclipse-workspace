package bestsolutions;

import java.util.Scanner;

public class Divisible {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int div=0, n=0, count=0, temp=0, temp2=0, val=0;
		div = sc.nextInt();
		n= sc.nextInt();
		for(int i=0;i<div;i++)
		{
			if(i%n==0 && i/10==0)
			{
				count++;
			}
			else
			{
				if(i/10!=0)
				{
					temp = i/10;
					temp2 = i%10;
					val = temp + temp2;
					if(val%n==0)
					{
						count++;
					}
				}
			}
			
		}
		System.out.println(count);
	}

}
