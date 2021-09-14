package bestsolutions;

import java.util.*;
public class StringCheat 
{
	public static void main(String args[])
	{
		String str;
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		for(int i=0;i<=b;i++)
		{
			str=sc.nextLine();
			int n=str.length();
			if(i>0)
			{
				System.out.println(n);
			}
		}
	}
}