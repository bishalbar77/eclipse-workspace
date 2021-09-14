package search;

import java.util.Arrays;
import java.util.Scanner;

public class Plot {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int area[]= new int[n];
		int cost[]= new int[n];
		int copy[]= new int[n];
		int cp=0,temp=0, mp=0;
		for(int i=0;i<n;i++)
		{
			area[i] = sc.nextInt();
		}
		for(int j=0;j<n;j++)
		{
			cost[j] = sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			copy[i] = area[i];
		}
		Arrays.sort(area);
		for(int i=1;i<n;i++)
		{
			temp = area[i-1] + area [i];
			mp = mp + temp;
		}
		for(int j=0;j<n;j++)
		{
			temp = copy[j] * cost[j];
			cp = cp + temp;
		}
		System.out.println(mp);
		if(mp<cp)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}
